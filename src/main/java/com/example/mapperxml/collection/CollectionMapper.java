package com.example.mapperxml.collection;

import com.example.mapperxml.bean.Blog;

public interface CollectionMapper {

    /**
     * 嵌套 select
     * @param id
     * @return
     */
    Blog selectBlog(int id);


    /**
     * 嵌套结果映射
     * @param id
     * @return
     */
    Blog selectBlog2(int id);

}
