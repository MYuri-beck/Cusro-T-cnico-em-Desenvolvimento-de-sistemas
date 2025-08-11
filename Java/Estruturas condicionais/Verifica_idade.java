import java.util.Scanner;
public class Verifica_idade {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor, insira sua idade: ");
        int userAge = scan.nextInt();
        
        String message = userAge >= 16 ? "Você pode votar" : "Você não pode votar";   
        System.out.println(message);
    }
}
