import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("A = ");
            int a = input.nextInt();

            System.out.print("B = ");
            int b = input.nextInt();

            System.out.print("C = ");
            int c = input.nextInt();

            if (a > b && a > c) {
                System.out.println("\n1- " + a);
                if (b > c) {
                    System.out.println("2- " + b);
                    System.out.println("3- " + c);
                } else {
                    System.out.println("2- " + c);
                    System.out.println("3- " + b);
                }
            } else if (b > c) {
                System.out.println("\n1- " + b);
                if (a > c) {
                    System.out.println("2- " + a);
                    System.out.println("3- " + c);
                } else {
                    System.out.println("2- " + c);
                    System.out.println("3- " + a);
                }
            } else {
                System.out.println("\n1- " + c);
                if (a > b) {
                    System.out.println("2- " + a);
                    System.out.println("3- " + b);
                } else {
                    System.out.println("2- " + b);
                    System.out.println("3- " + a);
                }
            }
        } finally {
            input.close();
        }
    }
}
