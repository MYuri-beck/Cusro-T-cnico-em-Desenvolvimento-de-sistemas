/*
 Exercício 6: Imprimindo a Ordem Inversa
Objetivo: Entender como percorrer um vetor em diferentes direções.
Crie um programa que leia um vetor de 8 posições e, em seguida, imprima seus elementos na ordem inversa (do último para o primeiro).

 */
public class InverteVetor {

    public static void main(String args[]) {
         //criação do vetor
        int [] numeros = {1,2,3,4,5,6,7,8};
        int [] inverso = new int [numeros.length];
        
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[numeros.length - 1 - i ]);
            inverso[i] = numeros[numeros.length - 1 - i ];
        }
        
    }
}
