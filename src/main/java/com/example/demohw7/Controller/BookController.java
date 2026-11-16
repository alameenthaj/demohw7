package com.example.demohw7.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demohw7.Model.BookModel;
import com.example.demohw7.Repository.BookRepository;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/book-form")
    public String showForm(Model model) {

        model.addAttribute("book", new BookModel());

        return "book-form";
    }

    @PostMapping("/save-book")
    public String saveBook(BookModel book) {

        bookRepository.save(book);

        return "redirect:/book-list";
    }

    @GetMapping("/book-list")
    public String showBooks(Model model) {

        model.addAttribute("books", bookRepository.findAll());

        return "book-list";
    }
}