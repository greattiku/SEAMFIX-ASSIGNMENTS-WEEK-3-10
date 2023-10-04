package SolutionWeek5;

import SolutionWeek5.Book;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Book> borrowBooks;
    private List<Book> favoriteBooks;

//    public List<SolutionWeek5.Book> getBorrowBooks() {
//        return borrowBooks;
//    }

    public  User(String name){
        this.name=name;
        borrowBooks= new ArrayList<>();
        favoriteBooks=new ArrayList<>();
    }
    public String getName(){
        return name;
    }


   // @Override
    public void borrowBook(Book book) {
        borrowBooks.add(book);
        System.out.println("The book "+ book.getTitle() + " has been borrowed by " + getName());
    }

    //@Override
    public void returnBook(Book book) {
        borrowBooks.remove(book);
        System.out.println("The book "+ book.getTitle() + " has been returned by " + getName());
    }

 public void addFavorite(Book book){
        favoriteBooks.add(book);
     System.out.println("The book "+ book.getTitle() + " authored by " + book.getAuthor() + " has been removed from " + getName() + " favorite books.");
 }



    public void removeFavorite(Book book) {
        favoriteBooks.remove(book);
        System.out.println("The book "+ book.getTitle() + " authored by " + book.getAuthor() + " has been removed from " + getName() + " favorite books.");
    }
}
