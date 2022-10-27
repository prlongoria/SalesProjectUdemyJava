package mx.com.gm.sales;

import mx.com.gm.sales.*;

public class SalesTest {
    public static void main(String[] args) {
        Product product1 = new Product("Shirt", 50.00);
        Product product2 = new Product("Trousers", 100.00);

        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);
        order1.showOrder();

        Product product3 = new Product("Skirt", 65.50);

        Order order2 = new Order();
        order2.addProduct(product1);
        order2.addProduct(product1);
        order2.addProduct(product3);
        order2.showOrder();
    }
}
