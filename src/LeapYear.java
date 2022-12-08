import java.util.Scanner;

public class LeapYear {
    public static void checkYear (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yes;
        do {
            System.out.print("Укажите интересующий Вас год - ");
            int year = in.nextInt();
            checkYear(year);
            System.out.print("Желаете проверить ещё другой 'год': Да (1); Нет(0) - ");
            yes = in.nextInt();
            System.out.println("");
        } while (yes == 1);
    }
}