public class AbstractClassDemo {
   public static void main(String args[]){

   //Directly using the instance
   ITCompany iTCompany = new ITCompany();
   iTCompany.teaching();
   iTCompany.methodology();
   //Compilation error.
   //Education education = new Education();

   //Dynamic Polymorphism
   //we do know what is the instance?
   Education education = null;
   //here we get to know.
   education  = new ITCompany();
   education.teaching();
   education.methodology();
   //education.methodology();
   }
}

//mainly used for inheritance
abstract class Education{
   //abstract method cannot have a body
   public abstract void teaching();
   //concrete method or method with body
   public void methodology(){
      System.out.println("Face to face or Virtual");
   }
}
class ITCompany extends Education{
   public  void teaching(){
      System.out.println("Development");
   }
}

//ManufacturingCompany with teaching "Field Work"