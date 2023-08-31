package com.example.dev.dao;

import com.example.dev.dto.SearchRequestDto;
import com.example.dev.mapper.SearchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;


@Component
public class SearchDaoImpl implements SearchDao{

    @Autowired
    private SearchMapper searchMapper;


    public List<Map<String,Object>> search (SearchRequestDto searchRequestDto){
        return searchMapper.search(searchRequestDto);
    }
}
