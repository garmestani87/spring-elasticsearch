package com.garm.elastic.example.repository;

import com.garm.elastic.example.document.LogRequestDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRequestRepository extends ElasticsearchRepository<LogRequestDocument, String> {
}
