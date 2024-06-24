import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeUsuario;
        int idadeUsuario;

        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("\nDigite seu nome: ");
            nomeUsuario = input.nextLine();

            System.out.print("Digite sua idade: ");
            idadeUsuario = input.nextInt();

            input.nextLine(); // Limpar o buffer do teclado

            if (idadeUsuario < idadeMaisNova) {
                nomeMaisNovo = nomeUsuario;
                idadeMaisNova = idadeUsuario;
            }
        }

        System.out.println("\nNome do usuário mais novo: " + nomeMaisNovo);

        input.close(); 
    }
}
