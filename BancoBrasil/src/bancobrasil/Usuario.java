
package bancobrasil;

import java.util.Date;

public class Usuario {
    String nome;
    String sobreNome;
    String telefone;
    Date dataRegistro = new Date();
    
    String imprimirInfor(){
       return String.format("Nome: %s\n, Sobrenome: %s\n, Telefone: %s\n, Data Registro: %s",
               this.nome, this.sobreNome, this.telefone, this.dataRegistro);
    }
    
}
