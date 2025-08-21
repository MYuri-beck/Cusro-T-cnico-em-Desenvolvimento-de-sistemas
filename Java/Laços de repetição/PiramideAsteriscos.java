
import java.util.Scanner;

public class PiramideAsteriscos {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a altura da pirâmide: ");
        int altura = scan.nextInt();

        int i = 1; // a linha atual
        while (i <= altura) {
            // imprime  os espaços
            int j = 1;
            while (j <= altura - i) {
                System.out.print(" ");
                j++;
            }

            // imprime  asteriscos ******
            int k = 1;
            while (k <= 2 * i - 1) {
                System.out.print("*");
                k++;
            }

            // pular linha
            System.out.println();
            i++;
        }
    }
}
