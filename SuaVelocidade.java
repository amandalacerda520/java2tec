import java.util.Scanner;

public class SuaVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a velocidade do carro:");
        int velocidade = scanner.nextInt();

        if (velocidade > 80) {
            System.out.println("foi multado!");
        } else {
              System.out.println("Tenha uma boa viajem!");
        }

       
}
}
