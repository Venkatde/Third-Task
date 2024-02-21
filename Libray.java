package com.task3.OOPprinciple;

class Library {
    private Book[] books;
    private int capacity;
    private int size;

    public Library(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.books = new Book[capacity];
    }

    public void addBook(Book book) {
        if (size < capacity) {
            books[size++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < size; i++) {
            if (books[i].getBookID() == bookID) {
                for (int j = i; j < size - 1; j++) {
                    books[j] = books[j + 1];
                }
                size--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    public void searchBook(int bookID) {
        for (int i = 0; i < size; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Book found:");
                System.out.println(books[i]);
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    public void displayBooks() {
        if (size == 0) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("Books in the library:");
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}
