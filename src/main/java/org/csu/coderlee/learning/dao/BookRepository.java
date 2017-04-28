package org.csu.coderlee.learning.dao;

import org.csu.coderlee.learning.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by csucoderlee on 2017 04 27 下午5:33.
 */
@Controller
public interface BookRepository extends JpaRepository<Book, Long>{

    List<Book> findByReader(String reader);

    Book findById(Long id);

    Book save(Book book);


//    List<Book> findByIds(List<Long> ids);
}
