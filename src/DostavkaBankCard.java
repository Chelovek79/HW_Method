import java.util.Scanner;

public class DostavkaBankCard {
    public static String determinationDeliveryTime (int deliveryDistance) {
        String srocDostavki;
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            return srocDostavki = "1 день.";
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return srocDostavki = "2 дня.";
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            return srocDostavki = "3 дня.";
        }
        if (deliveryDistance > 100) {
            return srocDostavki = "по отдельной договорённости.";
        } return srocDostavki = " зайдите ;)))";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите расстояние ('+', '-' км) от нашего офиса до адреса доставки: ");
        int deliveryDistance = in.nextInt();
        System.out.println("Срок доставки банковской карты - " + determinationDeliveryTime(deliveryDistance));

    }
}
