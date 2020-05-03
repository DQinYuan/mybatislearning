package com.example.mapperxml.collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CollectionMapperTest {

    @Autowired
    CollectionMapper collectionMapper;

    @Test
    public void testSelectBlog() {
        System.out.println(collectionMapper.selectBlog(1));
    }

    @Test
    public void testSelectBlog2() {
        System.out.println(collectionMapper.selectBlog2(1));
    }

}