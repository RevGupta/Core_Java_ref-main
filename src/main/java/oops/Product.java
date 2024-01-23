package oops;

public class Product {
    double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Product obj = new Product();
        obj.setPrice(10);
        double price1 = obj.getPrice();
        double price2 = obj.getPrice(5);

        System.out.println("Price without Quantity = " + price1);
        System.out.println("Price with Quantity = " + price2);
    }

}
