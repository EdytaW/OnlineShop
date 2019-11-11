import javax.naming.Name;

public class Product {

    String NameOfProduct;
    double Price;

    public Product(String nameOfProduct, double price) {
        NameOfProduct = nameOfProduct;
        Price = price;
    }

    public double getPrice() {
        return Price;
    }

    public String toString() {
        return NameOfProduct + " " + Price;

    }
}

