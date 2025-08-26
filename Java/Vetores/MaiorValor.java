/*Exercício 4: Encontrando o Maior Valor
Objetivo: Desenvolver a lógica para encontrar um valor específico dentro de um vetor.
Desenvolva um programa que leia 10 números do tipo double e os armazene em um vetor. 
O programa deve então encontrar e imprimir o maior valor presente no vetor.

 */
import java.util.Scanner;

public class MaiorValor {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double maiorValor;

        //criação do vetor
        double[] numeros = new double[10];

        // Laço para solicitar e armazenar os números no vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o " + (i + 1) + "° número: "); // Solicita o número ao usuário
            numeros[i] = scan.nextDouble(); // Le o número inteiro e o armazena na posição 'i' do vetor
        }
        maiorValor = numeros[0]; //por causa do for-each declaramos que o maior valor é o do indice 0
        for (double valor : numeros) {
            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }
        System.out.println("O maior valor presente no vetor é: " + maiorValor);
    }
}
