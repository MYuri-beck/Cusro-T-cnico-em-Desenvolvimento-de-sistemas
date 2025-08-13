
import java.time.Year;
import java.util.Scanner;

public class Horoscopo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o dia de nascimento: ");
        int dia = scan.nextInt();

        System.out.println("Insira o mês de nascimento: ");
        int mes = scan.nextInt();

        System.out.println("Insira o ano de nascimento: ");
        int ano = scan.nextInt();

        if (dateVerify(dia, mes, ano)) {
            String signo = getSigno(dia, mes);
            System.out.println("Seu signo é " + signo);
        } else {
            System.out.println("Data invalida");
        }

    }

    

    //VERIFICA A DATA E RELACIONA COM O SIGNO
    public static String getSigno(int dia, int mes) {
        String signo;
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            signo = "Áries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
            signo = "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Câncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            signo = "Capricórnio";
        } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 18)) {
            signo = "Aquário";
        } else {
            signo = "Peixes";
        }

        return signo;
    }

    // VERIFICA SE A DATA É VALIDA
    public static boolean dateVerify(int dia, int mes, int ano) {
        boolean leapYear = Year.isLeap(ano);

        if (ano > 0 && dia > 0 && mes > 0 && mes <= 12) {

            int maxDays;

            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    maxDays = 31;
                    break;

                case 2:
                    if (leapYear) {
                        maxDays = 29;
                    } else {
                        maxDays = 28;
                    }
                    break;

                default:
                    maxDays = 30;
            }

            if (dia <= maxDays) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
