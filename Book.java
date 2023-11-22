/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Book {
    private final String title;
    private double price;
    private int quantity;
    private final Author author;
    private String setTitle;

    public Book(String title, double price, int quantity, Author author) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setTitle(String newTitle) {
    if (newTitle != null && !newTitle.isEmpty()) {

  
    } else {
        System.out.println("El nuevo título no es válido.");  // Puedes ajustar este mensaje según tus necesidades.
    }
}

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Otros métodos según sea necesario

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", author=" + author +
                '}';
    }
}
