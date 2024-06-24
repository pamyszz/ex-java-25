import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Porcentagem IPI: ");
        int porcentagemIPI = input.nextInt();

        // PEÇA 1
        System.out.print("\nValor da peca 1: ");
        int valorPeca1 = input.nextInt();

        System.out.print("Quantidade da peca 1: ");
        int quantidadePeca1 = input.nextInt();

        // PEÇA 2
        System.out.print("\nValor da peca 2: ");
        int valorPeca2 = input.nextInt();

        System.out.print("Quantidade da peca 2: ");
        int quantidadePeca2 = input.nextInt();

        // Cálculo do valor total, considerando o IPI
        float valorTotal = (valorPeca1 * quantidadePeca1) + (valorPeca2 * quantidadePeca2) * (porcentagemIPI / 100.0f + 1);

        System.out.println("\nValor total = " + valorTotal);
        
        input.close(); 
    }
}
