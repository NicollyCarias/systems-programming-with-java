public class Enfermeira extends Pessoa{

  public Enfermeira() {
  }

  public void exibirDados(){
    System.out.println("Informe o Nome completo da enfermeira: "+getNome());
    System.out.println("Informe o CPF da enfermeira: "+getCpf());
  }
}
