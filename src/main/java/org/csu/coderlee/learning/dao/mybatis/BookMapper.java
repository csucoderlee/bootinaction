package org.csu.coderlee.learning.dao.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.csu.coderlee.learning.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by csucoderlee on 2017 05 07 下午3:22.
 */

@Mapper
@Repository
public interface BookMapper {

    List<Book> findAll();
}
