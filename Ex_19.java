import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cotação atual do dólar: ");
        double cotacaoDolar = input.nextDouble();

        System.out.print("Valor total disponível em dólar: ");
        double qtdDolar = input.nextDouble();

        double conversaoDolarReal = qtdDolar * cotacaoDolar;
        System.out.println("\nConvertendo de Dólar para Real, você fica com: R$" + conversaoDolarReal);

        input.close(); 
    }
}
