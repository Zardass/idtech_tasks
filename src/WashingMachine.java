public class WashingMachine extends ElectronicsProduct{
    private int warrantyPeriod;

    public WashingMachine(int productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public void extendWarrantyPeriod(int additionalWarrantyPeriod){
        if(additionalWarrantyPeriod > 0){
            warrantyPeriod += additionalWarrantyPeriod;
            System.out.println("warranty period added to " + additionalWarrantyPeriod + "  the additional period");
            System.out.println("total warranty: " + warrantyPeriod);
        }
        else {
            System.out.println("invalid warranty period");
        }
    }
}
