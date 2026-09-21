// Adaptee
// Laptop has its own method name (charge) that does NOT match PowerOutlet's plugIn().
public class Laptop {
    public void charge() {
        System.out.println("Laptop is charging...");
    }
}
