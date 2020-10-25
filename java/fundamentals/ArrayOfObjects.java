package fundamentals;

public class ArrayOfObjects
{
	public static void main(String[] args) {
		//Create an array of products
		//[2] is the array dimension
		Product [] products = new Product[2];
		
		//Create a new product and add it to the array
		products[0] = new Product();
		products[0].productNameString = "Java";
		products[0].descriptoinString = "The Java Course";
		products[0].price = 500.50f;
		
		Product product2 =  new Product();
		product2.productNameString = "Angular";
		product2.descriptoinString = "The Angular Course";
		product2.price = 5005.50f;
		products[1] = product2;
		//manual iteration
		for(int i = 0; i< products.length; i++) {			
//			Product product = products[i];
//			product.displayDetails();		
			products[i].displayDetails();
		}		
		//enhanced for loop
		for(Product product : products) {
			product.displayDetails();
		}
	}
}
 class Product1 {
	public String productNameString;
	public String descriptoinString;
	public float price;

	public void displayDetails() {
		System.out.println(productNameString);
		System.out.println(descriptoinString);
		System.out.println(price);
	}	
}