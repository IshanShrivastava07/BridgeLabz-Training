package com.bridgelabz.bookshelf;

public class BookshelfMain {
    public static void main(String[] args) {

        BookShelf lib = new BookShelf();

        
        lib.addBook("Fiction", new Book(1, "1984", "George Orwell"));
        lib.addBook("Fiction", new Book(2, "Animal Farm", "George Orwell"));
        lib.addBook("Science", new Book(3, "Brief History of Time", "Stephen Hawking"));

        lib.borrowBook("Fiction", 2);

        lib.display();
    }
}
