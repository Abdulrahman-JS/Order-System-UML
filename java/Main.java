import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static ArrayList<FineDiningOrder> DataFill(ArrayList<FineDiningOrder> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========");
        System.out.println("enter data Order");
        System.out.println("========");

        for (int i = 1; i <= 5; i++) {
            System.out.println("\n---- order number " + i + "----");

            System.out.println("Enter Order ID:");
            int orderId = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Order Price:");
            double orderPrice = sc.nextDouble();
            sc.nextLine();

            System.out.println("enter itemlist:");
            String itemlist = sc.nextLine();

            System.out.println("enter service charge:");
            double serviceCharge = sc.nextDouble();
            sc.nextLine();

            System.out.println("is there a reservation? (true/false):");
            boolean isReservation = sc.nextBoolean();
            sc.nextLine();

            FineDiningOrder order = new FineDiningOrder(
                    orderId, orderPrice, itemlist, serviceCharge, isReservation
            );
            list.add(order);
            System.out.println("order added successfully!");
        }

        sc.close();
        return list;
    }

    public static ArrayList<FineDiningOrder> DataPrint(ArrayList<FineDiningOrder> list) {
        System.out.println("\n=========");
        System.out.println("orders with total greater than 100");
        System.out.println("===============");

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            FineDiningOrder current = list.get(i);

            if (current.calculateTotal() > 100) {
                System.out.println("\nOrder " + (i + 1) + ":");
                System.out.println("  Order ID       : " + current.getOrderId());
                System.out.println("  Items          : " + current.getItemlist());
                System.out.println("  Base Price     : " + current.getBasePrice());
                System.out.println("  Service Charge : " + current.getServiceCharge());
                System.out.println("  Reservation    : " + current.isReservation());
                System.out.println("  ─────────────────────");
                System.out.println("  Total          : " + current.calculateTotal());
                found = true;
            }
        }

        if (!found) {
            System.out.println("no orders exceed 100");
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<FineDiningOrder> ordersList = new ArrayList<>(5);
        ordersList = DataFill(ordersList);
        DataPrint(ordersList);
    }
}