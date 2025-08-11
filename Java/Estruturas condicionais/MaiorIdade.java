import java.util.Scanner;
public class MaiorIdade {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor, insira sua idade: ");
        int userAge = scan.nextInt();
        
        String message = userAge >= 18 ? "O jovem é maior de idade" : "O jovem não é maior de idade";   
        System.out.println(message);
    }
}
