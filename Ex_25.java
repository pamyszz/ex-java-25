import java.util.Scanner;

public class Ex_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int acumulador = 0;
        int valor;

        do {
            System.out.print("Digite um valor: ");
            valor = input.nextInt();
            if (valor > 0) {
                acumulador += valor;
            }
        } while (valor >= 0);

        System.out.println("A soma de todos os números digitados é: " + acumulador);

        input.close(); 
    }
}

