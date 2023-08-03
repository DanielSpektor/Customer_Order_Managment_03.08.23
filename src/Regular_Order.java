import java.time.LocalDate;
import java.util.ArrayList;

public class Regular_Order extends Order{
    public Regular_Order(int id, String name, String deliveryAddress, Customer orderCustomer, int totalPrice, Payment_Type paymentType, LocalDate orderDate) {
        super(id, name, deliveryAddress, orderCustomer, totalPrice, paymentType, orderDate);
    }



}
