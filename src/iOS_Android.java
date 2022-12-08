import java.time.LocalDate;
import java.util.Scanner;

public class iOS_Android {

    public static void checkTelephone (int os, int clientDeviceYear, int currentYear) {
        if (os == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для 'IOS' по ссылке...");
        } else
        if (os == 0 && clientDeviceYear == currentYear ) {
            System.out.println("Установите версию нашего приложения для 'IOS' по ссылке...");
        }
        if (os == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для 'Android' по ссылке...");
        } else
        if (os == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию нашего приложения для 'Android' по ссылке...");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();
        System.out.println("Предлагаем установить новую версию нашего приложения. ;)");
        System.out.print("Укажите OC Вашего телефона: 'iOS' - '0'; 'Android' - '1' - ");
        int os = in.nextInt();
        if (os != 0 && os != 1) {
            throw new RuntimeException("Некорректный ввод. Удачи.");
        }
        System.out.print("Укажите дату выпуска Вашего телефона - ");
        int clientDeviceYear = in.nextInt();
        if (clientDeviceYear < 2002 || clientDeviceYear > currentYear) {
            throw new RuntimeException("Указана некорректная дата производства !!!");
        }
        checkTelephone (os, clientDeviceYear, currentYear);
    }
}
