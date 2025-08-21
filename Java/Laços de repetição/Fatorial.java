/*
Fatorial de um Número:
Crie um programa que peça ao usuário um número inteiro positivo e calcule o seu fatorial. 
O fatorial de um número (n!) é o produto de todos os inteiros positivos menores ou iguais a n. 
Por exemplo, 5! = 5 * 4 * 3 * 2 * 1 = 120.
 */

import java.util.Scanner;

public class Fatorial {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long f = 1;

        System.out.println("Insira o numero cujo fatorial voce quer descobrir: ");
        int num = scan.nextInt();
        if (num < 0) {
            System.out.println("--ERROR--");
            System.out.println("O numero é menor que 0");
            return;
        } else {
            for (int i = 1; i <= num; i++) {
                f *= i;
            }
            System.out.println("Fatorial de " + num + "=" + f);
        }
    }
}
