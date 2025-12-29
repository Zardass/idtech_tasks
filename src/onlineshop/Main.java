package onlineshop;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        Product phone = new Product("Iphone",3400);
        Product laptop = new Product("Hp",4400);

        cart.addItem(phone,2);
        cart.addItem(laptop,3);
        cart.getTotalPrice();
        cart.removeItem(phone,1);
    }
}
