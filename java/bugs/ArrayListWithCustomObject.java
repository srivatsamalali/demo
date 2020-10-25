package bugs;

import java.util.ArrayList;
public class ArrayListWithCustomObject {
    public static void main(String[] args) {
      /*  //Variable Declaration
        Scanner sc = new Scanner();
        System.out.println("Welcome to Gir Store");
        System.out.println("If you are a seller, Press 1");
        System.out.println("If you are a buyer, Press 2");
        System.out.println("Select your Options:");
        int choice = sc.nextInt();
        System.out.println("Thank you for choosing option: " + choice + "\n Please Wait");
        if (choice == 1){
        }
        else if (choice == 2){
        }
        else{
            System.out.println("Please choose the given option.");
        }
     */
        //ArrayList
        ArrayList booksArrayList = new ArrayList();
        ArrayList groceriesArrayList = new ArrayList();
        
        Book book = new Book();
        Book book1 = new Book();
        booksArrayList.add(book);
        booksArrayList.add(book1);
        

        book.Author_name= "Robin Sharma";
        book1.Author_name= "Tony Robbins";

        
        for(int i = 0; i<booksArrayList.size(); i++) {
        	Book bookTemp = (Book) booksArrayList.get(i);
        	bookTemp.display();
        }
    }
}
class Product {
    public String product_name;
    public String Category = "General";
    public String product_desciption;
    public float product_price;
}
class Book extends Product {
    public String Category = "Books";
    public String Author_name;
    public String Release_date;
    public void display() {
        System.out.println("\n Book name: " + product_name);
        System.out.println("Category: " + Category);
        System.out.println("Description: " +product_desciption);
        System.out.println("Author: " + Author_name);
        System.out.println("Release_date: " + Release_date);
        System.out.println("Price: " + product_price + "\n");
    }
}
class Grocery extends Product {
    public String Category = "Grocery";
    public String Manufacturing_Company;
    public String Manufactured_date;
    public String Expiry_date;
public void display() {
        System.out.println("\n Product name:" + product_name);
        System.out.println("Category:" + Category);
        System.out.println("Description: " + product_desciption);
        System.out.println("Manufacturing_Company: " + Manufacturing_Company);
        System.out.println("Manufactured_date: " + Manufactured_date);
        System.out.println("Explairy Date: " + Expiry_date);
        System.out.println("Price: " + product_price + " per KG\n");
    }
}