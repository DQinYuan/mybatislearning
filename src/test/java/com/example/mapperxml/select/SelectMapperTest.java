package com.example.mapperxml.select;

import com.example.mapperxml.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SelectMapperTest {

    @Autowired
    SelectMapper selectMapper;

    @Test
    public void testSelectPerson() {
        Map<String, String> result = selectMapper.selectPerson(1);
        System.out.println(result);

        // 测试 <cache/> 启动的缓存
        Map<String, String> result2 = selectMapper.selectPerson(1);
        System.out.println(result2);
    }

    @Test
    public void testSelectObj() {
        Person person = selectMapper.selectPersonObj(1);
        System.out.println(person);
    }

    @Test
    public void testSelectAlias() {
        System.out.println(selectMapper.selectPersonProp());
    }
}
