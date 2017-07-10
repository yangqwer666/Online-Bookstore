package com.heitian.ssm.dao;

import com.heitian.ssm.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {

    List<Book> selectAllBook();
    List<Book> selectAllBookCN();

    void updateBookStock(Long bid,int quan);
    void updateBookCNStock(Long bid, int quan);

}
