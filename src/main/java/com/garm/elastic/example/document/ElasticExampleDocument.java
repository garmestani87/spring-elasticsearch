
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
public class ElasticExampleDocument {

    @Id
    private String id;

    @JsonProperty("name")
    private String firstname;

    @JsonProperty("lastname")
    private String lastname;

}