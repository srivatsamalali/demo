
public class Materials {
   public static void main(String[] args) {
      // Make Door and set price
      Door door = new Door();
      door.price = 500;
      Window window = new Window();
      window.price = 600;

      Materials materials = new Materials();
      int price = 0;
      price = materials.addMaterial(door.price, window.price);
      System.out.println(price);

      door.price = 5;
      window.price = 6;
      
      price = materials.addMaterial(door, window);
      System.out.println(price);

      price = materials.addMaterial(door.price, window);
      System.out.println(price);
      price = materials.addMaterial(door, window.price);
      System.out.println(price);
      // Make Window and set price
      // use all 4 addMaterial
   }

   public int addMaterial(int doorPrice, int windowPrice) {
      return doorPrice + windowPrice;
   }

   public int addMaterial(Door door, Window window) {
      return door.price + window.price;
   }

   public int addMaterial(int doorPrice, Window window) {
      return doorPrice + window.price;
   }

   public int addMaterial(Door door, int windowPrice) {
      return door.price + windowPrice;
   }
}

class Door {
   int price;
}

class Window {
   int price;
}