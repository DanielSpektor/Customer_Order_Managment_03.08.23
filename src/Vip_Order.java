import java.time.LocalDate;

public class Vip_Order extends Order{

    public Vip_Order(int id, String name, String deliveryAddress, Customer orderCustomer, Payment_Type paymentType, LocalDate orderDate) {
        super(id, name, deliveryAddress, orderCustomer, paymentType, orderDate);
    }

}
