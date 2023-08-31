package com.example.dev.mapper;

import com.example.dev.dto.SearchRequestDto;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;


@Mapper
@Repository
public interface SearchMapper {

    List<Map<String,Object>>  search (SearchRequestDto searchRequestDto);
}
