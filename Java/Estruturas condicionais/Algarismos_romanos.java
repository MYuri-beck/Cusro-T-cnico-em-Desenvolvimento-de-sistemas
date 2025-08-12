
import java.util.Scanner;

public class Algarismos_romanos {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Incisra o valor inteiro: ");
        int num = scan.nextInt();

        String romanNumber = int_to_roman(num);
        System.out.println(romanNumber);

    }

    public static String int_to_roman(int num) {
        if (num < 1 || num > 100) {
            return "O numero não esta dentro dos parametros de conversao deste programa (1-100)";
        }
        if (num == 100) {
            return "C";
        }
        int digDezenas = num / 10;
        int digUnidades = num % 10;

        String romDezena = " ";
        String romUnidade = " ";

        switch (digDezenas) {
            case 0:
                romDezena = "";      
                break;
            case 1:
                romDezena = "X";     
                break;
            case 2:
                romDezena = "XX";    
                break;
            case 3:
                romDezena = "XXX";   
                break;
            case 4:
                romDezena = "XL";   
                break;
            case 5:
                romDezena = "L";     
                break;
            case 6:
                romDezena = "LX";    
                break;
            case 7:
                romDezena = "LXX";   
                break;
            case 8:
                romDezena = "LXXX";  
                break;
            case 9:
                romDezena = "XC";    
                break;
        }
        switch (digUnidades) {
            case 0:
                romUnidade = "";      
                break;
            case 1:
                romUnidade = "I";     
                break;
            case 2:
                romUnidade = "II";    
                break;
            case 3:
                romUnidade = "III";   
                break;
            case 4:
                romUnidade = "IV";    
                break;
            case 5:
                romUnidade = "V";     
                break;
            case 6:
                romUnidade = "VI";    
                break;
            case 7:
                romUnidade = "VII";   
                break;
            case 8:
                romUnidade = "VIII";  
                break;
            case 9:
                romUnidade = "IX";    
                break;
        }

        return romDezena + romUnidade;
    }

}

