public class UnhandledException {

    public static void main(String[] args) {
        int i = 100;
        System.out.println("Dividing by zero");
        System.out.println("This application will terminate abruptly!");
        int zero = 0;
        int result = i/zero;
        System.out.println("Does not execute");
        System.out.println(result);
    }
}