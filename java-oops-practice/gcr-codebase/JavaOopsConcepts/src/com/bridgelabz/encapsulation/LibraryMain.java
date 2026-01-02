package com.bridgelabz.encapsulation;

// Main class to test library system
public class LibraryMain {

    public static void main(String[] args) {

        // Creating library items
        LibraryItem item1 = new Book(1, "Java Basics", "James Gosling");
        LibraryItem item2 = new Magazine(2, "Tech Monthly", "Editorial Team");
        LibraryItem item3 = new DVD(3, "Java Tutorial DVD", "Oracle");

        // Polymorphic array
        LibraryItem[] items = { item1, item2, item3 };

        // Process all items using parent reference
        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration: "
                    + item.getLoanDuration() + " days");

            // Reservation handling
            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem();
            }

            // Borrowing item
            item.borrowItem("Ishan");

            System.out.println("------------------------------");
        }
    }
}
