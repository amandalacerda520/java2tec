import java.util.Scanner;

public class SenhaBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senha = 1239;

        System.out.println("Digite a senha:");
        int entrada = scanner.nextInt();

        if (entrada == senha) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }

        scanner.close();
    }
}