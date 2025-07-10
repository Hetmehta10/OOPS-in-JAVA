// class book{
//     String title;
//     String author;
//     double price;
//     void setDetails(String title, String author, double price){
//         this.title = title;
//         this.author = author;
//         this.price = price;
//     }
//     void display(){
//         System.out.printf("Title: " + title);
//         System.out.printf("Author: " + author);
//         System.out.printf("Price: " + price);
//     }
// }
// public class book_c{
//     public static void main(String[] args){
//         book book1 = new book();
//         book1.setDetails("The Alchimist", "Paulo", 15.99);
//         book1.display();
//         book book2 = new book();
//         book2.setDetails("19of","George", 12.44);
//         book2.display();
//         }
// }


//using constructor;
class book{
    String title;
    String author;
    double price;
    public book (String title, String author, double price){ //constructor starts
        this.title = title;
        this.author = author;
        this.price = price;
    } //constructor ends
    public book(String newspaper){
        this.title = newspaper;
    }
    void display(){
        System.out.printf("Title: " + title);
        System.out.printf("Author: " + author);
        System.out.printf("Price: " + price);
    }
}
public class book_c{
    public static void main(String[] args) {
        book book1 = new book("The Alchimist", "Paulo", 15.99);
        book1.display();
        book book2 = new book("19of","George", 12.44);
        book2.display();
        book book3 = new book("Newspaper");
        book3.display();
    }
}