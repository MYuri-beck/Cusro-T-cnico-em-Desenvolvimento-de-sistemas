package com.mycompany.bhaskara;

import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Definição do Scan

        double a, b, c;

        //Requisicao de dados (user input)
        System.out.println("Calculadora de Bhaskara \n ----------------------");

        System.out.println("Insira o valor de A");
        a = scan.nextDouble();

        //verificacao: se "a" for igual a zero, printa a mensagem e encerra o programa
        if (a == 0) {
            System.out.println("O valor de A não pode ser zero em uma equação do segundo grau.");
            return;
        }

        System.out.println("Insira o valor de B");
        b = scan.nextDouble();

        System.out.println("Insira o valor de C");
        c = scan.nextDouble();

        //Calculos da aplicação
        double delta = getDelta(a, b, c);

        //verifica a quantidade de raizes
        if (delta < 0) {
            System.out.println("delta = " + delta + " \n nao existem raizes reais para sua equacao");
            return;
        }

        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);
   
        //exibicao de resultados
        if (r1 != r2) {
            System.out.println("A(s) raizes reais da sua equacao sao: " + r1 + " e " + r2);
        } else {
            System.out.println("A raiz real da sua equacao é: " + r1);
        }    
    }

    //Função para calcular o valor de delta 
    public static double getDelta(double a, double b, double c) {
        double delta = (b * b) - 4 * a * c;
        return delta;
    }

}
