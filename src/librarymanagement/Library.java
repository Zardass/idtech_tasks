package librarymanagement;

public class Library {

    Book[] books = new Book[10];

    public void addBook(Book book){
        for(int i=0;i<books.length;i++){
            if (books[i] == null){
                    books[i] = book;
                    break;
            }
        }
    }

    public void showAvailableBooks(){
        for(int i=0;i<books.length;i++){
            if(books[i]!=null && books[i].isAvailable()){
                System.out.println(books[i].getTitle());
            }
        }
    }

}
