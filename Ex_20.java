import java.util.Scanner;

public class Ex_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valorUsuario;
        int valoresMaior8 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um valor: ");
            valorUsuario = input.nextInt();

            if (valorUsuario > 8) {
                valoresMaior8++;
            }
        }

        System.out.println("Total de valores maior que 8: " + valoresMaior8);

        input.close(); 
    }
}
