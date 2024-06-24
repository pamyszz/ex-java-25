import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Saldo medio: ");
            int saldoMedio = input.nextInt();

            if (saldoMedio < 501) {
                System.out.println("\nNenhum credito.");
            } else if (saldoMedio < 1001) {
                System.out.println("\n30% do valor do saldo medio.");
            } else if (saldoMedio < 3001) {
                System.out.println("\n40% do valor do saldo medio.");
            } else {
                System.out.println("\n50% do valor do saldo medio.");
            }
        } finally {
            input.close();
        }
    }
}
