import java.util.Scanner;

public class Ex_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        float valorCompra = input.nextFloat();

        float prestacao = valorCompra / 5;

        System.out.println("A compra pode ser feita em 5 prestações de: R$" + prestacao);

        input.close(); 
    }
}
