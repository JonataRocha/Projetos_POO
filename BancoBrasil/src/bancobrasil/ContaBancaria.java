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

    public ContaBancaria(String agencia, String conta, double saldo, Usuario proprietario) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }
//MÉTODOS GETTERS & SETTERS

    public String getagencia() {
        return this.agencia;
    }

    public void setagencia(String agencia) {
        this.agencia = agencia;
    }

    public String getconta() {
        return this.conta;
    }

    public void setconta(String conta) {
        this.conta = conta;
    }

    public double getsaldo() {
        return this.saldo;
    }

    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getproprietario() {
        return this.proprietario;
    }

    public void setproprietario(Usuario proprietario) {
        this.proprietario = proprietario;
    }

//Metodos(Comportamentos) da Classe
    void depositar(double valor) {//método com parametro
        this.saldo += valor;
    }

    void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo -= valor;
        }
    }

    void transferir(ContaBancaria contabancaria, double valor) {//método com parametro
        if (valor <= saldo) {
            this.sacar(valor);
            contabancaria.saldo += valor;
        } else {
            System.out.println("Saldo Insuficiente!");
        }

    }

    String consultarSaldo() {//método sem parametro
        //String.format() metodo da classe String para ultilizar formatação
        //com identificadores(&d, &f, &s).
        return String.format("seu saldo é: R$ %.2f", this.saldo);
    }
}
