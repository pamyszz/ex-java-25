import java.util.Scanner;

public class Ex_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um valor: ");
            int valor = input.nextInt();
            if (valor >= 0 && valor <= 100) {
                contador++;
            }
        }

        System.out.println("Você digitou " + contador + " números entre 0 e 100!");

        input.close(); 
    }
}
