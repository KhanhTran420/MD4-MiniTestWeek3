package com.example.minitestweek2.repository;

import com.example.minitestweek2.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends PagingAndSortingRepository<Category,Long> {
}
