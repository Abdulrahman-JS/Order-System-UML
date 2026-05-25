public class Order {
    private int orderId;
    private double basePrice;
    private String itemlist;

    public Order() {
    }

    public Order(int orderId, double basePrice, String itemlist) {
        this.orderId = orderId;
        this.basePrice = basePrice;
        this.itemlist = itemlist;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getItemlist() {
        return itemlist;
    }

    public void setItemlist(String itemlist) {
        this.itemlist = itemlist;
    }
    public double calculateTotal() {
        return basePrice ;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", basePrice=" + basePrice +
                ", itemlist='" + itemlist + '\'' +
                '}';
    }
}
