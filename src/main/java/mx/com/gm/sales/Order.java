package mx.com.gm.sales;

public class Order {
    //attributes:
    private int idOrder;
    private  Product products[];//i declare the array
    private static int counterOrders;//variable which allows me to know how many objects of Product type have
    // been created
    private int counterProducts;//to know how many objects of type products[] have been added to the object of Order
    private static final int MAX_PRODUCTS = 10;
     //empty constructor:
    public Order() {
        this.idOrder = ++Order.counterOrders;
        this.products = new Product[Order.MAX_PRODUCTS];//inicialices array products so i can already add elements to it

    }

    //methods:
    public void addProduct(Product product) {
        if(this.counterProducts < Order.MAX_PRODUCTS) {
            this.products[this.counterProducts++] = product;//for each product i add the variable products increases,
            // but after index [0], this is why i put ++ after and not before
        }
        else {
            System.out.println("Oveloaded max products: " + Order.MAX_PRODUCTS);//prints the maximun number of products
            //that can be added to array products
        }

    }

    public double calcTotal() {
        double total = 0;
        for (int i = 0; i < this.counterProducts; i++) {
            //Product product = this.products[i];
            //total += product.getPrice();//total+producto.getPrice

            total += this.products[i].getPrice();//this is best practise than use both previous lines so i use only 1 line
            //I obtain the price of each product so at the end i get the total of all prices
        }
          return total;
    }

    public void showOrder() {
        System.out.println("Id Order: " + this.idOrder);

        double totalOrder = this.calcTotal();;
        System.out.println("Total of the Order: " + totalOrder);
        System.out.println("Order Products: ");
        for (int i = 0; i < this.counterProducts; i++) {
            System.out.println(this.products[i]);
        }
    }

}
