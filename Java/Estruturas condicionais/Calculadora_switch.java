
import java.util.Scanner;

public class Calculadora_switch {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String operacao = "";
        double resultado;

        System.out.println("Insira o primeiro valor: ");
        double valor1 = scan.nextDouble();

        System.out.println("Insira o segundo valor: ");
        double valor2 = scan.nextDouble();

        System.out.println(
                "Digite + para somar dois números.\n"
                + "\n"
                + "Digite - para subtrair um número do outro.\n"
                + "\n"
                + "Digite * para multiplicar dois números.\n"
                + "\n"
                + "Digite / para dividir um número pelo outro.");

        switch (operacao) {
            case "+":
                resultado = valor1 + valor2;
                break;

            case "-":
                resultado = valor1 - valor2;
                break;

            case "*":
                resultado = valor1 * valor2;
                break;

            case "/":
                resultado = valor1 + valor2;
                break;
        }

    }
}
