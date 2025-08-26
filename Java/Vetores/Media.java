
import java.util.Scanner;

/*
 Exercício 5: Média dos Elementos
Objetivo: Combinar iteração e cálculos aritméticos.
Escreva um programa que armazene as notas de 4 provas de um aluno em um vetor. 
O programa deve calcular e imprimir a média dessas notas.
 */
public class Media {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double notaTotal = 0;

        //criação do vetor
       
        double[] notas = new double[4];

        // Laço para solicitar e armazenar os valores no vetor
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Insira o " + (i + 1) + "° número: "); // Solicita o número ao usuário
            notas[i] = scan.nextDouble(); // Le o número inteiro e o armazena na posição 'i' do vetor
        }

        for (double valor : notas) {
            notaTotal += valor;

        }
        notaTotal = notaTotal / qtdeNotas;
        System.out.println("A media do aluno é: " + notaTotal);
    }
}
