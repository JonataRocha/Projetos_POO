package bancobrasil;

public class /*subclasse->*/ Gerente extends /*super classe->*/ Usuario {

    private String login;
    private String password;
    
    public Gerente() {
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Gerente(String login, String password, String nome, String sobrenome, String telefone) {
        this.setnome(nome);
        this.setsobreNome(sobrenome);
        this.settelefone(telefone);
        this.login = login;
        this.password = password;
    }
    @Override
    public String imprimirInfor() {
        return String.format("*** INFORMAÇÕES DO GERENTE ***\n"
                + "Nome: %s %s\n"
                + "Contato: %s\n"
                + "Login: %s\n", this.getnome(), this.getsobreNome(), this.gettelefone(), this.getLogin());
    }
    
}
