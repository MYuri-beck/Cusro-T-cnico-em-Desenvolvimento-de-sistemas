/*
Exercício 8: Buscando um Elemento
Objetivo: Aprender a verificar a existência de um valor em um vetor.
Escreva um programa que leia um vetor de 10 números inteiros. Em seguida, solicite um número ao usuário e 
verifique se este número está presente no vetor. 
Se estiver, imprima a posição (índice) em que foi encontrado. Caso contrário, informe que o número não foi encontrado.

 */
import java.util.Scanner;

public class BuscaValor {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean encontrado = false;

        System.out.println("Insira o numero que voce deseja procurar: ");
        int input = scan.nextInt();

        for (int i = 0; i < num.length; i++) {
            if (num[i] == input) {
                System.out.println("Numero encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) System.out.println("O numero não foi encontrado no vetor");
    }
}
