package mx.com.domain.sales;

public class Order {
  private final int orderId;
  private final Product[] products;
  private static int orderCounter;
  private int productCounter;
  private final static int MAX_PRODUCTS = 10;

  public Order() {
    this.orderId = ++Order.orderCounter;
    this.products = new Product[Order.MAX_PRODUCTS];
  }

  public void addProduct(Product product) {
    if (this.productCounter < Order.MAX_PRODUCTS) {
      this.products[productCounter++] = product;
    } else {
      System.out.println("You have reached the maximum number of products: " + Order.MAX_PRODUCTS);
    }
  }

  public double calculateTotal() {
    double total = 0;
    for (int i = 0; i < this.productCounter; i++) {
      total += this.products[i].getPrice();
    }
    return total;
  }

  public void showOrder() {
    System.out.println("Order id: " + this.orderId);
    System.out.println("Products included in your order: ");
    System.out.println("ID   Name   Price");
    for (int i = 0; i < this.productCounter; i++) System.out.println(this.products[i]);
    System.out.println("Total: " + this.calculateTotal() + "\n");
  }
}
