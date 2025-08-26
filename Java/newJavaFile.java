import java.util.Scanner;
public class newJavaFile {


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String binaryNumber = "";
        
        System.out.println("Insira o numero que voce quer converter para a base binária: ");
        int decimalNumber = scan.nextInt();
        
        if(decimalNumber == 0 ){
            System.out.println("O número em binário é 0 ");
        }else {
            //variaveis que servirão para os caulculos
               int num = decimalNumber; 
               int remainder;
               
               while (num > 0 ){
                   remainder = num % 2; //pega o resto do input do usuario divido por 2 (calc para binario)
                   
                   binaryNumber = String.valueOf(remainder) + binaryNumber; // converte o resto para uma string e concatena com o "numero" que ja esta guardado (inicialmente vazio)
                   num = num / 2;

               }
               System.out.println("O número decimal " + decimalNumber + " em binário equivale a " + binaryNumber);
        
        }
    }
}
