import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double saldo = 50.0;
        while (saldo > 0) {
            double valorCompra = valorAleatorio();
            
            if (valorCompra > saldo) {
                valorCompra = saldo;
            }
            
            
            System.out.println("Valor da compra: " + valorCompra + " Adicionado no carrinho");
            saldo = saldo - valorCompra;
            System.out.println("Saldo: " + saldo);
        }
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
