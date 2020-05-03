package com.example.mapperxml.select;

import com.example.mapperxml.bean.Author;
import com.example.mapperxml.bean.Blog;
import com.example.mapperxml.bean.Person;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    Map<String, String> selectPerson(int id);

    /**
     * 下划线自动转驼峰需要自动配置
     * @param id
     * @return
     */
    Person selectPersonObj(int id);

    List<Map<String, String>> selectPersonProp();


}
