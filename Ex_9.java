import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salarioMinimo = 1212.00f;

        System.out.print("Digite o seu salário: ");
        float salarioUsuario = input.nextFloat();

        float qtdSalarioMinimos = salarioUsuario / salarioMinimo;

        System.out.printf("Você recebe %.2f salários mínimos.\n", qtdSalarioMinimos);

        input.close(); 
    }
}
