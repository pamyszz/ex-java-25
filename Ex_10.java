import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float porcentagemReajuste = 1.015f;

        System.out.print("Saldo: ");
        float saldo = input.nextFloat();

        float saldoReajustado = saldo * porcentagemReajuste;

        System.out.println("\nSaldo reajustado em 1.5% -> " + saldoReajustado);

        input.close(); 
    }
}
