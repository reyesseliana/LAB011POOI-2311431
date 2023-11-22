/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

public class TestPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        BookSystem bookSystem = new BookSystem();

        for (int x = 0; x < 2; x++) {
            System.out.println("Ingrese los datos del autor " + (x + 1) + ":");
            System.out.print("Nombre del autor: ");
            String authorName = scanner.nextLine();
            System.out.print("Correo electrónico del autor: ");
            String authorEmail = scanner.nextLine();
            Author author = new Author(authorName, authorEmail);

            System.out.println("Ingrese los datos del libro " + (x + 1) + ":");
            System.out.print("Título del libro: ");
            String bookTitle = scanner.nextLine();
            System.out.print("Precio del libro: ");
            double bookPrice = scanner.nextDouble();
            System.out.print("Cantidad del libro: ");
            int bookQuantity = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            bookSystem.addBook(bookTitle, bookPrice, bookQuantity, author);
        }

        // Mostrar la lista de libros
        System.out.println("\nLista de Libros:");
        bookSystem.showBookList();

        // Buscar el libro a cambiar por título
        System.out.println("\nIngrese el título del libro que desea cambiar : ");
        String libroCambiar = scanner.nextLine();
        Book selectedBook = bookSystem.searchBookByTitle(libroCambiar);

        if (selectedBook != null) {
            int cerrar = 0;

            do {
                // Menú de operaciones
                System.out.println("\n1. Modificar Nombre");
                System.out.println("2. Modificar Precio");
                System.out.println("3. Modificar Cantidad");
                System.out.println("4. Eliminar Libro");
                System.out.println("5. Buscar un libro por título");
                System.out.println("6. Buscar el autor dado un libro");
                System.out.println("7. Ordenar los libros por autor");
                System.out.println("8. Salir");
                System.out.print("Ingrese el número de operación : ");
                int numOperacion = scanner.nextInt();
                scanner.nextLine();  // Consumir la nueva línea

                switch (numOperacion) {
                    case 1 -> {
                        // Modificar Nombre
                        System.out.print("Ingrese el nuevo nombre del libro : ");
                        String nuevoNombre = scanner.nextLine();
                        selectedBook.setTitle(nuevoNombre);
                    }

                    case 2 -> {
                        // Modificar Precio
                        System.out.print("Ingrese el nuevo precio del libro : ");
                        double nuevoPrecio = scanner.nextDouble();
                        selectedBook.setPrice(nuevoPrecio);
                    }

                    case 3 -> {
                        // Modificar Cantidad
                        System.out.print("Ingrese la nueva cantidad del libro : ");
                        int nuevaCantidad = scanner.nextInt();
                        selectedBook.setQuantity(nuevaCantidad);
                    }

                    case 4 -> {
                        // Eliminar Libro
                        bookSystem.removeBook(selectedBook.getTitle());
                        System.out.println("Libro eliminado correctamente.");
                        cerrar = 8;  // Salir del bucle
                    }

                    case 5 -> {
                        // Buscar un libro por título
                        System.out.println("Ingrese el título del libro que desea buscar:");
                        scanner.nextLine();  // Consumir la nueva línea
                        String libroToSearch = scanner.nextLine();
                        Book foundBook = bookSystem.searchBookByTitle(libroToSearch);
                        if (foundBook != null) {
                            System.out.println("Libro encontrado: " + foundBook);
                        } else {
                            System.out.println("Libro no encontrado.");
                        }
                    }

                    case 6 -> {
                        // Buscar el autor dado un libro
                        Author authorOfBook = bookSystem.findAuthorByBookTitle(selectedBook.getTitle());
                        if (authorOfBook != null) {
                            System.out.println("Autor del libro encontrado: " + authorOfBook);
                        } else {
                            System.out.println("Autor no encontrado para el libro especificado.");
                        }
                    }

                    case 7 -> {
                        // Ordenar los libros por autor
                        bookSystem.sortBooksByAuthor();
                        System.out.println("Libros ordenados por autor.");
                    }

                    case 8 -> {
                        cerrar = 8;  // Salir del bucle
                        System.out.println("\nRegresando....");
                    }

                    default -> System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            } while (cerrar != 8);
        }
    }
}
