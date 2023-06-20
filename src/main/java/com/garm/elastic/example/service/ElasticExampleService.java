package com.garm.elastic.example.service;

import com.garm.elastic.example.dto.ElasticExampleDto;
import com.garm.elastic.example.mapper.ElasticExampleDocumentMapper;
import com.garm.elastic.example.repository.ElasticExampleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ElasticExampleService {

    private final ElasticExampleRepository repository;
    private final ElasticExampleDocumentMapper mapper;

    public void save(ElasticExampleDto dto) {
        repository.save(mapper.map(dto));
    }

}
