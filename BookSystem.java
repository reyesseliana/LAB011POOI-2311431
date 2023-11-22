/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

public class BookSystem {
    private final List<Book> books;

    public BookSystem() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void showBookList() {
        System.out.println("Lista de libros:");
        for (Book book : books) {
            Author author = (Author) book.getAuthor();
            System.out.println("Título: " + book.getTitle() +
                    ", Autor: " + author.getName() +
                    ", Precio: " + book.getPrice() +
                    ", Cantidad: " + book.getQuantity());
        }
    }

    public void addBook(String title, double price, int quantity, Author author) {
        Book newBook = new Book(title, price, quantity, author);
        books.add(newBook);
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    public void editBook(String title, double newPrice, int newQuantity) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setPrice(newPrice);
                book.setQuantity(newQuantity);
                break;
            }
        }
    }

    public void sortBooksByAuthor() {
    books.sort(Comparator.comparing(book -> {
        Author author = (Author) book.getAuthor();
        return (author != null) ? author.getName() : "";
    }));
}
    public Author findAuthorByBookTitle(String title) {
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            return (Author) book.getAuthor();
        }
    }
    return null;
}

    /**
     *
     * @param title
     * @return
     */
    public Book searchBookByTitle(String title) {
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            return book;
        }
    }
    return null; 
}
}

    



