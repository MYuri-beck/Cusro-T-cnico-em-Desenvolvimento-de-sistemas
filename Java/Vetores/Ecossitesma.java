import java.util.Scanner;

public class Ecossitesma {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        double coelhos[] = new double[12];
        double raposas[] = new double[12];
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        // Entrada de dados iniciais
        System.out.println("Qual a população inicial de coelhos?");
        coelhos[0] = scan.nextInt();

        System.out.println("Qual a população inicial de raposas?");
        raposas[0] = scan.nextInt();

        // Simulação para os 12 meses
        for (int i = 0; i < 11; i++) {
            coelhos[i + 1] = coelhos[i] + (0.1 * coelhos[i]) - (0.01 * coelhos[i] * raposas[i]);
            raposas[i + 1] = raposas[i] - (0.1 * raposas[i]) + (0.002 * coelhos[i] * raposas[i]);
        }

        // Encontrar o mês de pico para os coelhos
        int maiorValorCoelhos = 0;
        for (int i = 1; i < coelhos.length; i++) {
            if (coelhos[i] > coelhos[maiorValorCoelhos]) {
                maiorValorCoelhos = i;
            }
        }
        
        // Encontrar o mês de pico para as raposas
        int maiorValorRaposas = 0;
        for (int i = 1; i < raposas.length; i++) {
            if (raposas[i] > raposas[maiorValorRaposas]) {
                maiorValorRaposas = i;
            }
        }

        // Exibir resultados
        System.out.println("Mês de pico populacional das raposas: " + meses[maiorValorRaposas]);
        System.out.println("Mês de pico populacional dos coelhos: " + meses[maiorValorCoelhos]);
    }
}
