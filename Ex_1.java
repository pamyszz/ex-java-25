import java.util.Scanner;

public class Ex_1 {
    public static int getOpcao() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Escolha uma das opcoes: ");
            int opcaoEscolhida = input.nextInt();
            while (opcaoEscolhida > 4 || opcaoEscolhida <= 0) {
                System.out.print("\nEscolha uma opcao valida: ");
                opcaoEscolhida = input.nextInt();
            }
            return opcaoEscolhida;
        } finally {
            input.close();
        }
    }

    public static int getCaloria(String categoria, int Opcao) {
        switch (categoria) {
            case "prato":
                switch (Opcao) {
                    case 1:
                        return 180;
                    case 2:
                        return 230;
                    case 3:
                        return 250;
                    case 4:
                        return 350;
                }

            case "sobremesa":
                switch (Opcao) {
                    case 1:
                        return 75;
                    case 2:
                        return 110;
                    case 3:
                        return 170;
                    case 4:
                        return 200;
                }

            case "bebida":
                switch (Opcao) {
                    case 1:
                        return 20;
                    case 2:
                        return 70;
                    case 3:
                        return 100;
                    case 4:
                        return 65;
                }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("PRATO\n1- Vegetariano\n2- Peixe\n3- Frango\n4- Carne");
            int prato = getOpcao();

            System.out.println("\nSOBREMESA\n1- Abacaxi\n2- Sorvete diet\n3- Mouse diet\n4- Mouse chocolate");
            int sobremesa = getOpcao();

            System.out.println("\nBEBIDA\n1- Cha\n2- Suco de laranja\n3- Suco de melao\n4- Refrigerante diet");
            int bebida = getOpcao();

            int caloriaPrato = getCaloria("prato", prato);
            int caloriaSobremesa = getCaloria("sobremesa", sobremesa);
            int caloriaBebida = getCaloria("bebida", bebida);

            int caloriaTotal = caloriaPrato + caloriaSobremesa + caloriaBebida;
            System.out.println("\nO total de caloria a ser consumida: " + caloriaTotal);
        } finally {
            input.close();
        }
    }
}
