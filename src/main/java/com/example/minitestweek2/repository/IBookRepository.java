package com.example.minitestweek2.repository;

import com.example.minitestweek2.model.Book;
import com.example.minitestweek2.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends PagingAndSortingRepository<Book,Long> {
    Iterable<Book> findAllByCategory(Category category);
    Page<Book> findAllByNameContaining(String name, Pageable pageable);

}
