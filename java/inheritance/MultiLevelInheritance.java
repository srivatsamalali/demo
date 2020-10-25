public class MultiLevelInheritance {
	public static void main(String[] args) {
      // A obj = new A();
      // obj.disp();
      // A obj1 = new A("Today is a great day!");
      // obj1.disp();

      // B bobj = new B();
      // bobj.disp();

      
      C cobj = new C();
      cobj.disp();
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

class B extends A{
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

class C extends B{
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