
package bancobrasil;

import java.util.Date;

public class Usuario {
    String nome;
    String sobreNome;
    String telefone;
    Date dataRegistro = new Date();
    
    String imprimirInfor(){
       return String.format("------INFORMAÇÕE DO CLIENTE------\n Nome: %s\n Sobrenome: %s\n Telefone: %s\n Data Registro: %s\n"
               + "----------------------------------",
               this.nome, this.sobreNome, this.telefone, this.dataRegistro);
    }
    
}
