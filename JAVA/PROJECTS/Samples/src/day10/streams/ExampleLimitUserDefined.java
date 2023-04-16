package day10.streams;

import java.util.ArrayList;

public class ExampleLimitUserDefined 
{
    public static void main(String[] args) 
    {
        ArrayList<Book> listOfBook = new ArrayList<Book>();
        listOfBook.add(new Book(1011, "Digital", "RRK"));
        listOfBook.add(new Book(1012, "Mathemetics", "LP"));
        listOfBook.add(new Book(1033, "LOC", "PO"));
        listOfBook.add(new Book(1048, "PC", "SK"));
        listOfBook.add(new Book(1050, "Fundamental", "NMM"));
        
        // Set up the limit of elements in Stream
        listOfBook.stream().limit(2).forEach((book) ->
        {
            System.out.println("Id of Book:"+ book.getBookId());
            System.out.println("Name of Book:"+ book.getName());
            System.out.println("Author of Book:"+ book.getAuthorName());
        });    
    }
}


class Book 
{
    int bookId;
    String name;
    String authorName;
    public Book(int bookId, String name, String authorName) 
    {
        this.bookId = bookId;
        this.name = name;
        this.authorName = authorName;
    }
    public int getBookId() 
    {
        return bookId;
    }
    public void setBookId(int bookId) 
    {
        this.bookId = bookId;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
