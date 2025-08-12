
import java.util.Scanner;
import java.time.Year;

public class Valida_data {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o dia: ");
        int day = scan.nextInt();
        System.out.println("Insira o numero do mes: ");
        int month = scan.nextInt();
        System.out.println("Insira o ano: ");
        int year = scan.nextInt();

        boolean leapYear = Year.isLeap(year);

        if (year > 0 && day > 0 && month > 0 && month <= 12) {

            int maxDays;

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    maxDays = 31;
                    break;

                case 2:
                    if (leapYear) {
                        maxDays = 29;
                    } else {
                        maxDays = 28;
                    }
                    break;

                default:
                    maxDays = 30;
            }

            if (day <= maxDays) {
                System.out.println("Data valida");
            } else {
                System.out.println("Data invalida");
            }
        } else {
            System.out.println("Data invalida");
        }

    }
}
    