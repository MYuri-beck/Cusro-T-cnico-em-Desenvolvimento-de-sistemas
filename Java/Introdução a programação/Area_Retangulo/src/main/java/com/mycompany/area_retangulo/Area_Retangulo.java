
package com.mycompany.area_retangulo;

import java.util.Scanner;
public class Area_Retangulo {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        double base, altura;
        
        System.out.println("User, digite o valor da base do retangulo: ");
        base = scan.nextDouble();
        
        System.out.println("User, digite o valor da altura do retangulo: ");
        altura = scan.nextDouble();
        
        double area_retangulo =  (base*altura);
        
        
        System.out.println("A area do retângulo em questão é igual a: " + area_retangulo);
        
        
    }
}
