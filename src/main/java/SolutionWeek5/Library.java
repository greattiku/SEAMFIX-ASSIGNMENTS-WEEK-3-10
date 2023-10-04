package SolutionWeek5;

import SolutionWeek5.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library(){
       books= new ArrayList<Book>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("the book "+ book.getTitle()+ " authored by " + book.getAuthor() + " has been added to your SolutionWeek5.Library");
    }
    public void removeBook(Book book){
        books.remove(book);
        System.out.println("the book "+ book.getTitle()+ " authored by " + book.getAuthor() + " has been removed from your SolutionWeek5.Library");
    }

    public List<Book> getBooks() {
        return books;
    }
}
