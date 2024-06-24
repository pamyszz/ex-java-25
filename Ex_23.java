import java.util.Scanner;

public class Ex_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador0e100 = 0;
        int contador100e200 = 0;
        int contadorMaior200 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um valor: ");
            int valor = input.nextInt();
            if (valor >= 0 && valor <= 100) {
                contador0e100++;
            } else if (valor >= 101 && valor <= 200) {
                contador100e200++;
            } else if (valor > 200) {
                contadorMaior200++;
            }
        }

        System.out.println("Números entre 0 e 100: " + contador0e100);
        System.out.println("Números entre 101 e 200: " + contador100e200);
        System.out.println("Números maiores que 200: " + contadorMaior200);

        input.close(); 
    }
}
