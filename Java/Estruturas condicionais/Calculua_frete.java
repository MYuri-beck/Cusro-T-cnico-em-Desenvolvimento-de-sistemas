import java.util.Scanner;
public class Calculua_frete {

   
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Calcule o frete");
        System.out.println("----------------");
        System.out.println("Insira o CEP:");
        String cep = scan.nextLine();
        
        if(cep.length() == 0){
            System.out.println("CEP inválido");
            return;
        }
        
        char primeiroDigito = cep.charAt(0);
        
        switch (primeiroDigito){
            case '0':
            case '1':
            case '2':
            case '3':
                System.out.println("Como você mora na região Sudeste, o valor do frete fica R$ 15,00");
                break;    
            case '4':
            case '5':
                System.out.println("Como você mora na região Nordeste, o valor do frete fica R$ 25,00");
                break;
            case '6':
            case '7':
                System.out.println("Como você mora na região Norte, o valor do frete fica R$ 35,00");
                break;
            case '8':
            case '9':
                System.out.println("Como você mora na região Sul/Centro-Oeste, o valor do frete fica R$ 20,00");
                break;
            default:
                System.out.println("CEP inválido");
        }
    }
}
