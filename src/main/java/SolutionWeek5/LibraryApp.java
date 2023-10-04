package SolutionWeek5;

import SolutionWeek5.Book;
import SolutionWeek5.Library;

public class LibraryApp {
    public static void main(String[] args) {

        Book book1 = new Book("Understanding Vision", "Kenneth E. Hagin");
        Book book2 = new Book("Java", "Chuks");
        User user1 = new User("Great");
        User user2 = new User("Chris");
        user2.borrowBook(book1);
        user1.removeFavorite(book2);
        user1.addFavorite(book1);
        user2.returnBook(book1);
        Library li = new Library();
        li.addBook(book1);
        li.removeBook(book2);
        li.addBook(book1);
    }

}
