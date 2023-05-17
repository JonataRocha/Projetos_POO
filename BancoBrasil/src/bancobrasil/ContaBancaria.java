
package bancobrasil;

public class ContaBancaria {
    //Atributos(Caracteristicas) da Classe
    String agencia;
    String conta;
    double saldo;
    String proprietario;
    
    //Metodos(Comportamentos) da Classe
    void depositar(double valor){//método com parametro
        this.saldo += valor;
    }
    
    void sacar(double valor){
        if(valor > this.saldo)
            System.out.println("Saldo insulficiente!");
        else
            this.saldo -= valor;
    }
    
    void transferir(){}
    
    String consultarSaldo(){//método sem parametro
        //String.format() metodo da classe String para ultilizar formatação
       //com identificadores(&d, &f, &s).
        return String.format("seu saldo é: R$ %.2f",this.saldo);
    }
}
