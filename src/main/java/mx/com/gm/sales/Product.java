package mx.com.gm.sales;
//This is first class i have to build as the diagram UML shows:
public class Product {
    //atributes i am asked for:
    private final int idProduct;//it can be final or not. once it is modified i cannot modify it again
    private String name;
    private double price;
    private static int counterProducts;

    //empty constructor:initialices the counterProducts
    private Product(){
        this.idProduct = ++Product.counterProducts;//this is the only time i can modify the value of idProduct
    }

    //constructor that receives 2 arguments:
    public Product(String name, double price) {
        //i have to call the private constructor:
        this();
        //i inicialite the arguments:
        this.name = name;
        this.price = price;
    }
    //getters and setters for the private arguments:

    public int getIdProduct() {//only getter for idProduct because it is final
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCounterProducts() {
        return counterProducts;
    }

    public static void setCounterProducts(int counterProducts) {
        Product.counterProducts = counterProducts;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("idProduct=").append(idProduct);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
    //I have to develop class Order,now, because it is the class with Product class is related with
}
