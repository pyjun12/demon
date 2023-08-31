package com.example.dev.service;

import com.example.dev.dto.SearchRequestDto;

import java.util.List;
import java.util.Map;

public interface SearchService {
    List<Map<String,Object>> search (SearchRequestDto searchRequestDto);
}
