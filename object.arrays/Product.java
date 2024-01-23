package object.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;
import java.util.List;

public class Product implements Comparable<Product> {
    int id;
    double price;
    int weight;

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public Product(int id, double price, int weight) {
        this.id = id;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", price=" + price + ", weight=" + weight + "]";
    }

    public int compareTo(Product that) {
        if (this.id > that.id)
            return 1;
        else
            return -1;

    }

}

class Demo {
    public static void main(String[] args) {

        List<Product> prod = new ArrayList();
        prod.add(new Product(14, 40.0, 50));
        prod.add(new Product(22, 50.0, 25));
        prod.add(new Product(5, 20.0, 75));
        prod.add(new Product(33, 30.0, 100));

        Collections.sort(prod);

        for (Product s : prod)
            System.out.println(s);

    }
}
