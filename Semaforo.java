import java.util.Scanner;

public class Semaforo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cor do semáforo:");
        String cor = scanner.nextLine();

        if (cor.equals("verde")) {
            System.out.println("Siga");
        } else if (cor.equals("amarelo")) {
            System.out.println("Atenção");
        } else if (cor.equals("vermelho")) {
            System.out.println("Pare");
        } else {
            System.out.println("Cor inválida");
        }
    }
}