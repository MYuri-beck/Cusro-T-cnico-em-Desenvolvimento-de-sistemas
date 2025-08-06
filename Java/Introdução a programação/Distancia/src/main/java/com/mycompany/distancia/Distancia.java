
package com.mycompany.distancia;

import java.util.Scanner;
public class Distancia {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite a coordenada x do primeiro ponto:");
        double x1 = scan.nextDouble();
        
        System.out.println("Digite a coordenada y do primeiro ponto:");
        double y1 = scan.nextDouble();
        
        System.out.println("Digite a coordenada x do segundo ponto:");
        double x2 = scan.nextDouble();
        
        System.out.println("Digite a coordenada y do segundo ponto:");
        double y2 = scan.nextDouble();
        
        //Calculo da distância
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.println("A distancia entre os dois pontos no plano cartesiano é: " + dist);
    }
}
