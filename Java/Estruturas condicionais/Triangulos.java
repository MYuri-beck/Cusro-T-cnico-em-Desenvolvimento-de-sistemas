
import java.util.Scanner;

public class Triangulos {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor do lado A do triângulo: ");
        double lado_A = scan.nextDouble();

        System.out.println("Insira o valor do lado B do triângulo: ");
        double lado_B = scan.nextDouble();

        System.out.println("Insira o valor do lado C do triângulo: ");
        double lado_C = scan.nextDouble();
        
       if ((lado_A + lado_B) > lado_C && (lado_A + lado_C) > lado_B && (lado_B + lado_C) > lado_A) {
           if (lado_A == lado_B && lado_B == lado_C){
               System.out.println("Triangulo equilatero");
           }else if (lado_A == lado_B || lado_A == lado_C || lado_B ==lado_C){
               System.out.println("Treiangulo isosceles");
           }else {
               System.out.println("Triangulo esscaleno");
           }
       } System.out.println("As medidas informads não são capazes de formar um triangulo");
    }
}
