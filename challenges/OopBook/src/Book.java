public class Book {
    static int TotalNumberOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        TotalNumberOfBooks =0;
    }
    Book(String isbn ,String title ,String author){
        this.isbn =isbn;
        this.author=title;
        this.title=author;
    }
    Book(String isbn){
        this(isbn,"unkown","unkown");
    }
    public static int getTotalNumberOfBooks(){
       return  TotalNumberOfBooks;
    }
    public void borrowBook(){
        if(isBorrowed){
            System.out.print("You have already borrowed the book");
        }else{
          isBorrowed = true;
            System.out.print("Enjoy the book");
        }

    }

    public void returnBook(){
        if(isBorrowed){
            System.out.println("Hope you enjoyed, Please leave the review");
            isBorrowed =false;
        }else{
            System.out.println("Book is already in library");
        }
    }

    public static void main(String[] args) {
        Book BookShop =  new Book("5656","trading","Sameer");
        System.out.println(TotalNumberOfBooks);
        BookShop.borrowBook();
        BookShop.borrowBook();
        System.out.println(TotalNumberOfBooks);
    }
}
