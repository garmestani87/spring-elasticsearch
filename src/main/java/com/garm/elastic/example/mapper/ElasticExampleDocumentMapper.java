package com.garm.elastic.example.mapper;

import com.garm.elastic.example.document.ElasticExampleDocument;
import com.garm.elastic.example.dto.ElasticExampleDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface ElasticExampleDocumentMapper {

    ElasticExampleDocument map(ElasticExampleDto dto);

}
