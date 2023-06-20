
package com.garm.elastic.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ElasticExampleDto implements Serializable {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String firstname;

    @JsonProperty("lastname")
    private String lastname;

}