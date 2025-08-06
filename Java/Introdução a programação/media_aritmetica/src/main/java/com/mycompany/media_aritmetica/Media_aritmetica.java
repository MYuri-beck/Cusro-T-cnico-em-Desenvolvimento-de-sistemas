

package com.mycompany.media_aritmetica;

import java.util.Scanner;
public class Media_aritmetica {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        
        System.out.println("Insira a primeira nota do aluno: ");
        float n1 = scan.nextFloat();
        
        System.out.println("Insira a segunda nota do aluno: ");
        float n2 = scan.nextFloat();
        
        System.out.println("Insira a terceira nota do aluno: ");
        float n3 = scan.nextFloat();
        
        //calculando a media
        float media_ar = (n1+n2+n3) / 3 ;
        
        //imprimindo a nota para o user (por comando)
        System.out.println("A média aritmetica do aluno é igual a: " + media_ar);
    }
}
