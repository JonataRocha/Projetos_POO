package bancobrasil;

import java.util.Date;

public class Usuario {

    private String nome;
    private String sobrenome;
    private String telefone;
    private Date dataRegistro = new Date();

    public Usuario() {
    }
    //MÉTODO CONSTRUTOR
    public Usuario(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.dataRegistro = new Date();
    }
    //Métodos GETTERS & SETTERS
    public String getnome() {
        return this.nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getsobreNome() {
        return this.sobrenome;
    }

    public void setsobreNome(String s) {
        this.sobrenome = s;
    }

    public String gettelefone() {
        return this.telefone;
    }

    public void settelefone(String t) {
        this.telefone = t;
    }

    public Date getdataRegistro() {
        return this.dataRegistro;
    }

    public void setdataRegistro(Date dr) {
        this.dataRegistro = dr;
    }
}

String imprimirInfor(){
       return String.format("------INFORMAÇÕE DO CLIENTE------\n Nome: %s\n Sobrenome: %s\n Telefone: %s\n Data Registro: %s\n"
               + "----------------------------------",
               this.nome, this.sobreNome, this.telefone, this.dataRegistro);
    }
    
}
