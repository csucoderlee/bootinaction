package org.csu.coderlee.learning.controller;

import org.csu.coderlee.learning.dao.BookRepository;
import org.csu.coderlee.learning.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by csucoderlee on 2017 04 27 下午5:41.
 */
@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping(value = "/book/id", method = RequestMethod.GET)
    public Book book(Long id ){
        return bookRepository.findById(id);
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public Book book(@RequestBody Book book){
        return bookRepository.save(book);
    }

}
