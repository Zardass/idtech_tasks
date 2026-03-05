package onlineshop;

public class ShoppingCart {

    private CartItem[] items = new CartItem[30];

    public void addItem(Product product, int quantity) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = new CartItem(quantity, product);
                System.out.println(quantity + "*" + product.getName() + " added to cart");
                break;
            }
        }
    }

    public void removeItem(Product product, int quantity) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println(quantity + "*" + product.getName() + " removed from cart");
                items[i] = null;
                break;
            }
        }
    }

    public void getTotalPrice() {
        double total = 0;
        for (CartItem item : items) {
            if (item != null) {
                total += item.getProduct().getPrice() * item.getQuantity();
            }
        }
        System.out.println("Total Price: " + total);
    }

}
