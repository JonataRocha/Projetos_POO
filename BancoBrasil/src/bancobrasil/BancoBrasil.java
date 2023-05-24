package bancobrasil;

import java.util.ArrayList;
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
        int opcao = 0, qtdCadastro = 0;
        boolean isLogin = false;
        Usuario user;
        ArrayList<Usuario> users = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ContaBancaria contabancaria = new ContaBancaria();
        GerenteRepository db_gerente = new GerenteRepository();

        gerentes = db_gerente.addGerente();

        do {
            System.out.println("*****SEJAM BEM VINDO AO BANCO BRASIL*****");
            System.out.printf("LOGIN: ");
            String login = scan.next();
            System.out.printf("PASSWORD: ");
            String password = scan.next();

            for (Gerente g : gerentes) {
                if (g.getLogin().equals(login) && g.getPassword().equals(password)) {
                    isLogin = true;
                }
            }
            //String notValidate = "", validade = "Usuario ou senha incorreros!";
            System.out.printf("%s\n", isLogin == true ? "" : "Usuario ou senha incorretos");
        } while (isLogin != true);

        while (opcao != 3) {
            System.out.println("****BANCO BRASIL****");
            System.out.println("1- Cadastro de Cliente");
            System.out.println("2- Cadastro de conta");
            System.out.println("3- Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("***CADASTRO DE CLIENTE***");
                    System.out.println("Quantidade de cadastro: ");
                    qtdCadastro = scan.nextInt();

                    for (int i = 0; i < qtdCadastro; i++) {
                        user = new Cliente();

                        System.out.println("Nome: ");
                        user.setnome(scan.next());
                        System.out.println("Sobrenome: ");
                        user.setsobreNome(scan.next());
                        System.out.println("Telefone: ");
                        user.settelefone(scan.next());

                        users.add(user);
                    }
                    break;

                case 2:
                    System.out.println("***CADASTRO DE CONTA***");
                    System.out.println("Agencia: ");
                    contabancaria.setagencia(scan.next());
                    System.out.println("Conta: ");
                    contabancaria.setconta(scan.next());
                    System.out.println("CLIENTES CADASTRADO");
                    //Será listado os clientes cadastrados
                    if (users.size() != 0) {
                        for (int i = 0; i < qtdCadastro; i++) {
                            System.out.printf("%d- %s %s\n", (i + 1), users.get(i).getnome(), users.get(i).getsobreNome(), "\n");
                        }

                        System.out.println("\nSelecione o cliente: ");
                        int userOpcao = scan.nextInt();
                        contabancaria.setproprietario(users.get(userOpcao - 1));
                    } else {
                        System.out.println("Nenhum Cliente Cadastrado");
                    }

                    System.out.println("\nDigite o valor de deposito ->");
                    contaBancaria1.depositar(scan.nextDouble());

                    System.out.println(contaBancaria1.getagencia() + "\n"
                            + contaBancaria1.getconta() + "\n"
                            + contaBancaria1.getproprietario().imprimirInfor() + "\n"
                            + contaBancaria1.consultarSaldo());
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
