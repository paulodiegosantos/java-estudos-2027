package imprimir.dados;

public class Profissional {
    String nome;
    int idade;
    String objetivoProfissional;

    public Profissional(String nome, int idade, String objetivoProfissional){
        this.nome = nome;
        this.idade = idade;
        this.objetivoProfissional = objetivoProfissional;
    }

    public void imprimirDados(){
        System.out.println("\nNome: " + this.nome + "\nIdade: " + this.idade + "\nObjetivo profissional: " + this.objetivoProfissional);
    }

}
