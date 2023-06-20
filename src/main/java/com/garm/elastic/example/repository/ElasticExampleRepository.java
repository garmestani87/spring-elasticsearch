package com.garm.elastic.example.repository;

import com.garm.elastic.example.document.ElasticExampleDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticExampleRepository extends ElasticsearchRepository<ElasticExampleDocument, String> {
}
