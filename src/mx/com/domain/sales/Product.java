package mx.com.domain.sales;

public class Product {
  private final int productId;
  private String name;
  private double price;

  private static int productCounter;

  private Product() {
    this.productId = ++Product.productCounter;
  }

  public Product(String name, double price) {
    this();
    this.name = name;
    this.price = price;
  }

  public int getProductId() {
    return this.productId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return this.productId + "   " + this.name + "   " + this.price;
  }

}
