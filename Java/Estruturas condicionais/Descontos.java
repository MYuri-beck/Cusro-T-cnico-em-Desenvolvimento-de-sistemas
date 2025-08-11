import java.util.Scanner;

public class Descontos {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println ("Insira o valor da sua compra");
        double compra= scan.nextDouble ();
        
          if (compra > 200) {
            System.out.println("O cliente tem direito a um desconto de 20%");
        } else {
            System.out.println("O cliente não tem direito a desconto");
        }         
    }
}
    