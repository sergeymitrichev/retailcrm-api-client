package com.github.sergeymitrichev.retailcrm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.lang.NonNull;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;


public class RetailCrmApiClient {

  private String site;
  private String apiKey;
  private final String VERSION = "v5";
  private final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
  private final RestTemplate restTemplate;

  public RetailCrmApiClient(@NonNull String site, @NonNull String apiKey) {
    this.site = site;
    this.apiKey = apiKey;
    this.restTemplate = new RestTemplate();

    ObjectMapper mapper = new ObjectMapper()
      .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
      .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
      .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)

      .registerModule(new Jdk8Module())
      .registerModule(new JavaTimeModule().addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(
        DateTimeFormatter.ofPattern(DATE_TIME_FORMAT)
      )))

      .setSerializationInclusion(JsonInclude.Include.NON_NULL);

    MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
    converter.setObjectMapper(mapper);

    restTemplate.getMessageConverters().add(0, converter);
  }

  public void setSite(String site) {
    this.site = site;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public <T> ResponseEntity<T> get(String path,
                                   ParameterizedTypeReference<T> requestType, Map<String, ?> params) {

    return restTemplate.exchange(getRequestUrl(path, params), HttpMethod.GET, HttpEntity.EMPTY, requestType);
  }

  public <T> ResponseEntity<T> get(String path,
                                   ParameterizedTypeReference<T> requestType) {

    return get(path, requestType, Map.of());
  }

  public <T> ResponseEntity<T> get(String path,
                                   Class<T> requestType) {

    return get(path, requestType, Map.of());
  }

  public <T> ResponseEntity<T> get(String path,
                                   Class<T> requestType, Map<String, ?> params) {

    return restTemplate.exchange(getRequestUrl(path, params), HttpMethod.GET, HttpEntity.EMPTY, requestType);
  }

  public <T> ResponseEntity<T> post(String path, Class<T> requestType, Map<String, T> requestBody) {
    return restTemplate.exchange(
      getRequestUrl(path),
      HttpMethod.POST, new HttpEntity<>(requestBody),
      requestType
    );
  }

  public <T> ResponseEntity<T> post(
          String path, Class<T> requestType,
          Map<String, T> requestBody,
          Map<String, String> requestParams) {
    return restTemplate.exchange(
            getRequestUrl(path, requestParams),
            HttpMethod.POST, new HttpEntity<>(requestBody),
            requestType
    );
  }

  private String getRequestUrl(String path) {
    return getRequestUrl(path, Map.of());
  }

  private String getRequestUrl(String path, Map<String, ?> params) {
    StringBuilder baseUrl = new StringBuilder(String.format("https://%s/api/%s/%s?apiKey=%s", site, VERSION, path, apiKey));
    if (params != null) {
      params.forEach((k,v) -> baseUrl.append(String.format("&%s=%s", k, v)));
    }
    return baseUrl.toString();
  }
}
