package com.example.mapperxml.insert;

import com.example.mapperxml.bean.Author;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InsertMapperTest {

    @Autowired
    InsertMapper insertMapper;

    @Test
    public void testInsertAuthor() {
        Author a1 = new Author();
        a1.setName("Lily");
        insertMapper.insertAuthor(a1);
        System.out.println(a1.getId());
    }

    @Test
    public void testInsertAuthors() {
        List<Author> authors =
                Arrays.asList(
                        new Author() {
                            {
                                setName("JaJa");
                            }
                        },
                        new Author() {
                            {
                                setName("Worker");
                            }
                        }
                );
        insertMapper.insertAuthors(authors);
        System.out.println(authors.get(0).getId());
        System.out.println(authors.get(1).getId());
    }

    @Test
    public void testInsertSelectedKey() {
        Author a1 = new Author();
        a1.setName("Lily");
        insertMapper.insertAuthorSelectKey(a1);
        System.out.println(a1.getId());
    }

}