/*
 Exercício 2: Lendo Valores para um Vetor
Objetivo: Aprender a receber dados do usuário e armazená-los em um vetor.
Escreva um programa que solicite ao usuário 5 números inteiros e os armazene em um vetor. 
Ao final, o programa deve imprimir todos os números digitados.

 */
import java.util.Scanner;
public class VetorInput {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); //definiçção do scanner
        
        //criação do vetor
        int[] numeros = new int[5];
        
        // Laço para solicitar e armazenar os números no vetor
        for(int i = 0 ; i < numeros.length; i++){
            System.out.print("Insira o " + (i + 1) + "° número inteiro: "); // Solicita o número ao usuário
            numeros[i] = scan.nextInt(); // Le o número inteiro e o armazena na posição 'i' do vetor
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numeros[i]); //imprime cada elemento com sua posição
        }
    }
}
