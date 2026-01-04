public class ElectronicsProduct {
    private int productId;
    private String name;
    private double price;

    public ElectronicsProduct(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100 ) {
            price = price -((price * discountPercentage) /  100);
            System.out.println("price with discount percentage: " + price);
        }
        else{
            System.out.println("Invalid discount percentage");
        }
    }

    @Override
    public String toString() {
        return "ElectronicsProduct{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
