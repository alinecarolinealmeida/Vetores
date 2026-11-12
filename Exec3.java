import java.util.Scanner;

public class Exec3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valores[] = new int[3];

        for (int i = 0; i < valores.length; i++) {

            System.out.println("Informe um número: ");
            int numero = input.nextInt();

            System.out.println("Informe o vetor: ");
            int indice = input.nextInt();

            if (indice >= 0 && indice < valores.length) {
                valores[indice] = numero;
            }
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.println("[" + i + "]" + " = " + valores[i]);
        }
    }
}









