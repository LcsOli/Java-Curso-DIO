import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args)  {
        try {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
       System.out.println("Digite seu nome: ");
       String nome = scanner.next();
    
       System.out.println("Digite sua idade: ");
       int idade = scanner.nextInt();

       System.out.println("Digite sua altura: ");
       double altura = scanner.nextDouble();

       System.out.println("Digite seu peso: ");
       double peso = scanner.nextDouble();

       System.out.println("Seu nome é " + nome + " e sua idade é " + idade + " sua altura é " + altura + " e seu peso é " + peso);

       
        scanner.close();
        }catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser númericos");
        }

    }
}
