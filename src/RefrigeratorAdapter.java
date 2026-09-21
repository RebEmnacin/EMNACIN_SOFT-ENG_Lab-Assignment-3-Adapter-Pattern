// Adapter
// Wraps a Refrigerator and exposes it through the PowerOutlet interface.
// Translation: plugIn() -> refrigerator.startCooling()
public class RefrigeratorAdapter implements PowerOutlet {
    private final Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public void plugIn() {
        refrigerator.startCooling();
    }
}
