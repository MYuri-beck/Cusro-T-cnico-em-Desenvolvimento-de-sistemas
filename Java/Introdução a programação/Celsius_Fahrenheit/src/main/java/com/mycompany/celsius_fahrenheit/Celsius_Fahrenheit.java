
package com.mycompany.celsius_fahrenheit;

import java.util.Scanner;
public class Celsius_Fahrenheit {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Insira a temperatura em graus Celsius (somente os numeros): ");
        double celsius = scan.nextDouble();
        
        double fahrenheit = (celsius * 1.8) + 32;
        
        System.out.println("A temperatura de " + celsius  + "C°, corresponde a " + fahrenheit + "F°");
    }
}
