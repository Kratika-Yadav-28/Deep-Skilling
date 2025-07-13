public class test {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started");
        logger2.log("Logging second message");


        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton confirmed)");
        } else {
            System.out.println("Different logger instances (Singleton failed)");
        }
    }
}
