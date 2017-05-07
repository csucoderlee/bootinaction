package org.csu.coderlee.learning.dao.jpa;

import org.csu.coderlee.learning.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by csucoderlee on 2017 04 27 下午5:33.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

    List<Book> findByReader(String reader);

    Book findById(Long id);

    Book save(Book book);


//    List<Book> findByIds(List<Long> ids);
}
