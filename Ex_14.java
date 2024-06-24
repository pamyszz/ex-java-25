import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valorUsuario;
        int acumulador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um valor: ");
            valorUsuario = input.nextInt();
            acumulador += valorUsuario;
        }

        System.out.println("Soma total dos números informados: " + acumulador);

        input.close(); 
    }
}
