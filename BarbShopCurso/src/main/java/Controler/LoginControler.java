/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import View.Login;

/**
 *
 * @author l-0-l
 */
public class LoginControler {

    private final Login view;

    public LoginControler(Login view) {
        this.view = view;
        
        
    }
    
    
    
    public void entrearNoSistema(){
        String nome = view.getTextUsuario().getText();
         String senha = view.getTextSenha().getText();
     
         Usario model = new Usuario(0, nome, senha);
         
    }
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
}
