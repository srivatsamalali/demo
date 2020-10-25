public class ConstructorExample{
   public static void main(String args[]){
      //create the reference
      Mobile samsungMobile;
      //create an instance and assign it to the reference
      samsungMobile = new Mobile();
      //call the method
      samsungMobile.display();

      Mobile samsungMobile1 = new Mobile("Nokia", 567f);
      samsungMobile1.display();
   }
}

class Mobile{
   String name;
   float price;

   //Constructors are functions without a return type
   //same name of the class
   // purpose is to initialize variables
   // default constructor does not contain parameter
   public Mobile(){
      System.out.println("Default Constructor");
      name = "Samsung";
      price = 30.50f;
   }
   public Mobile(String pName, float pPrice){
      System.out.println("Parameterized Constructor");
      name =pName;
      price = pPrice;
   }
   public void display(){
      System.out.println(name);
      System.out.println(price);
   }
}