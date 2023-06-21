package com.garm.elastic.example.service;

import com.garm.elastic.example.dto.LogRequestDto;
import com.garm.elastic.example.mapper.LogRequestDocumentMapper;
import com.garm.elastic.example.repository.LogRequestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class LogRequestService {

    private final LogRequestRepository repository;
    private final LogRequestDocumentMapper mapper;

    public void save(LogRequestDto dto) {
        repository.save(mapper.map(dto));
    }

}
