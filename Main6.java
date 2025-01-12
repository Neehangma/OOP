public class Main6 {
    public static void main(String[] args) {
        FictionBook fiction = new FictionBook("The Hobbit", "J.R.R. Tolkien");
        NonFictionBook nonFiction = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook technical = new TechnicalBook("Introduction to Algorithms", "Thomas H. Cormen");

        fiction.displayDetails();
        nonFiction.displayDetails();
        technical.displayDetails();
    }
}