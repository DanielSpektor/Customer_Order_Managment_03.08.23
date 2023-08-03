import java.util.ArrayList;

public class Customer implements Giftable{

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private Customer_Type customerType;
    private int customerDiscount;
    private ArrayList<Favorite_Items> listOfFavItems;
    private Giftable customerGift;
    public boolean isVip;

    public Customer(int id, String firstName, String lastName, String email, String deliveryAddress, Customer_Type customerType, int customerDiscount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
        this.listOfFavItems = new ArrayList<Favorite_Items>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Customer_Type getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Customer_Type customerType) {
        this.customerType = customerType;
    }

    public int getCustomerDiscount() {
        return customerDiscount;
    }

    public void setCustomerDiscount(int customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    public ArrayList<Favorite_Items> getListOfFavItems() {
        return listOfFavItems;
    }

    public void setListOfFavItems(ArrayList<Favorite_Items> listOfFavItems) {
        this.listOfFavItems = listOfFavItems;
    }

    public Giftable getCustomerGift() {
        return customerGift;
    }

    public void setCustomerGift(Giftable customerGift) {
        this.customerGift = customerGift;
    }


    @Override
    public void openGift() {

    }
}
