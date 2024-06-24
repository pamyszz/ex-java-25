import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float comissaoSobVendas = 0.15f;

        System.out.print("Nome vendedor: ");
        System.out.print("Salario fixo: ");
        float salarioVendedor = input.nextFloat();

        System.out.print("Valor total de vendas: ");
        float valorVendasVendedor = input.nextFloat();

        float salarioFinal = salarioVendedor + (valorVendasVendedor * comissaoSobVendas);

        System.out.println("\nSeu salario final vai ser: R$" + salarioFinal);

        input.close();
    }
}

