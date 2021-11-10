package com.feng.service.impl;

import com.feng.dao.BookMapper;
import com.feng.pojo.Books;
import com.feng.service.BookService;

import java.util.List;

/**
 * @author shaoYF
 * @title: BookServiceImpl
 * @projectName ssmbuild
 * @description: TODO
 * @date 2021/10/27 10:36
 */
public class BookServiceImpl implements BookService {

    //调用dao层的操作，设置一个set接口，方便Spring管理
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
