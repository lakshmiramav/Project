package com.rama.sampleproject.repository;

import com.rama.sampleproject.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}