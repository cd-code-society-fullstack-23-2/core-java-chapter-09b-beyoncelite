# Stellar Books

---

**"Stellar Books" Online Store Coding Activity**

Hey there! Today we've got an exciting computer coding activity lined up for you! Picture this: you're creating the behind-the-scenes magic for an online bookstore called "Stellar Books." 🌌📚

**What's the Big Idea?**

You and a buddy are going to team up. One of you will be the detective—let's call them the "Test Driver." The Test Driver will set up little challenges or tests. The other person is the builder, the "Implementer." They'll write code to solve those challenges. You'll then swap roles and do it again for a different part of the project.

**What You Need:**

- A computer setup to write Java programs.
- A little knowledge of Java, and a spirit of adventure!

**The Story Behind "Stellar Books":**

Imagine Stellar Books as this massive global online bookstore. Just like any store, sometimes they run out of items, right? Or sometimes a customer might enter the wrong password when trying to log in. And hey, we've all had that awkward moment where our card payment didn't go through. Your mission is to handle these scenarios smoothly in the online system.

**How to Go About It:**

**Getting Started:**

1. Team up with a buddy. Decide who'll start off as the detective (Test Driver) and who'll be the builder (Implementer).
2. The Test Driver thinks of a test or challenge. For instance, "What happens if a customer tries to buy a book, but it's sold out?"
3. The Implementer then writes the code to handle this situation.

**First Challenge: Out of Stock Books**

- **Detective Role:** Make a test where someone tries to buy a book that's not available. Expect the system to respond with a message like "Sorry, this book is out of stock."
- **Builder Role:** Set up the basic structure for the bookstore, like making a "Book" category. Then, make sure the system gives the "out of stock" message when needed.

Then, swap roles for the next challenge.

**Second Challenge: Payment and Login Troubles**

- **Detective Role:** Imagine someone's card payment didn't work, or they typed in the wrong password. Think of tests for these situations.
- **Builder Role:** Design the part of the system that handles payments and user accounts. Make sure it reacts correctly to failed payments or wrong passwords.

After that, if you have more ideas, switch roles again and keep adding to your store system!

**What Will It Look Like?**

In the end, when you run your program, it'll look something like a conversation with the online store:

```
"Welcome to Stellar Books!"
"Do you want to log in, browse books, or leave?"
"I want to log in."
"Okay, username and password, please."
"Oops! Wrong password. Try again."
...and so on.
```

You'll see messages for when things go right (like buying a book) and when things go a bit wonky (like trying to buy a book that's sold out).

---

Remember, the main goal is to have fun while learning. Mistakes are just stepping stones to success! Good luck, and happy coding! 🚀📖🌠

## Pair Coding Lab Exercise:

**Exception Handling for "Stellar Books" Online Store**

**Objective:**

This exercise will engage students in collaborative development. One student will handle the testing (Test Driver) while the other one manages the implementation (Implementer). The context will be around "Stellar Books", an online bookstore, with a focus on managing book inventory, dealing with failed payment processes, and handling user account issues.

**Requirements:**

- Java SDK
- IDE with unit testing capabilities (e.g., IntelliJ IDEA, Eclipse)
- Basic understanding of Java programming, exception handling, and unit testing (JUnit)

**Scenario:**

"Stellar Books" is an online bookstore selling books worldwide. The system should handle cases where a book is out of stock, confirm valid payment before confirming a purchase, and handle user account issues like password mismatches or nonexistent accounts.

**Instructions:**  
**Setup:**

1. Form teams of two members.
2. Decide who begins as the Test Driver and who becomes the Implementer.
3. Test Driver creates tests for each specific functionality while the Implementer writes the code to satisfy these tests.

**Task 1: Handling Book Inventory Issues**  
**Test Driver:**

- Write a test simulating an attempt to purchase a book that is out of stock.
- The test should anticipate an `OutOfStockException`.

**Implementer:**

- Create the classes `Book` and `BookstoreSystem`.
- Design the custom exception `OutOfStockException`.
- Implement the logic in `BookstoreSystem` to throw the `OutOfStockException` when a book is not available.

**Switch roles for the subsequent task.**

**Task 2: Handling Payment and User Account Issues**  
**Test Driver:**

- Write a test simulating a failed payment process. This test should expect a `PaymentProcessingException`.
- Create another test for situations where a user tries to log in with incorrect credentials. This test should anticipate a `LoginFailedException`.

**Implementer:**

- In the `BookstoreSystem` class, incorporate logic for the payment process.
- Create classes `UserAccount` and `Payment`.
- Design the custom exceptions `PaymentProcessingException` and `LoginFailedException`.
- Implement logic in `BookstoreSystem` to deal with payment failures and login issues.

**Switch roles for further enhancements or other functionalities.**


## Sample Running Program Output

```
Welcome to Stellar Books Online Store!
---------------------------------------

1. Login
2. Browse Books
3. Exit

Enter your choice: 1

Please enter your username: johndoe
Please enter your password: wrongpassword

Error: LoginFailedException - Incorrect username or password. Please try again.

1. Login
2. Browse Books
3. Exit

Enter your choice: 1

Please enter your username: johndoe
Please enter your password: correctpassword

Logged in successfully as johndoe!

1. Browse Books
2. Purchase a Book
3. Logout

Enter your choice: 1

Books available:
1. "The Stellar Journey" - $25.00 - 10 in stock
2. "Galaxies Beyond" - $30.00 - 0 in stock
3. "Cosmic Wonder" - $20.00 - 5 in stock

Enter the number of the book you're interested in or 0 to go back: 2

Sorry! "Galaxies Beyond" is currently out of stock.

1. Browse Books
2. Purchase a Book
3. Logout

Enter your choice: 2

Please enter the number of the book you'd like to purchase: 1
Enter payment amount ($): 20

Error: PaymentProcessingException - Insufficient payment amount. Please provide the correct amount.

Please enter the number of the book you'd like to purchase: 1
Enter payment amount ($): 25

Purchase successful! Thank you for buying "The Stellar Journey".

1. Browse Books
2. Purchase a Book
3. Logout

Enter your choice: 3

Logged out successfully! Thank you for shopping with Stellar Books.

1. Login
2. Browse Books
3. Exit

Enter your choice: 3

Goodbye! We hope to see you again soon at Stellar Books.

```