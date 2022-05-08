package com.example.minitestweek2.service.book;

import com.example.minitestweek2.model.Book;
import com.example.minitestweek2.model.Category;
import com.example.minitestweek2.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBookService extends IGeneralService<Book> {
    Iterable<Book> findAllByCategory(Category category);
    Page<Book> findAll(Pageable pageable);
    Page<Book> findAllByNameContaining(String name, Pageable pageable);
}
