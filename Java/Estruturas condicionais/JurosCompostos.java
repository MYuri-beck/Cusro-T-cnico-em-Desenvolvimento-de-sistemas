/* Cálculo de Juros Compostos: Crie um programa que simule um investimento. 
Peça ao usuário o capital inicial, a taxa de juros anual e o tempo do investimento em anos. 
Se o tempo for maior que 5 anos, aplique um bônus de 1% sobre a taxa de juros informada 
antes de calcular o montante final com juros compostos. Exiba o montante final.
A fórmula do montante é M = C * (1 + i)^t.*/


import java.util.Scanner;
public class JurosCompostos {

   
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o capital inicial: ");
        double capitalInicial = scan.nextDouble();
        
        System.out.println("Insira a taxa anual (em %): ");
        double taxaAnual = scan.nextDouble();
        
        System.out.println("Insira o tempo de investimento em anos: ");
        int tempoInvestimento = scan.nextInt();
            
        double montante  = calcula_montante(capitalInicial, taxaAnual, tempoInvestimento);
        System.out.println("O montante final é: " + montante);
    }
    
    public static double calcula_montante (double capital, double taxa, int tempo){
        
        //se o tempo de investimento for maior que 5 anos
        if (tempo > 5){
        taxa += 1;
        }
        
        //converte a taxa para decimal 
        taxa = taxa / 100;
        //calculo de montante
       double montante = capital * Math.pow(1 + taxa, tempo);
       return montante;
    } 
}
