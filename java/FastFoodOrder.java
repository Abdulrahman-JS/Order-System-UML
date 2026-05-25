public class FastFoodOrder extends Order {
    private double deliveryFee;

    public FastFoodOrder() {
    }

    public FastFoodOrder(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public FastFoodOrder(int orderId, double basePrice, String itemlist, double deliveryFee) {
        super(orderId, basePrice, itemlist);
        this.deliveryFee = deliveryFee;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }
public double calculateTotal(){
        return deliveryFee+getBasePrice();
}
    @Override
    public String toString() {
        return "FastFoodOrder{" +
                "deliveryFee=" + deliveryFee +
                '}';
    }
}
