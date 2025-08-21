
import java.util.Scanner;
public class TabuadaInput {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        
        System.out.println("Insira um numero: ");
        int input = scan.nextInt();
        
        for (int i = 1; i <= 10; i ++){
            result = input * i;
            
            System.out.println("A multiplicação de " + input + " por " + i + " é igual a " + result);
        
        }
    }
}
    