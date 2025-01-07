// 2. Book Class
public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;
public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("1984", "George Orwell", 1949);
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 1813);
        Book book5 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
        Book book6 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book book7 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book8 = new Book("The Da Vinci Code", "Dan Brown", 2003);
        Book book9 = new Book("The Alchemist", "Paulo Coelho", 1988);
        Book book10 = new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943);
        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        book1.borrowBook();
        book1.returnBook();
        book1.returnBook();
}
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book has been borrowed.");
        } else {
            System.out.println("The book is already borrowed.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("The book has been returned.");
    }
}
