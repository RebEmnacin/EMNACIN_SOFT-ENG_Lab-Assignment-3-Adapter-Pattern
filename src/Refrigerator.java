// Adaptee
// Refrigerator has its own method name (startCooling) that does NOT match PowerOutlet's plugIn().
public class Refrigerator {
    public void startCooling() {
        System.out.println("Refrigerator is cooling...");
    }
}
