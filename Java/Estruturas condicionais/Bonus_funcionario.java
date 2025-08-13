    import java.util.Scanner;

    public class Bonus_funcionario {

        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Insira o cargo: ");
            String position = scan.nextLine();

            System.out.println("Insira seu tempo de contibuição (em anos): ");
            int years = scan.nextInt();

            System.out.println("Insira seu salario: ");
            double salary = scan.nextDouble();

            double bonus = getBonus(position, years, salary);

            System.out.println("O bonus sera de: " + bonus);
        }

        public static double getBonus(String position, int years, double salary) {
            double bonus = 0.0;

            if (position.equalsIgnoreCase("gerente") && years > 2) {
                bonus = salary * 0.10; 
            } else if (position.equalsIgnoreCase("gerente") && years <= 2) {
                bonus = salary * 0.05; 
            } else if (position.equalsIgnoreCase("coordenador") && years > 1) {
                bonus = salary * 0.08;
            } else if (position.equalsIgnoreCase("coordenador") && years <= 1) {
                bonus = salary * 0.03;
            } else {
                bonus = salary * 0.05;
            }

            return bonus;
        }
    }
