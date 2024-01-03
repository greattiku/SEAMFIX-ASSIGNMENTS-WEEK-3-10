package SolutionWeek6;

import SolutionWeek5.Book;
import SolutionWeek5.Library;
import SolutionWeek5.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LibraryTest {
    @Test
    void deletebook() {
        Book testBook = new Book("java", "chuks");
        User testUser = new User("Ginika");

        Library library = new Library();
        library.addBook(testBook);
        library.removeBook(testBook);
        //assertEquals(testBook, library.removeBook(testBook));

    }

    @Test
    void takeBook() {
        Book tbook = new Book("java", "chuks");
        Book tbook2 = new Book("MyLove", "Chris");

        User tUser = new User("Ginika");
        User tUser2 = new User("Great");

        tUser.returnBook(tbook);
        tUser2.addFavorite(tbook2);

        assertEquals(tbook, tUser.returnBook(tbook));
        assertEquals(tbook2, tUser2.addFavorite(tbook2));
        //Your code may work out even without assert equals but assert equals make sure that what you wrote is really correct.
        // Your code can work, but it's wrong but assert equals look for equality in the code you wrote
        //Try dey use assert Equals
    }

}