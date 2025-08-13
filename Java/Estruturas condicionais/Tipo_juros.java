
import java.util.Scanner;

public class Tipo_juros {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        double montante = 0.0;

        System.out.println("Escolha o tipo de juros:");
        System.out.println("1 - Juros Simples");
        System.out.println("2 - Juros Compostos");
        int tipo = scan.nextInt();

        System.out.println("Insira o capital inicial: ");
        double capitalInicial = scan.nextDouble();

        System.out.println("Insira a taxa anual (em %): ");
        double taxaAnual = scan.nextDouble();
        
        //CONVERTENDO PARA DECIMAL
        taxaAnual = taxaAnual / 100;
        
        System.out.println("Insira o tempo de investimento em anos: ");
        int tempoInvestimento = scan.nextInt();

        if (tipo == 1) {
            montante = capitalInicial * (1 + taxaAnual * tempoInvestimento);
            System.out.println("montante é igual a: " + montante);
        } else if (tipo == 2) {
            montante = capitalInicial * Math.pow(1 + taxaAnual, tempoInvestimento);
            System.out.println("montante é igual a: " + montante);
        } else {
            System.out.println("Opção invalida");
        }
    }
}
