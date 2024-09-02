package Escola;

public class Aluno {
  private  String nome;
  private int idade;
  private String sexo;
    
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  public String getNome(){
        return nome;
  }
  public void setNome(String newNome) {
    nome = newNome;
  }
  public int getIdade() {
    return idade;
  }
  public void setIdade(int newIdade) {
    this.idade = newIdade;
  }
}
