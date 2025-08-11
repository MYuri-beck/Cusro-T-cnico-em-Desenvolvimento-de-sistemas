import java.util.Scanner;
public class javaPassword {

    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        String correct_password = "Java2024";
        
        System.out.println("Insira a senha: ");
        String user_password = scan.nextLine();
        
        if (!user_password.equals(correct_password)){
            System.out.println("Senha invalida, tente novamente jovem");
        } else {
            System.out.println("Acesso permitido, jovem");}
    }
}
