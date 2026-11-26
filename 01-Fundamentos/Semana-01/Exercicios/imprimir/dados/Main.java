package imprimir.dados;

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = entradaDados.nextLine();
        System.out.print("Informe sua idade: ");
        int idade = entradaDados.nextInt();
        entradaDados.nextLine();
        System.out.print("Informe seu objetivo profissional: ");
        String objetivoProfissional = entradaDados.nextLine();

        Profissional profissional = new Profissional(nome
                , idade, objetivoProfissional);

        profissional.imprimirDados();
    }
}
