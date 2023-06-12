import java.util.Scanner;

// Book class to store book details
class Book {
    String name;
    int id;
    double price;
    Book next;

    Book(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
        next = null;
    }
}

// Customer class to store customer details
class Customer {
    int name;
    String password;
    String[] booksBought;
    int[] quantity;
    Customer next;

    Customer(int name, String password) {
        this.name = name;
        this.password = password;
        booksBought = new String[10];
        quantity = new int[10];
        next = null;
    }
}

// Library class to manage book and customer records
class Library {
    Book firstBook;
    Customer firstCustomer;

    Library() {
        firstBook = null;
        firstCustomer = null;
    }

    // Method to add a new book to the library
    void addBook(String name, int id, double price) {
        Book newBook = new Book(name, id, price);
        newBook.next = firstBook;
        firstBook = newBook;
        System.out.println("Book added successfully!");
    }

    // Method to display all books in the library
    void displayBooks() {
        System.out.println("Book ID\tBook Name\tPrice");
        Book currentBook = firstBook;
        while (currentBook != null) {
            System.out.println(currentBook.id + "\t" + currentBook.name + "\t\t" + currentBook.price);
            currentBook = currentBook.next;
        }
    }

    // Method to update the details of a book in the library
    void updateBook(int id, String name, double price) {
        Book currentBook = firstBook;
        while (currentBook != null) {
            if (currentBook.id == id) {
                currentBook.name = name;
                currentBook.price = price;
                System.out.println("Book updated successfully!");
                return;
            }
            currentBook = currentBook.next;
        }
        System.out.println("Book not found!");
    }

    // Method to delete a book from the library
    void deleteBook(int id) {
        if (firstBook == null) {
            System.out.println("Book not found!");
            return;
        }
        if (firstBook.id == id) {
            firstBook = firstBook.next;
            System.out.println("Book deleted successfully!");
            return;
        }
        Book currentBook = firstBook.next;
        Book previousBook = firstBook;
        while (currentBook != null) {
            if (currentBook.id == id) {
                previousBook.next = currentBook.next;
                System.out.println("Book deleted successfully!");
                return;
            }
            previousBook = currentBook;
            currentBook = currentBook.next;
        }
        System.out.println("Book not found!");
    }

    // Method to add a new customer to the library
    void addCustomer(int name, String password) {
        Customer newCustomer = new Customer(name, password);
        newCustomer.next = firstCustomer;
        firstCustomer = newCustomer;
        System.out.println("Customer added successfully!");
    }

    // Method to display all customers in the library
    void displayCustomers() {
        System.out.println("Customer Id\tCustomer Password\tBooks Bought\tQuantity\tPrice");
        Customer currentCustomer = firstCustomer;
        while (currentCustomer != null) {
            System.out.print(currentCustomer.name + "\t" + currentCustomer.password + "\t\t");
            for (int i = 0; i < currentCustomer.booksBought.length; i++) {
                if (currentCustomer.booksBought[i] != null) {
                    System.out.print(currentCustomer.booksBought[i] + "\t\t");
                    System.out.print(currentCustomer.quantity[i] + "\t\t");
                    Book currentBook = firstBook;
                    while (currentBook != null) {
                        if (currentBook.name.equals(currentCustomer.booksBought[i])) {
                            System.out.print(currentBook.price * currentCustomer.quantity[i]);
                            break;
                        }
                        currentBook = currentBook.next;
                    }
                    System.out.println();
                }
            }
            currentCustomer = currentCustomer.next;
        }
    }
    // Method to update the details of a customer in the library
    void updateCustomer(int name, String password) {
        Customer currentCustomer = firstCustomer;
        while (currentCustomer != null) {
            if (currentCustomer.name==name) {
                currentCustomer.password = password;
                System.out.println("Customer updated successfully!");
                return;
            }
            currentCustomer = currentCustomer.next;
        }
        System.out.println("Customer not found!");
    }

    // Method to delete a customer from the library
    void deleteCustomer(int name) {
        if (firstCustomer == null) {
            System.out.println("Customer not found!");
            return;
        }
        if (firstCustomer.name==name) {
            firstCustomer = firstCustomer.next;
            System.out.println("Customer deleted successfully!");
            return;
        }
        Customer currentCustomer = firstCustomer.next;
        Customer previousCustomer = firstCustomer;
        while (currentCustomer != null) {
            if (currentCustomer.name==name) {
                previousCustomer.next = currentCustomer.next;
                System.out.println("Customer deleted successfully!");
                return;
            }
            previousCustomer = currentCustomer;
            currentCustomer = currentCustomer.next;
        }
        System.out.println("Customer not found!");
    }

    // Method to check if a customer exists in the library with the given name and password
    boolean customerExists(int name, String password) {
        Customer currentCustomer = firstCustomer;
        while (currentCustomer != null) {
            if (currentCustomer.name==name && currentCustomer.password.equals(password)) {
                return true;
            }
            currentCustomer = currentCustomer.next;
        }
        return false;
    }

    // Method to find a book in the library with the given ID
    Book findBook(int id) {
        Book currentBook = firstBook;
        while (currentBook != null) {
            if (currentBook.id == id) {
                return currentBook;
            }
            currentBook = currentBook.next;
        }
        return null;
    }

    // Method to handle customer login and book purchasing
    void customerLogin(int loginID, String loginPassword) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your choice:\n1. Register\n2. Login\n3. Back");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter customer ID: ");
                int name = sc.nextInt();
                System.out.print("Enter password: ");
                String password = sc.next();
                System.out.print("Confirm password: ");
                String confirmPassword = sc.next();
                if (password.equals(confirmPassword)) {
                    addCustomer(name, password);
                } else {
                    System.out.println("Passwords do not match!");
                }
                break;
            case 2:
                System.out.print("Enter customer ID: ");
                name = sc.nextInt();
                System.out.print("Enter password: ");
                password = sc.next();
                if (customerExists(name, password)) {
                    System.out.println("\nList of books:\n");
                    displayBooks();
                    System.out.print("\nEnter ID of the book you want to buy: ");
                    int bookID = sc.nextInt();
                    Book bookToBuy = findBook(bookID);
                    if (bookToBuy == null) {
                        System.out.println("Book not found!");
                        break;
                    }
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
//                    if (bookToBuy.quantity < quantity) {
//                        System.out.println("Not enough books in stock!");
//                        break;
//                    }
                    System.out.println("\nReceipt:");
                    System.out.println("Book: " + bookToBuy.name);
                    System.out.println("Price per book: " + bookToBuy.price);
                    System.out.println("Quantity: " + quantity);
                    System.out.println("Total: " + bookToBuy.price * quantity);
//                    bookToBuy.quantity -= quantity;
// Update customer details
                    Customer currentCustomer = firstCustomer;
                    while (currentCustomer != null) {
                        if (currentCustomer.name==name) {
                            for (int i = 0; i < currentCustomer.booksBought.length; i++) {
                                if (currentCustomer.booksBought[i] == null) {
                                    currentCustomer.booksBought[i] = bookToBuy.name;
                                    currentCustomer.quantity[i] = quantity;
                                    break;
                                } else if (currentCustomer.booksBought[i].equals(bookToBuy.name)) {
                                    currentCustomer.quantity[i] += quantity;
                                    break;
                                }
                            }
                            System.out.println("\nBooks bought by " + name + ":");
                            for (int i = 0; i < currentCustomer.booksBought.length; i++) {
                                if (currentCustomer.booksBought[i] != null) {
                                    System.out.println(currentCustomer.booksBought[i] + currentCustomer.quantity[i]);
                                    System.out.print(bookToBuy.price * currentCustomer.quantity[i]);
                                }

                            }
                            return;
                        }
                        currentCustomer = currentCustomer.next;
                    }
                } else {
                    System.out.println("Invalid customer ID or password!");
                }
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
    // Main method to run the library management system
    public static void main(String[] args) {
        Library lms = new Library();
//        Library lms1= new Library();
//        Library lms2= new Library();
////        Book b1= new Book("hunger games",1,800);
////        Book b2= new Book("vinland saga",2,700);
//        lms1.addBook("hunger games",1,800);
//        lms2.addBook("vinland saga",2,700);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter your choice:\n1. Admin login\n2. Customer login\n3. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter admin ID: ");
                    String adminID = sc.next();
                    System.out.print("Enter password: ");
                    String adminPassword = sc.next();
                    if (adminID.equals("admin") && adminPassword.equals("admin")) {
                        while (true) {
                            System.out.println("\nEnter your choice:\n1. Asset Manager\n2. Customer Details\n3. Logout");
                            int adminChoice = sc.nextInt();
                            switch (adminChoice) {
                                case 1:
                                    System.out.println("\nEnter your choice:\n1. Add book\n2. Display books\n3. Update book\n4. Delete book");
                                    int assetChoice = sc.nextInt();
                                    switch (assetChoice) {
                                        case 1:
                                            System.out.print("Enter book ID: ");
                                            int bookID = sc.nextInt();
                                            sc.nextLine();
                                            System.out.print("Enter book name: ");
                                            String bookName = sc.nextLine();
                                            System.out.print("Enter book price: ");
                                            int bookPrice = sc.nextInt();

                                            lms.addBook(bookName, bookID, bookPrice);
                                            break;
                                        case 2:
//                                            lms1.displayBooks();
//                                            lms2.displayBooks();
                                            lms.displayBooks();
                                            break;
                                        case 3:
                                            System.out.print("Enter book ID: ");
                                            int updateID = sc.nextInt();
                                            sc.nextLine();
                                            System.out.print("Enter new book name: ");
                                            String updateName = sc.nextLine();
                                            System.out.print("Enter new book price: ");
                                            int updatePrice = sc.nextInt();
                                            lms.updateBook(updateID, updateName, updatePrice);
                                            break;
                                        case 4:
                                            System.out.print("Enter book ID: ");
                                            int deleteID = sc.nextInt();
                                            lms.deleteBook(deleteID);
                                            break;
                                        default:
                                            System.out.println("Invalid choice!");
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("\nEnter your choice:\n1. Display customers\n3. Update customers\n4. Delete customers \n5. Back");
                                    int customerChoice = sc.nextInt();
                                    switch(customerChoice){
                                        case 1:
                                            lms.displayCustomers();
                                            break;
                                        case 2:
                                            System.out.print("Enter customer ID: ");
                                            int updateID = sc.nextInt();
                                            System.out.print("Enter customer pass: ");
                                            String updatePass = sc.next();
                                            System.out.print("Enter new book price: ");
                                            int updatePrice = sc.nextInt();
                                            lms.updateCustomer(updateID, updatePass);
                                            break;
                                        case 3:
                                            System.out.println("Enter cutomer id to delete");
                                            int deleteID= sc.nextInt();
                                            lms.deleteCustomer(deleteID);
                                            break;
                                        case 4:
                                            break;
                                    }

                                    break;
                                case 3:
                                    System.out.println("Logged out!");
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                                    break;
                            }
                            if (adminChoice == 3) {
                                break;
                            }
                        }
                    } else {
                        System.out.println("Invalid admin ID or password!");
                    }
                    break;
                case 2:
                    System.out.println("\nEnter your choice:\n1. Register\n2. Login\n3. Back");
                    int customerChoice = sc.nextInt();
                    switch (customerChoice) {
                        case 1:
                            System.out.print("Enter customer ID: ");
                            int customerID = sc.nextInt();
                            System.out.print("Enter password: ");
                            String customerPassword = sc.next();
                            System.out.print("Confirm password: ");
                            String confirmPassword = sc.next();
                            if (customerPassword.equals(confirmPassword)) {
                                lms.addCustomer(customerID, customerPassword);
                                System.out.println("Registered successfully!");
                            } else {
                                System.out.println("Passwords don't match!");
                            }
                            break;
                        case 2:
                            System.out.print("Enter customer ID: ");
                            int loginID = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter password: ");
                            String loginPassword = sc.next();
                            lms.customerLogin(loginID, loginPassword);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}


