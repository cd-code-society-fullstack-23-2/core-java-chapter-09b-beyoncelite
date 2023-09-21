package com.codedifferently;

import exceptions.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private Library library;
    private UserAccount currentUser;
    private Payment currentPayment;
    private static final Scanner scanner = new Scanner(System.in);

    public Main() {
        library = new Library(new ArrayList<>(), "", 0.0);
        initBooks();
    }

    private void initBooks() {
        library.addBooks(new Book("Becoming Beyoncé: The Untold Story", 20.00));
        library.addBooks(new Book("Queen Bey: A Celebration of the Power and Creativity of Beyoncé Knowles-Carter", 25.00));
    }

    public void login() throws LoginFailedException {
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("UncleJohnny") && password.equals("TheRenaissance@123")) {
            currentUser = new UserAccount(username, password);
            System.out.println("Login Successful!");
        } else {
            throw new LoginFailedException("Login Failed. Invalid credentials.");
        }
    }

    public void browse() {
        library.displayBooks();
    }

    public void purchase(Book book, double amount) throws OutOfStockException, PaymentProcessingException {
        if (library.inStock() <= 0) {
            throw new OutOfStockException("Ain't no books");
        }
        currentPayment = new Payment(amount);
        if (currentPayment.processPayment(book.getPrice())) {
            currentPayment.setPurchaseSuccessful(true);
            System.out.println("Purchase Successful!");
        } else {
            throw new PaymentProcessingException("BROKIE");
        }
    }

    public void logout() {
        currentUser = null;
        currentPayment = null;
        System.out.println("Logged out successfully.");
    }

    public static void main(String[] args) {
        Main mainApp = new Main();

        try {
            mainApp.login();
            mainApp.browse();
            System.out.println("what book you want: ");
            String title = scanner.nextLine();
            System.out.println("Enter the amount you are paying: ");
            double amount = scanner.nextDouble();
            ArrayList<Book> bookList = mainApp.library.displayBooks;
            for (int i = 0; i < bookList.size(); i++) {
                Book currentBook = bookList.get(i);
                String currentTitle = currentBook.getTitles();
                if (currentTitle.toLowerCase().equals(title.toLowerCase())) {
                    mainApp.purchase(currentBook, amount);
                    break;
                }
            }
            mainApp.logout();
        } catch (LoginFailedException | OutOfStockException | PaymentProcessingException e) {
            System.out.println(e.getMessage());
        }
    }
}

