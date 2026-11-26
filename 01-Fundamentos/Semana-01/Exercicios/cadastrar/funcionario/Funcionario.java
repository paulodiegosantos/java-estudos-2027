package cadastrar.funcionario;
/*
Cada funcionário deverá possuir:
Nome.
Idade.
Salário.
Cargo.
Situação (ativo/inativo).

*/
public class Funcionario {
    String nome;
    int idade;
    double salario;
    String cargo;
    boolean situacao = true;



    public Funcionario(String nome, int idade, double salario, String cargo){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void imprimirDados(){
        System.out.println("\nNome: " + this.nome + "\nIdade: " + this.idade + "\nSalário: " + this.salario + "\nCargo: " + this.cargo + "\nSituação: " + ((this.situacao) ? "ativo" : "inativo"));
    }

    public void desativarFuncionario(){
        this.situacao = false;
    }

    public void ativarFuncionario(){
        this.situacao = true;
    }
}
