public class Ex_12 {
    public static void main(String[] args) {
        int acumulador = 0;

        for (int i = 1; i <= 15; i++) {
            acumulador += i;
        }

        System.out.println("A soma total do conjunto [1, 2 ... 15] é: " + acumulador);
    }
}
