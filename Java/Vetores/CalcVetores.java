/*
 Exercício 10: Soma de Vetores
Objetivo: Praticar operações entre vetores de mesmo tamanho.
Desenvolva um programa que leia dois vetores de inteiros, vetorA e vetorB, c
ada um com 5 posições. Crie um terceiro vetor, vetorSoma, que conterá 
a soma dos elementos de vetorA e vetorB em suas respectivas posições (
ex: vetorSoma[0] = vetorA[0] + vetorB[0]). Ao final, imprima o vetorSoma.

 */
public class CalcVetores {


    public static void main(String[] args) {
        int vetorA[]= {1, 2, 3, 4, 5};
        int vetorB[] = {10, 20, 30, 40, 50};
        int vetorSoma[] = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor Soma:");
        for (int j = 0; j < vetorSoma.length; j++) {
            System.out.println("O valor contido no index " + j +" é: " + vetorSoma[j]);
        }
    }
}

