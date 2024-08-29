import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o numero da Agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor digite o numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldoConta + " Já esta disponivel para saque");

        scanner.close();
    }
}
