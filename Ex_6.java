import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Digite um numero: ");
            int numero = input.nextInt();

            System.out.println("\nAntecessor: " + (numero - 1));
            System.out.println("Sucessor: " + (numero + 1));
        } finally {
            input.close();
        }
    }
}
