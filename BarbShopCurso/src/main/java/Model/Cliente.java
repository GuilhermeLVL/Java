/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author l-0-l
 */
public class Cliente extends Pessoa{
   
    private String enedereco;
    private String cep;

    public Cliente(String enedereco, String cep, int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.enedereco = enedereco;
        this.cep = cep;
    }

    public Cliente(String enedereco, String cep, int id, String nome) {
        super(id, nome);
        this.enedereco = enedereco;
        this.cep = cep;
    }
    
    
    
    

    public String getEnedereco() {
        return enedereco;
    }

    public void setEnedereco(String enedereco) {
        this.enedereco = enedereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    

    
    
    
    
    
    
}
