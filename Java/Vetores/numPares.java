/*
 Exercício 7: Contando Números Pares
Objetivo: Utilizar estruturas condicionais dentro de um laço de repetição.
Faça um programa que leia 10 números inteiros, armazene-os em um vetor e, ao final, informe quantos números pares foram digitados.

 */
import java.util.Scanner;
public class numPares {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int num[] = new int [10];
        int count = 0;
        
        
        for(int i = 0 ; i < num.length; i++){
            System.out.print("Insira o " + (i + 1) + "° número inteiro: "); // Solicita o número ao usuário
            num[i] = scan.nextInt(); // Le o número inteiro e o armazena na posição 'i' do vetor
        }
        for (int number: num){
            if (number %2 == 0 ) count++;  
        }
        System.out.println("A quantidad de numeros pares é: " + count);
    }
}
