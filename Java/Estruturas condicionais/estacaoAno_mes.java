
import java.util.Scanner;

public class estacaoAno_mes {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String estacao;

        System.out.println("User, voce quer saber qual a estacao predominante em qual mes do ano ?: ");
        String mes = scan.nextLine().toLowerCase();

        switch (mes) {
            case "dezembro":
            case "janeiro":
            case "fevereiro":
                estacao = "varao";
                break;

            case "março":
            case "abril":
            case "maio":
                estacao = "outono";
                break;
            case "junho":
            case "julho":
            case "agosto":
                estacao = "inverno";
                break;
            case "setembro":
            case "outubro":
            case "novembro":
                estacao = "primavera";
                break;
            default:
                estacao = "mês inválido";
        }
        System.out.println("A estacao predominante no mes " + mes + " eh " + estacao);
    }
}
