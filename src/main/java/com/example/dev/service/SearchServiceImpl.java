package com.example.dev.service;

import com.example.dev.dao.SearchDao;
import com.example.dev.dto.SearchRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SearchServiceImpl implements SearchService{

    @Autowired
    private SearchDao searchDao;


    public List<Map<String,Object>> search (SearchRequestDto searchRequestDto) {

        List<Map<String,Object>> list = searchDao.search(searchRequestDto);

        return list;
    }
}
