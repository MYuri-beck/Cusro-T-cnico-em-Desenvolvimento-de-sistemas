/*Sequência de Fibonacci:
Elabore um programa que gere e imprima os N primeiros termos da sequência de Fibonacci,
onde N é um número informado pelo usuário. A sequência de Fibonacci começa com 0 e 1, 
e cada termo subsequente é a soma dos dois anteriores (0, 1, 1, 2, 3, 5, 8...).
 */
import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a quantidade de numeros de  Fibonacci uqe voce deseja saber:");
        int n = scan.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            b = a + b;  // calcula próximo
            a = b - a;  // atualiza a
        }
    }
}
