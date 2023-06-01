package bancobrasil;

public abstract class Usuario {
    private String nome;
    private String sobrenome;
    private String telefone;
  
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

    public abstract String imprimirInfor(); 
       
}
