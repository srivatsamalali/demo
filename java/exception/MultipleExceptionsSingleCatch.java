package exception_handling;
class Test50
{
	int value = 10;
} 
public class MultipleExceptionsSingleCatch {
public static void main(String[] args) {
	Test50 Test50 = null;
	Test50 = new Test50();
	try {
		System.out.println(Test50.value);

	} catch (NullPointerException  | ArithmeticException e) {
		System.out.println("Exception occured");
	}
}

}
