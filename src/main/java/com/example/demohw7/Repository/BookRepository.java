package com.example.demohw7.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demohw7.Model.BookModel;

public interface BookRepository extends JpaRepository<BookModel, Integer> {

}