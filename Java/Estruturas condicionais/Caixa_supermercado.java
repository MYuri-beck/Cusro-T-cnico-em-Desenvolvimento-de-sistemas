import java.util.Scanner;

public class Caixa_supermercado {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Caixa Supermercado");
        System.out.println("Insira o código do produto (1 a 5):");
        int codigo = scan.nextInt();
        
        switch (codigo){
            case 1:
                System.out.println("Produto: Maçã - R$ 2,30 /un");
                break;
            case 2:
                System.out.println("Produto: Arroz 1kg - R$ 5,80");
                break;
            case 3:
                System.out.println("Produto: Leite - R$ 4,50 /L");
                break;
            case 4:
                System.out.println("Produto: Pão Francês - R$ 0,50 /un");
                break;
            case 5:
                System.out.println("Produto: Carne 1kg - R$ 35,00");
                break;
            default:
                System.out.println("Código de produto inválido!");
                break;
        }
        
        scan.close();
    }
}
