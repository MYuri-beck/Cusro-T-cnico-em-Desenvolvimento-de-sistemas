
import java.util.Scanner;

public class Conversor_Unidades {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("---MENU DE CONVERSÃO---");
        System.out.println(" ");
        System.out.println("1 - Celsius --> Fahrenheit");
        System.out.println("2 - Quilometros --> Milhas");
        System.out.println("3 - Litros --> Galões");
        System.out.print("Escolha uma opção: ");

        int input = scan.nextInt();

        switch (input) {
            case 1:
                System.out.println("Insira a temperatura em C°: ");
                double celsius = scan.nextDouble();
                double fahrenheit = (celsius * 1.8) + 32;
                System.out.println(fahrenheit);
                break;

            case 2:
                System.out.print("Digite a distancia em quilometros: ");
                double km = scan.nextDouble();
                
                double milhas = km * 0.621371;
                
                System.out.println(milhas);
                break;

            case 3:
                System.out.println("Digite a quantidade em litros: ");
                double litros = scan.nextDouble();
                
                double galoes = litros * 0.264172;

                System.out.println(galoes);
                break;
        }
    }
}
