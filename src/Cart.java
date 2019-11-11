import java.util.ArrayList;

import java.util.List;

public class Cart {

    double sum;

    List<Product> ListOfProducts = new ArrayList<>();

    public void addProduct(Product product) {
        ListOfProducts.add(product);

        sum = sum + product.getPrice();
    }

    public void removeProduct(Product product) {
        ListOfProducts.remove(product);
        sum = sum - product.getPrice();

    }

    public void pay(PaymentStrategy paymentMethod) {
        paymentMethod.pay(sum);

    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product Water = new Product("Water", 1.99);
        Product Bread = new Product("Bread", 2.50);
        Product Juice = new Product("Juice", 3.99);
        cart.addProduct(Water);
        cart.addProduct(Juice);
        cart.addProduct(Bread);
        cart.removeProduct(Juice);
        System.out.println("Your Bill: "+cart.ListOfProducts+"\nTo pay: "+cart.sum);

        CreditCard payment1 = new CreditCard(123, 456, 22, 12, 2018);
        cart.pay(payment1);
    }
    }


