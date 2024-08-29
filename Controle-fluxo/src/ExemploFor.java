public class ExemploFor {
    public static void main(String[] args) {
        String alunos[] = {"Lucas", "Gabriel", "William","Elias", "Ailton", "Henrique"};
        for (int i = 0; i<alunos.length; i++){
            System.out.println("O aluno no indice " + i + " é o aluno: " +alunos[i]);
        }
        for(String aluno : alunos){
            System.out.println("Nome dos alunos:" + aluno);
        }
    }
}
