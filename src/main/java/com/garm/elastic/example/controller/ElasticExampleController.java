package com.garm.elastic.example.controller;

import com.garm.elastic.example.dto.ElasticExampleDto;
import com.garm.elastic.example.service.ElasticExampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ElasticExampleController {
    private final ElasticExampleService service;

    @PostMapping("/save")
    public void save(@RequestBody ElasticExampleDto dto) {
        service.save(dto);
    }

}