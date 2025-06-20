public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Starting the application...");
        logger2.log("Application running...");

        if (logger1.hashCode() == logger2.hashCode()) {
            System.out.println("Both logger instances are the same (Singleton works).");
        } else {
            System.out.println("Different logger instances (Singleton failed).");
        }
    }
}
