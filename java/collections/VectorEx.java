import java.util.Vector;
import java.util.Collections;
public class VectorEx{
public static void main(String[] args) {
   start();
}
   public static void start(){
      Vector players = new Vector();
      players.add("Rambo");
      players.add("John");
      players.add(null);
      players.add(null);
      players.add("John");
      System.out.println(players);
      players.set(2,"Akshay");
      System.out.println(players);
      players.remove(3);
      System.out.println(players);
      System.out.println(players.size());
      Collections.sort(players);
      for(Object player : players){
         System.out.println(player);
      }
      System.out.println(players);
      players.clear();
      System.out.println(players);
   }
}

// allows nulls
// allows duplicates
// insertion order
// sysout(players) ? 
// players.add(5);
// players.add(5.5f);
// change the 3rd item to Akshay?
// remove the 4 th item which is null.
// print the size of the Vector.
// display the collection in sorted order
// remove the second element
// iterate and display the elements
// remove all the elements



