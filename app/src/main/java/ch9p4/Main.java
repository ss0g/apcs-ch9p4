package ch9p4;

import ch9p4.library.Library;
import ch9p4.library.items.*;

// Write an inheritance hierarchy to model items at a library. Include books,
// magazines, journal articles, videos, and electronic media such as CDs. Include
// in a superclass and/or interface common information that the library must have
// for every item, such as a unique identification number and title. Place
// behavior and information that is specific to items, such as a video's runtime
// length or a CD's musical genre, into the subclasses.

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("cool book", "me", "the quick brown fox jumped over the lazy dog");
        CD cd1 = new CD("excellent music", 10000.5);
        
        Library library = new Library(book1, cd1);
        
        System.out.printf("Item 0 title: %s\n", library.getItem(0).getTitle());
        System.out.printf("Item with ID 1 title: %s\n", library.getItemByID(1).getTitle());
    }
}
