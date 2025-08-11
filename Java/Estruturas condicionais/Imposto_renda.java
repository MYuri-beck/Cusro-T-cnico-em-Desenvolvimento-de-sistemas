
import java.util.Scanner;

public class Imposto_renda {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        double imposto = 0;

        System.out.println("insira seu salario");
        double renda = scan.nextDouble();

        if (renda <= 2112) {
            System.out.println("Voce esta isento do imposto de renda ");

        } else if (renda <= 2826.65) {
            imposto = renda * 0.075;
        } else if (renda <= 3751.05) {
            imposto = renda * 0.15;
        } else if (renda <= 4664.68) {
            imposto = renda * 0.225;
        } else {
            imposto = renda * 0.275;
        }

        System.out.println("Voce tera que pagar: " + imposto + "de imposto de renda");

    }
}
