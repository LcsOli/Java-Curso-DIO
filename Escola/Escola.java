package Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno lucas = new Aluno();
        lucas.setNome("Lucas");
        lucas.setIdade(13);
        lucas.setSexo("Masculino");

        System.out.println("O aluno " + lucas.getNome() + " do genero " + lucas.getSexo() + " tem " + lucas.getIdade() + " anos");
    }
}
