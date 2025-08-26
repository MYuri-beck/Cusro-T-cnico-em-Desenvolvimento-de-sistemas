
import java.util.Arrays;

/*
Exercício 9: Copiando Elementos para Outro Vetor
Objetivo: Trabalhar com a manipulação de múltiplos vetores.
Crie um programa que declare um vetor com 5 nomes de frutas. 
Em seguida, crie um segundo vetor de mesmo tamanho e copie todos os elementos do primeiro vetor para o segundo.
Ao final, imprima os elementos do segundo vetor.
 */
public class copiaVetor {

    public static void main(String args[]) {
        String berry[] = {"banana", "abacate", "tomate", "bergamota", "abacaxi"};
        String berryCopy[] = new String[berry.length];

        for (int i = 0; i < berry.length; i++) {
            berryCopy[i] = berry[i];
        }
        for (int j = 0; j < berryCopy.length; j++) {
            System.out.println(berryCopy[j]);
        }
    }
}
