public class FineDiningOrder extends Order {
    private double serviceCharge;
    private boolean isReservation;

    public FineDiningOrder() {
    }

    public FineDiningOrder(double serviceCharge, boolean isReservation) {
        this.serviceCharge = serviceCharge;
        this.isReservation = isReservation;
    }

    public FineDiningOrder(int orderId, double basePrice, String itemlist, double serviceCharge, boolean isReservation) {
        super(orderId, basePrice, itemlist);
        this.serviceCharge = serviceCharge;
        this.isReservation = isReservation;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public boolean isReservation() {
        return isReservation;
    }

    public void setReservation(boolean reservation) {
        isReservation = reservation;
    }
    public double calculateTotal()
    {return getBasePrice() +serviceCharge;}


    @Override
    public String toString() {
        return "FineDiningOrder{" +
                "serviceCharge=" + serviceCharge +
                ", isReservation=" + isReservation +
                '}';
    }
}