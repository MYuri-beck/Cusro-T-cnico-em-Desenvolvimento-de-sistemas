
import java.util.Scanner;

public class CalculoFuncionarios {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Calculadora de imposto de renda da empressa");

        int funcionarios = 58; //quantidade de funcionários
        double folhaPagamento = 0; //salário a ser digitado pelo usuário
        double impostoRenda = 0;
        double irrf = 0;
        double inss = 0;
        double planoSaude = 0;
        double salarioLiquido = 0;

        for (int i = 0; i < funcionarios; i++) {
            System.out.println("Digite o salário bruto: ");
            double salarioBruto = scan.nextDouble();

            //Calculando o imposto de renda sobre o salario da cada funcionário
            if (salarioBruto <= 1434.59) {
                irrf = 0;
            } else if (salarioBruto <= 2866.70) {
                irrf = (salarioBruto * 0.15) - 215.19;
            } else {
                irrf = (salarioBruto * 0.275) - 573.52;
            }

            //Calculando o valor do INSS sobre o salario(bruto) de cada trabalhador
            if (salarioBruto <= 911.70) {
                inss = salarioBruto * 0.08;
            } else if (salarioBruto <= 1519.50) {
                inss = salarioBruto * 0.09;
            } else if (salarioBruto <= 3038.99) {
                inss = salarioBruto * 0.11;
            } else {
                inss = 334.29;
            }

            //Calculando a txa do plano de saúde
            planoSaude = salarioBruto * 0.045;

            //Calculando o salario líquido de cada funcionário 
            salarioLiquido = salarioBruto - (inss + irrf + planoSaude);

            //Calculos da empressa
            folhaPagamento += salarioBruto; //toda vez que o for rodar ele vai adicionar o salario bruto inserido
            impostoRenda += irrf; //toda vez que o for rodar ele vai adicionar o imposto do salario de cada trabalhador 

            System.out.println("O salario liquido desse funcionario é: R$" + salarioLiquido);
        }
        System.out.println("A folha de pagamento da empresa equivale a R$" + folhaPagamento);
        System.out.println("o imposto de renda equivale a R$" + impostoRenda);
        System.out.println("");

    }
}
