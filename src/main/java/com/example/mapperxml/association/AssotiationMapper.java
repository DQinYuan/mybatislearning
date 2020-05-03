package com.example.mapperxml.association;

import com.example.mapperxml.bean.Blog;

/**
 * association 的两种用法:
 *  - 嵌套 select 查看 (会产生 N+1 查询 的性能问题)
 *  - 嵌套结果映射
 */
public interface AssotiationMapper {

    /**
     * 嵌套 select 查询
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
