package com.example.mapperxml.insert;

import com.example.mapperxml.bean.Author;

import java.util.List;

public interface InsertMapper {

    void insertAuthor(Author author);

    void insertAuthors(List<Author> authors);

    void insertAuthorSelectKey(Author author);

}
