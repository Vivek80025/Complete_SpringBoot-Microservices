package com.vivek.SpringMVC.controller;

import com.vivek.SpringMVC.dto.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    private List<Book> bookList = new ArrayList<>();

    @GetMapping("/getBooks")
    public String getBooks(Model model){

        //ye data database se aayega.
        //List<Book> bookList = new ArrayList<>();
//        Book book1 = new Book("Fundamental of Java","Vivek Jha");
//        Book book2 = new Book("Let us Java","Rajan Kanaujiya");
//        Book book3 = new Book("Basic of Programming","Bashisht Jha");
//        bookList.add(book1);
//        bookList.add(book2);
//        bookList.add(book3);
        model.addAttribute("books",bookList);
        return "books";
    }

    @PostMapping("/addBook")
    public String addBook(@ModelAttribute Book book){
        bookList.add(book);
        return "redirect:/getBooks";
    }

    @GetMapping("/addBook")
    public String addBook(Model model){
        model.addAttribute("book",new Book());
        return "add-book";
    }
}
