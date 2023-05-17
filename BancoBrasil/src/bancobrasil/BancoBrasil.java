 
package bancobrasil;

import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        /*Instanciando um Objeto do tipo conta bancaria e referenciando 
        nas variaveis contaBancaria1 e contaBancaria2*/
        
       ContaBancaria contaBancaria1 = new ContaBancaria();
       ContaBancaria contaBancaria2 = new ContaBancaria();
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
        System.out.println("\nDigite o proprietario ->");
        contaBancaria1.proprietario = scan.next();
        System.out.println("\nDigite o valor de deposito ->");
        contaBancaria1.depositar(scan.nextDouble());
        
        System.out.println(contaBancaria1.agencia + "\n" 
               + contaBancaria1.conta +"\n" 
               + contaBancaria1.proprietario + "\n" 
               + contaBancaria1.consultarSaldo());
        
        System.out.println("\n\nDigite o valor para saque -> ");
        contaBancaria1.sacar(scan.nextDouble());
        
        System.out.println(contaBancaria1.consultarSaldo());
    } 
}
