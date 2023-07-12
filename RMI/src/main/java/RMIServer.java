import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Tạo một đối tượng CalculatorImpl
            Calculator calculator = new CalculatorImpl();

            // Đăng ký đối tượng CalculatorImpl với RMI Registry
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("Calculator", calculator);

            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}