package com.rama.sampleproject.repository;

import com.rama.sampleproject.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
    
