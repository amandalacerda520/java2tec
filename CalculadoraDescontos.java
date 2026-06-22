import java.util.Scanner;

public class CalculadoraDescontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor total da compra:");
        double valor = scanner.nextDouble();

        double desconto = 0;

        if (valor > 200) {
            desconto = valor * 0.20;
        } else if (valor > 100) {
            desconto = valor * 0.10;
        }

        double valorFinal = valor - desconto;

        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}