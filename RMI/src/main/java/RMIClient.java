import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Kết nối tới RMI Registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Lấy đối tượng Calculator từ RMI Registry
            Calculator calculator = (Calculator) registry.lookup("Calculator");

            // Gọi phương thức từ xa
            int result = calculator.add(5, 3);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}