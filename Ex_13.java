import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Temperatura em Celsius: ");
        float temperaturaCelsius = input.nextFloat();

        float temperaturaConvertidaParaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

        System.out.println("\nA temperatura informada em Fahrenheit é: " + temperaturaConvertidaParaFahrenheit);

        input.close(); 
    }
}
