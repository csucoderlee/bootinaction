package org.csu.coderlee.learning.controller;

import org.csu.coderlee.learning.dao.jpa.BookRepository;
import org.csu.coderlee.learning.dao.mybatis.BookMapper;
import org.csu.coderlee.learning.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by csucoderlee on 2017 04 27 下午5:41.
 */
@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookMapper bookMapper;

    @RequestMapping(value = "/book/id", method = RequestMethod.GET)
    public Book book(Long id ){
        return bookRepository.findById(id);
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public Book book(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @RequestMapping(value = "/allbook", method = RequestMethod.GET)
    public Object allbook(){
        return bookMapper.findAll();
    }

}
