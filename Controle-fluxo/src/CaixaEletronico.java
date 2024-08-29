import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double saldo = 300.0;
        System.out.println("Qual o valor a ser sacado ?");
        double valorSolicitado = scanner.nextDouble();

        if (valorSolicitado < saldo) {
           saldo = saldo - valorSolicitado;
            System.out.println("Saldo disponivel: " +saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
        scanner.close();
    }
}
