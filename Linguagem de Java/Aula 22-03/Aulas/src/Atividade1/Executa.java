package Atividade1;

public class Executa {
  public static void main(String[] args) {
    
    Funcionario func = new Funcionario();
    func.setNome("Jose");
    func.setCpf("2323323232");
    func.setSalario(10.000);
    func.apresentar();


    // tbm funcionaria asssim 
    // Funcionario ger = new Gerente();
    // Gerente ger = new Funcionario();

    Gerente ger = new Gerente();
    ger.setNome("Maria");
    ger.setCpf("07796636760");
    ger.setSalario(20000);
    ger.setSenha(10);
    ger.autentica(10);
    ger.apresentar();

  }
  
}
