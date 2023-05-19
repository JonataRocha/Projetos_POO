package bancobrasil;

import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        /*Instanciando um Objeto do tipo conta bancaria e referenciando 
        nas variaveis contaBancaria1 e contaBancaria2*/

        ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();
        Usuario user1 = new Usuario();
        /*
       //Tribuindo valores ao nosso ojeto
       contaBancaria1.agencia = "0001";
       contaBancaria1.conta = "12345";
       contaBancaria1.proprietario = "Junior";
       contaBancaria1.saldo = 1.99;
       
       //Apresentando os valores
       System.out.println(contaBancaria1.agencia + "\n" 
               + contaBancaria1.conta +"\n" 
               + contaBancaria1.proprietario + "\n" 
               + contaBancaria1.saldo);
        
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("BEM VINDO AO BANCO DO BRASIL");
        System.out.println("CADASTRO DE CONTAS");
        System.out.println("Digite a agencia ->");
        contaBancaria1.agencia = scan.next();
        System.out.println("\nDigite a conta ->");
        contaBancaria1.conta = scan.next();
        //Construção e inserção de dados do Usuário
        System.out.println("\nDados do Usuario->");
        System.out.println("Digite o nome do cliente ->");
        user1.nome = scan.next();
        System.out.println("Digite o Sobrenome do Cliente");
        user1.sobreNome = scan.next();
        System.out.println("Digite o Telefone do Cliente");
        user1.telefone = scan.next();
        contaBancaria1.proprietario = user1;

        System.out.println("\nDigite o valor de deposito ->");
        contaBancaria1.depositar(scan.nextDouble());

        System.out.println(contaBancaria1.agencia + "\n"
                + contaBancaria1.conta + "\n"
                + contaBancaria1.proprietario.imprimirInfor() + "\n"
                + contaBancaria1.consultarSaldo());

        System.out.println("\n\nDigite o valor para saque -> ");
        contaBancaria1.sacar(scan.nextDouble());

        System.out.println(contaBancaria1.consultarSaldo());
    }
}
