package librarymanagement;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;


    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void borrow(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        }
        else{
            isAvailable = true;
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook(){
            isAvailable = true;
            System.out.println("Book returned successfully.");
    }

}


