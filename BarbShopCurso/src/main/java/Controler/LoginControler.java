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
        
        
    }
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
}
