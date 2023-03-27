public class Order {
    private int id;
    private String phone;
    private String item;
    private int quantity;

    public Order(String phone, String item, int quantity) {
        this.phone = phone;
        this.item = item;
        this.quantity = quantity;
    }

    public Order(int id, String phone, String item, int quantity) {
        this.id = id;
        this.phone = phone;
        this.item = item;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}
