/*Conceito de Aluno: Elabore um programa que leia a nota de um aluno (0 a 10) e 
atribua um conceito: A (9-10), B (7-8.9), C (5-6.9) ou D (abaixo de 5).*/

import java.util.Scanner;

public class Conceito_aluno {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        char conceito = ' ';

        System.out.println("Insira a nota do aluno: ");
        double nota = scan.nextDouble();

        if (nota >= 9 && nota <= 10) {
            conceito = 'A';
        } else if (nota >= 7 && nota <= 8.9) {
            conceito = 'B';
        } else if (nota >= 5 && nota <= 6.9) {
            conceito = 'C';
        } else {
            conceito = 'D';
        }
        
        System.out.println("O conceito do aluno é: " + conceito);
    }
}
