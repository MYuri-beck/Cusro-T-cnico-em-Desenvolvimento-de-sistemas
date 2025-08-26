/*
 *Exercício 3: Calculando a Soma dos Elementos
Objetivo: Praticar a iteração sobre um vetor para realizar cálculos.
Crie um programa que leia 6 números inteiros e os armazene em um vetor. 
Em seguida, calcule e exiba a soma de todos os elementos do vetor.

 */
import java.util.Scanner;
public class SomaElementos {

  
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        
         //criação do vetor
        
        int[] numeros = new int[6];
        
        for(int i = 0 ; i < numeros.length; i++){
            System.out.println("Insira um n° inteiro: ");
            numeros[i] = scan.nextInt();
        }
        //for-each para calcular a soma de todos os elementos do vetor
        for (int num: numeros){
            soma = soma + num;
        }
        System.out.println("A soma de todos os valores inseridos é: " + soma); // Exibe o resultado da soma
        }
    }

