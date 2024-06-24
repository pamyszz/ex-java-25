import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idadeUsuario;
        int maiorIdade = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite sua idade: ");
            idadeUsuario = input.nextInt();

            if (idadeUsuario >= 18) {
                maiorIdade++;
            }
        }

        System.out.println("Total de maiores de idade: " + maiorIdade);

        input.close(); // Fechando o Scanner
    }
}
