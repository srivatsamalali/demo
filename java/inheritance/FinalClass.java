public class FinalClass {
	public static void main(String[] args) {
		// C obj = new C();
		// obj.display();

		// new C().display();

		new D().display();
		new D().display1();
	}
}
//final class cannot be inherited
final class A {

}
//cannot inherit final class
// class B extends A{

// }

class C {
public String test = "test";
public final String finalTest = "finaltest";

public void display(){
	test = "test changed";
	//finalTest = "finaltest changed";
	System.out.println(test);
		System.out.println(finalTest);
}

public final void display1(){
	test = "test changed";
	//finalTest = "finaltest changed";
	System.out.println(test);
		System.out.println(finalTest);
}
}
class D extends C{
public void display(){
	System.out.println("display() of D()");
}

// public  void display1(){
// 	System.out.println("display1() of D()");
// }
}