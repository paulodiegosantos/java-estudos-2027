package cadastrar.funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do funcionario: ");
        String nome = entrada.nextLine();
        System.out.print("Idade do funcionario: ");
        int idade = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Salário do funcionario: ");
        double salario = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Cargo do funcionario: ");
        String cargo = entrada.nextLine();

        Funcionario funcionario = new Funcionario(nome,idade,salario,cargo);

        funcionario.imprimirDados();

    }
}
