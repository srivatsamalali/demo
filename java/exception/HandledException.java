public class HandledException {
    public static void main(String[] args) {
        int i = 100;
        int result = 0;
        System.out.println("Dividing by zero");
        try{
             result = i/0;
        }
        catch(Exception exception){
            System.out.println("Excep : ");
            System.out.println(exception.getMessage());
            System.out.println("Gracefully handling the exception!");
            System.out.println("Program does not terminate abruptly!");
        }
        System.out.println("Always not execute");
        System.out.println(result);
    }
}