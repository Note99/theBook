public class Main {
    public static void main(String[] args) {
        Book book = new Book(29.99, 400, 5000, 100, "John Doe", "1234567890");
        Magazine magazine = new Magazine(4.99, 50, 3000, 20, "Bob Johnson", "Weekly");
        Journal journal = new Journal(9.99, 100, 2000, 50, "Jane Smith", "Monthly");

        System.out.println(book);
        System.out.println(magazine);
        System.out.println(journal);
    }
}