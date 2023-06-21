
package com.garm.elastic.example.document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(indexName = "sample", createIndex = true)
public class LogRequestDocument {

    @Id
    private String id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("clientIp")
    private String clientIp;

    @JsonProperty("requestTime")
    private String requestTime;

    @JsonProperty("requestBody")
    private Object requestBody;

}