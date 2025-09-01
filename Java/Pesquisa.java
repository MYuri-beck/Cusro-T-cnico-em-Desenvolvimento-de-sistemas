
import java.util.Scanner;


public class Pesquisa {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número de participantes: ");
        int N = scan.nextInt();

        // Contadores
        int torcedoresFigueira = 0;
        int torcedoresMarcilio = 0;
        int torcedoresOutros = 0;

        // Salários
        double somaSalarioFigueira = 0;

        // Nascidos
        int florianopolisMarcilio = 0;
        int outrasCidadesFigueira = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Qual o clube de sua preferência?");
            System.out.println("1) Figueirense");
            System.out.println("2) Marcílio Dias");
            System.out.println("3) Outros clubes");
            int clube = scan.nextInt();

            System.out.print("Informe o valor do seu salário: ");
            double salario = scan.nextDouble();

            System.out.println("Qual o seu local de nascimento?");
            System.out.println("1) Florianópolis");
            System.out.println("2) Outras cidades");
            int cidade = scan.nextInt();

            switch (clube) {
                case 1: // Figueirense
                    torcedoresFigueira++;
                    somaSalarioFigueira += salario;
                    if (cidade == 2) {
                        outrasCidadesFigueira++;
                    }
                    break;

                case 2: // Marcílio Dias
                    torcedoresMarcilio++;
                    if (cidade == 1) {
                        florianopolisMarcilio++;
                    }
                    break;

                case 3: // Outros clubes
                    torcedoresOutros++;
                    break;
            }
        }

        // Média salarial da torcida do Figueirense
        double mediaSalarioFigueira = (torcedoresFigueira > 0)
                ? somaSalarioFigueira / torcedoresFigueira
                : 0;

        // Saída final
        System.out.println("===== RESULTADOS DA PESQUISA =====");
        System.out.println("a) Número de torcedores por clube:");
        System.out.println("   Figueirense: " + torcedoresFigueira);
        System.out.println("   Marcílio Dias: " + torcedoresMarcilio);
        System.out.println("   Outros clubes: " + torcedoresOutros);

        System.out.println("b) Média salarial da torcida do Figueirense:");
        System.out.println("   R$ " + mediaSalarioFigueira);

        System.out.println("c) Número de pessoas nascidas em Florianópolis que torcem para o Marcílio Dias:");
        System.out.println("   " + florianopolisMarcilio);

        System.out.println("d) Número de pessoas nascidas em outras cidades que torcem para o Figueirense:");
        System.out.println("   " + outrasCidadesFigueira);
    }
}
