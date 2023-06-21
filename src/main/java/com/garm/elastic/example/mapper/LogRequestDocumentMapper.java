package com.garm.elastic.example.mapper;

import com.garm.elastic.example.document.LogRequestDocument;
import com.garm.elastic.example.dto.LogRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface LogRequestDocumentMapper {

    LogRequestDocument map(LogRequestDto dto);

}
