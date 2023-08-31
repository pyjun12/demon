package com.example.dev.controller;

import com.example.dev.dto.SearchRequestDto;
import com.example.dev.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SearchController extends SearchRequestDto {

    @Autowired
    private SearchService searchService;

    @PostMapping("start")
    public ResponseEntity SearchData(@RequestBody SearchRequestDto searchRequestDto) {

        List<Map<String,Object>> result = searchService.search(searchRequestDto);

        return ResponseEntity.ok(result);
    }
}
