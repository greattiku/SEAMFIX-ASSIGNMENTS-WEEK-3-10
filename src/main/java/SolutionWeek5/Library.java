package SolutionWeek5;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library(){

        this.books= new ArrayList<Book>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("the book "+ book.getTitle()+ " authored by " + book.getAuthor() + " has been added to your SolutionWeek5.Library");
    }
    public Book removeBook(Book book){
       books.remove(book);
        System.out.println("the book "+ book.getTitle()+ " authored by " + book.getAuthor() + " has been removed from your SolutionWeek5.Library");

//        if (book.getTitle().equals("null")){
//            System.out.println("the book "+ book.getTitle()+ " authored by " + book.getAuthor() + " has been checked out or out of stock");
//        }
     return book;
    }

//    public List<Book> getBooks() {
//        return books;
//    }
}
