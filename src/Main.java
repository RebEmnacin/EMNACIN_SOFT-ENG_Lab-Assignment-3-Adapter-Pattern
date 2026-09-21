// Client
// The client only ever talks to PowerOutlet.plugIn() -
// it never needs to know each device's real method name.
public class Main {
    public static void main(String[] args) {
        PowerOutlet laptopOutlet = new LaptopAdapter(new Laptop());
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(new Refrigerator());
        PowerOutlet phoneOutlet = new SmartphoneAdapter(new SmartphoneCharger());

        laptopOutlet.plugIn();
        fridgeOutlet.plugIn();
        phoneOutlet.plugIn();
    }
}
