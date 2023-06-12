package project;

import java.util.LinkedList;
import java.util.Scanner;


class Book {
    private int id;
    private String name;
    private float price;

    int getbookId(){
        return id;
    }
    void setbookid(int id){
        this.id=id;
    }
    String getbookName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }
    float getbookPrice(){
        return price;
    }

    void setbookPrice(float price){
        this.price=price;
    }

    public Book() {
    }

    Book(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Customer {
    private int id;
    private String name;
    private String password;
    private String booksBought;
    private float price;
    int getId(){
        return id;
    }
    void setid(int id){
        this.id=id;
    }
    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }
    String getPassword(){
        return password;
    }

    void setPassword(String password){
        this.password=password;
    }
    String getBooksBought(){
        return booksBought;
    }

    void setBooksBought(String booksBought){
        this.booksBought=booksBought;
    }

    float getPrice(){
        return price;
    }
    void setPrice(float price){
        this.price=price;
    }

    Customer(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.booksBought = "";
        this.price = 0;
    }
}

public class LibraryManagementSystem {
    static LinkedList<Book> books = new LinkedList<Book>();
    static LinkedList<Customer> customers = new LinkedList<Customer>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeBooks();
        initializeCustomers();
//        mainMenu();
        while (true) {
            System.out.println("Welcome to the Library Management System!");
            System.out.println("1. Admin Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    adminLogin();
                    break;
                case 2:
                    customerLogin();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void adminLogin() {
        System.out.println("Enter admin ID:");
        String adminId = scanner.next();
        System.out.println("Enter password:");
        String password = scanner.next();

        if (adminId.equals("admin") && password.equals("admin")) {
            while (true) {
                System.out.println("1. Asset Manager");
                System.out.println("2. Customer Details");
                System.out.println("3. Back");
                System.out.println("4. Logout");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        assetManager();
                        break;
                    case 2:
//                        displayCustomers();
                        customerManager();
                        break;
                    case 3:
                        return;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        } else {
            System.out.println("Invalid credentials!");
        }
    }

    static void assetManager() {
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Back");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void customerManager() {
            System.out.println("1. Display customers");
            System.out.println("2. Update customer");
            System.out.println("3. Delete customer");
            System.out.println("4. Back");
//        System.out.println("5. logout");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
//                    addBook();
                    displayCustomers();
                    break;
                case 2:
                    updateCustomer();
                    break;
                case 3:
                    deleteCustomer();
                    break;
                case 4:
                   return;


                default:
                    System.out.println("Invalid choice!");
            }
        }

    static void addBook() {
        System.out.println("Enter book ID:");
        int id = scanner.nextInt();
        System.out.println("Enter book name:");
        String name = scanner.next();
        System.out.println("Enter book price:");
        float price = scanner.nextFloat();

        books.add(new Book(id, name, price));
        System.out.println("Book added successfully!");
    }

    static void displayBooks() {
        System.out.println("List of books:");
        System.out.println("ID\t\tName\t\tPrice");

        for (Book book : books) {
            System.out.println(book.getbookId() + "\t" + book.getbookName() + "\t" + book.getbookPrice());
        }
    }

    static void updateBook() {
        System.out.println("Enter book ID to update:");
        int id = scanner.nextInt();

        for (Book book : books) {
            if (book.getbookId() == id) {
                System.out.println("Enter new book name:");
                String name = scanner.next();
                System.out.println("Enter new book price:");
                float price = scanner.nextFloat();

                book.setName(name);
                book.setbookPrice(price);
                System.out.println("Book updated successfully!");
                return;
            }
        }

        System.out.println("Book not found!");
    }

    static void deleteBook() {
        System.out.println("Enter book ID to delete:");
        int id = scanner.nextInt();

        for (Book book : books) {
            if (book.getbookId() == id) {
                books.remove(book);
                System.out.println("Book deleted successfully!");
                return;
            }
        }

        System.out.println("Book not found!");
    }

//    static void displayCustomers() {
//        System.out.println("List of customers:");
//        System.out.println("ID\tName\tPassword\tBooks Bought\tPrice");
//
//        for (Customer customer : customers) {
//            System.out.println(customer.id + "\t" + customer.name + "\t" + customer.password + "\t" + customer.booksBought + "\t" + customer.price);
//        }
//    }

    static void customerLogin() {
        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Back");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registerCustomer();
                    break;
                case 2:
                    loginCustomer();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void registerCustomer() {
        System.out.println("Enter customer ID:");
        int id = scanner.nextInt();
        System.out.println("Enter first name");
        String name=scanner.next();
        System.out.println("Enter password:");
        String password = scanner.next();
        System.out.println("Confirm password:");
        String confirmPassword = scanner.next();

        for (Customer customer : customers) {
            if (customer.getId() == id) {
                System.out.println("Customer already registered!");
                return;
            }
        }

        if (password.equals(confirmPassword)) {
            customers.add(new Customer(id, name, password));
            System.out.println("Customer registered successfully!");
        } else {
            System.out.println("Passwords do not match!");
        }
    }

    static void loginCustomer() {
        System.out.println("Enter customer ID:");
        int id = scanner.nextInt();
        System.out.println("Enter password:");
        String password = scanner.next();

        for (Customer customer : customers) {
            if (customer.getId() == id && customer.getPassword().equals(password)) {
                displayBooks();
                System.out.println("Enter book ID to buy:");
                int bookId = scanner.nextInt();

                for (Book book : books) {
                    if (book.getbookId()== bookId) {
                        System.out.println("Enter quantity:");
                        int quantity = scanner.nextInt();

                        float price = book.getbookPrice() * quantity;
//                        int priceint=(int)price;
                        String bookname=book.getbookName();
                        customer.setBooksBought(bookname);
                        customer.setPrice(price);
//                        customer.setBooksBought(String book.name)+ " (x" + quantity + ")\n";
//                        customer.getPrice()+= price;
                        System.out.println("Receipt:");
                        System.out.println("You have bought book: "+book.getbookName() + "\n Quantitiy is:"+ quantity + ")\n Total Amount: "  + price);
                        return;
                    }
                }

                System.out.println("Book not found!");
                return;
            }
        }

        System.out.println("Invalid credentials!");
    }

    static void initializeBooks() {
        books.add(new Book(1, "The Great Gatsby", 108.5f));
        books.add(new Book(2,"FMAB",990.9f)) ;}

    static void initializeCustomers() {
        customers.add(new Customer(1, "Rahul", "1234"));
        customers.add(new Customer(2, "Jenny", "5678"));
    }

    static void mainMenu() {
        while (true) {
            System.out.println("1. Admin login");
            System.out.println("2. Customer login");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    adminLogin();
                    break;
                case 2:
                    customerLogin();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

//    public static void main(String[] args) {
//        initializeBooks();
//        initializeCustomers();
//        mainMenu();
//    }
//}


    //customer crud
//    static void addCustomer() {
//        System.out.print("Enter customer name: ");
//        String name = scanner.next();
//        System.out.print("Enter customer password: ");
//        String password = scanner.next();
//        customers.add(new Customer(customers.size() + 1, name, password));
//        System.out.println("Customer added successfully!");
//    }

    static void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Customer Name: " + customer.getName());
            System.out.println("Customer Password: " + customer.getPassword());
            System.out.println("Books Bought: " + customer.getBooksBought());
            System.out.println("Total Spent: " + customer.getPrice());
            System.out.println();
        }
    }

    static void updateCustomer() {
        System.out.print("Enter customer ID to update: ");
        int id = scanner.nextInt();
        Customer customerToUpdate = null;
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                customerToUpdate = customer;
                break;
            }
        }
        if (customerToUpdate == null) {
            System.out.println("Customer not found!");
            return;
        }
        System.out.print("Enter new name for customer (Press enter to skip): ");
        String name = scanner.next();
        if (!name.isEmpty()) {
            customerToUpdate.setName(name);
        }
        System.out.print("Enter new password for customer (Press enter to skip): ");
        String password = scanner.next();
        if (!password.isEmpty()) {
            customerToUpdate.setPassword(password);
        }
        System.out.println("Customer updated successfully!");
    }

    static void deleteCustomer() {
        System.out.print("Enter customer ID to delete: ");
        int id = scanner.nextInt();

//        boolean customerRemoved = false;
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                customers.remove(customer);
//                customerRemoved = true;
                System.out.println("Customer deleted successfully!");
            }
        }
    }}




//        boolean customerRemoved = customers.removeIf(customer -> customer.getId() == id);
//        if (customerRemoved) {
//            System.out.println("Customer deleted successfully!");
//        } else {
//            System.out.println("Customer not found!");
//        }





