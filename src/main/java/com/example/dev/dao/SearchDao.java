package com.example.dev.dao;

import com.example.dev.dto.SearchRequestDto;

import java.util.List;
import java.util.Map;

public interface SearchDao {

    List<Map<String,Object>> search (SearchRequestDto searchRequestDto);

}
