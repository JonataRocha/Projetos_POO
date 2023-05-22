package bancobrasil;

import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        /*Instanciando um Objeto do tipo conta bancaria e referenciando 
        nas variaveis contaBancaria1 e contaBancaria2*/
 /*
        ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();
        Usuario user1 = new Usuario();*/
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
 /*
        Scanner scan = new Scanner(System.in);
        System.out.println("BEM VINDO AO BANCO DO BRASIL");
        System.out.println("CADASTRO DE CONTAS");
        System.out.println("Digite a agencia ->");
        contaBancaria1.getagencia();
        System.out.println("\nDigite a conta ->");
        contaBancaria1.conta = scan.next();
        
        //Construção e inserção de dados do Usuário
        System.out.println("\nDados do Usuario->");
        System.out.println("Digite o nome do cliente ->");
        user1.setnome(scan.next());
        System.out.println("Digite o Sobrenome do Cliente");
        user1.setsobreNome(scan.next());
        System.out.println("Digite o Telefone do Cliente");
        user1.settelefone(scan.next());
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
         */
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        Usuario user;
        Usuario[] users = new Usuario[5];
        ContaBancaria contabancaria = new ContaBancaria();

        while (opcao != 3) {
            System.out.println("****BANCO BRASIL****");
            System.out.println("1- Cadastro de Cliente");
            System.out.println("2- Cadastro de conta");
            System.out.println("3- Sair");
            System.out.println("Ecolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        user = new Usuario();
                        System.out.println("***CADASTRO DE CLIENTE***");
                        System.out.println("Nome: ");
                        user.setnome(scan.next());
                        System.out.println("Sobrenome: ");
                        user.setsobreNome(scan.next());
                        System.out.println("Telefone: ");
                        user.settelefone(scan.next());

                        users[i] = user;
                    }
                    break;
                case 2:
                    if(users[0] == null){
                        System.out.println("Não existe Cliente cadastrado!");
                        break;
                    }
                    System.out.println("***CADASTRO DE CONTA***");
                    System.out.println("Agencia: ");
                    contabancaria.setagencia(scan.next());
                    System.out.println("Conta: ");
                    contabancaria.setconta(scan.next());
                    System.out.println("CLIENTES CADASTRADO");
                    for (int i = 0; i < 5; i++) {
                        //System.out.println("\n"+(i+1) + "- " + users[i].getnome());
                        System.out.printf("\n%d- %s %s", (i+1), users[i].getnome(), users[i].getsobreNome(),"\n");
                    }
                    System.out.println("\nSelecione o cliente: ");
                    int userOpcao = scan.nextInt();
                    if (userOpcao <= 5 && userOpcao > 0) {
                        userOpcao--;
                        contabancaria.setproprietario(users[userOpcao]);
                    }
                    break;
                case 3:
                    System.out.println("***ATÉ BREVE!***");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
