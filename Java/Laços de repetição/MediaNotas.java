    /*
    Média de Notas:
    Escreva um programa que solicite ao usuário a quantidade de notas que deseja inserir.
    Em seguida, peça para ele digitar cada uma das notas e, ao final, calcule e exiba a média aritmética.
    */
    import java.util.Scanner;
    public class MediaNotas {


        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            int notas = 0;
            System.out.println("Insira a quantidade de notas: ");
            int qtde = scan.nextInt();

            for(int i = 0; i < qtde; i ++){
                System.out.println("Insira a nota: ");
                notas += scan.nextInt();
            }
            double media = (double) notas / qtde;
            System.out.println("A media das notas inseridas é: " + media);
        }
    }
