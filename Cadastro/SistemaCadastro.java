package Cadastro;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa lucas = new Pessoa("Lucas", "123");

        System.out.println(lucas.getNome() + " - " + lucas.getCpf());
    }
}
