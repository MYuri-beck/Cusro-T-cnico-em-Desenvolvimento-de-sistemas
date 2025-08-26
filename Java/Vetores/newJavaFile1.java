/*
Exercício 1: Declarando e Inicializando um Vetor
Objetivo: Entender a sintaxe básica de criação de um vetor.
Crie um programa que declare um vetor de inteiros com 5 posições. Em seguida, preencha este vetor com os números de 1 a 5 e imprima cada um dos elementos na tela.

 */
public class newJavaFile1 {

    public static void main(String args[]) {
        int vetor[] = {1, 2, 3, 4, 5};

        System.out.println("O vetor tem os valores: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
