
package bancobrasil;

import java.util.Date;

public class Cliente extends Usuario{
    private Date dataRegistro = new Date();
    
    public Cliente(){}

    public Cliente(String nome, String sobrenome, String telefone) {
        this.setnome(nome);
        this.setsobreNome(sobrenome);
        this.settelefone(telefone);
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    
    @Override
    public String imprimirInfor(){
        return String.format("------INFORMAÇÕE DO CLIENTE------\n Nome: %s\n Sobrenome: %s\n Telefone: %s\n Data de Registro: %s ", 
            super.getnome(), super.getsobreNome(), super.gettelefone(), this.dataRegistro);
    } 
}
