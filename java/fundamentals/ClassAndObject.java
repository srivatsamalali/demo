
package fundamentals;

public class ClassAndObject
{
	public static void main(String[] args) {
		//Create a referene
		Product product = null;
		//create instance
		product = new Product();
		//access the member variables
		System.out.println(product.productNameString);
		System.out.println(product.descriptoinString);
		System.out.println(product.price);
		//access the member functions
		product.displayDetails();
	}
}
 class Product {
	public String productNameString;
	public String descriptoinString;
	public float price;

	public void displayDetails() {
		System.out.println(productNameString);
		System.out.println(descriptoinString);
		System.out.println(price);
	}	
}
