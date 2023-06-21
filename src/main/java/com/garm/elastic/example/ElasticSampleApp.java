package com.garm.elastic.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@ComponentScan(value = "com.garm")
@EnableElasticsearchRepositories(basePackages = "com.garm.elastic.example.repository")
@SpringBootApplication
public class ElasticSampleApp {
}
