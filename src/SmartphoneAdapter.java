// Adapter
// Wraps a SmartphoneCharger and exposes it through the PowerOutlet interface.
// Translation: plugIn() -> charger.chargePhone()
public class SmartphoneAdapter implements PowerOutlet {
    private final SmartphoneCharger charger;

    public SmartphoneAdapter(SmartphoneCharger charger) {
        this.charger = charger;
    }

    @Override
    public void plugIn() {
        charger.chargePhone();
    }
}
