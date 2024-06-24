import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Idade: ");
            int idade = input.nextInt();

            if (idade >= 0 && idade < 16) {
                System.out.println("Nao eleitor!");
            } else if (idade >= 18 && idade <= 65) {
                System.out.println("Eleitor obrigatorio!");
            } else if ((idade >= 16 && idade < 18) || idade > 65) {
                System.out.println("Eleitor facultativo!");
            } else {
                System.out.println("Idade invalida!");
            }
        } finally {
            input.close();
        }
    }
}
