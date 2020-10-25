public class MultiLevelInheritance {
	public static void main(String[] args) {
   }
}

class A {
   public String message = "welcome";
	public A() { 
		System.out.println("A()");
	}
	public A(String pmessage) {
		System.out.println("A(String message)");
		message = pmessage;
	}

	public void disp() {
      System.out.println("base disp()");
      //System.out.println(message);
		//System.out.println("base or parent or super");
	}
}

class B {
   public B(){
   super();
   System.out.println("B()");
   }
   //overriding is the pricinple of the derived method supressing the base method.
	public void disp() {
       super.disp();
       System.out.println("dervied disp()");
		//System.out.println("base or parent or super");
	}
}

class C extends B, A{
   public C(){
   super();
   System.out.println("C()");
   }
   //overriding is the pricinple of the derived method supressing the base method.
	public void disp() {
       super.disp();
       System.out.println("dervied disp()");
		//System.out.println("base or parent or super");
	}
}