package bancobrasil;

import java.util.Date;

public class Usuario {

    private String nome;
    private String sobrenome;
    private String telefone;
    

    public Usuario() {
    }

    //MÉTODO CONSTRUTOR
    public Usuario(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
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

    public void setsobreNome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String gettelefone() {
        return this.telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

    


    public String imprimirInfor() {
       return String.format("------INFORMAÇÕE DO CLIENTE------\n Nome: %s\n Sobrenome: %s\n Telefone: %s\n ", 
            this.nome, this.sobrenome, this.telefone);
        }
       
}
