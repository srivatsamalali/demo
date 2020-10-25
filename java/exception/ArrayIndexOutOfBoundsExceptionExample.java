public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		int num[] = { 23, 34, 223, 66, 678 };
		System.out.println(num[3]);
		try {
			//System.out.println(num[-1]);	
			System.out.println(num[4]);		
			//System.out.println(num[5]);		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + " check index bounds");
		}
		System.out.println("Program continues normally!");
	}
}