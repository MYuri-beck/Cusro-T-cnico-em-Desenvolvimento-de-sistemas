import java.util.Scanner;
public class Par_impar {

   
    public static void main(String args[]) {
         Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
