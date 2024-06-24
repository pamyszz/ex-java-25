import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Digite um numero: ");
            int numero = input.nextInt();

            boolean indivisivel = true;

            if (numero % 10 == 0) {
                System.out.println("\nDivisivel por 10");
                indivisivel = false;
            }
            if (numero % 5 == 0) {
                System.out.println("Divisivel por 5");
                indivisivel = false;
            }
            if (numero % 2 == 0) {
                System.out.println("Divisivel por 2");
                indivisivel = false;
            }
            if (indivisivel) {
                System.out.println("Indivisivel por 10, por 5 e por 2");
            }
        } finally {
            input.close();
        }
    }
}
