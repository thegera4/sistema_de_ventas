package mx.com.domain.sales.test;

import mx.com.domain.sales.Order;
import mx.com.domain.sales.Product;

public class SalesTest {
  public static void main(String[] args) {
    Product product1 = new Product("Shirt", 50.00);
    Product product2 = new Product("Pants", 100.00);
    Product product3 = new Product("Socks", 20.00);
    Product product4 = new Product("Shoes", 200.00);
    Product product5 = new Product("Hat", 80.00);
    Product product6 = new Product("Gloves", 30.00);
    Product product7 = new Product("Scarf", 40.00);
    Product product8 = new Product("Jacket", 150.00);
    Product product9 = new Product("Sweater", 120.00);
    Product product10 = new Product("Tie", 60.00);

    Order order1 = new Order();
    order1.addProduct(product1);
    order1.addProduct(product2);
    order1.addProduct(product3);

    order1.showOrder();

    Order order2 = new Order();
    order2.addProduct(product4);
    order2.addProduct(product5);
    order2.addProduct(product6);
    order2.addProduct(product7);

    order2.showOrder();

    Order order3 = new Order();
    order3.addProduct(product8);
    order3.addProduct(product9);
    order3.addProduct(product10);
    order1.addProduct(product1);

    order3.showOrder();
  }
}
