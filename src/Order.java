import java.time.LocalDate;
import java.util.ArrayList;

public class Order {

    private int id;
    private String name;
    private String deliveryAddress;
    private ArrayList<Items> listOfItems;
    private Customer orderCustomer;
    private double totalPrice;
    private Payment_Type paymentType;
    private LocalDate orderDate;


    public Order(int id, String name, String deliveryAddress, Customer orderCustomer,double totalPrice, Payment_Type paymentType, LocalDate orderDate) {
        this.id = id;
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.listOfItems = new ArrayList<Items>();
        this.orderCustomer = orderCustomer;
        this.totalPrice = totalPrice;
        this.paymentType = paymentType;
        this.orderDate = orderDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Customer getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(Customer orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<Items> getListOfItems() {
        return listOfItems;
    }

//    public void sumOrder() {
//        int sum = 0;
//        for (int i = 0; i < this.getListOfItems().size(); i++) {
//            sum += this.getListOfItems().get(i).getItemPrice();
//        }
//        this.setTotalPrice(sum);
//    }
//
//    public void productOrder() {
//        int product = 0;
//        for (int i = 0; i < this.getListOfItems().size(); i++) {
//            product *= this.getListOfItems().get(i).getItemPrice();
//        }
//        this.setTotalPrice(product);
//    }

}
