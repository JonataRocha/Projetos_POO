package bancobrasil;

public class ContaBancaria {

    //Atributos(Caracteristicas) da Classe
    private String agencia;
    private String conta;
    private double saldo;
    private Usuario proprietario;

    public ContaBancaria() {
    }
//MÉTODO CONSTRUTOR
    public ContaBancaria(String a, String c, double s, Usuario p) {
        this.agencia = a;
        this.conta = c;
        this.saldo = s;
        this.proprietario = p;
    }
//MÉTODOS GETTERS & SETTERS
    public String getagencia() {
        return this.agencia;
    }

    public void setagencia(String a) {
        this.agencia = a;
    }

    public String getconta() {
        return this.conta;
    }

    public void setconta(String c) {
        this.conta = c;
    }

    public double getsaldo() {
        return this.saldo;
    }

    public void setsaldo(double s) {
        this.saldo = s;
    }

    public Usuario getproprietario() {
        return this.proprietario;
    }

    public void setproprietario(Usuario p) {
        this.proprietario = p;
    }
}

//Metodos(Comportamentos) da Classe
void depositar(double valor){//método com parametro
        this.saldo += valor;
    }
    
    void sacar(double valor){
        if(valor > this.saldo)
            System.out.println("Saldo insuficiente!");
        else
            this.saldo -= valor;
    }
    
    void transferir(ContaBancaria contabancaria, double valor){//método com parametro
        if(valor <= saldo){
           this.sacar(valor);
            contabancaria.saldo += valor;
        }else {
            System.out.println("Saldo Insuficiente!");
        }
           
    }
    
    String consultarSaldo(){//método sem parametro
        //String.format() metodo da classe String para ultilizar formatação
       //com identificadores(&d, &f, &s).
        return String.format("seu saldo é: R$ %.2f",this.saldo);
    }
}
