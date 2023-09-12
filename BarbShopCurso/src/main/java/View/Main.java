/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Cliente;
import Model.Servico;

/**
 *
 * @author l-0-l
 */
public class Main {
    
    public static void main(String[] args){
        
        String nome = "Guilherme";
        System.out.println(nome);
        
        Servico servico = new Servico(1,"Barba",30);
        
        System.out.println(servico.getDescricao());
        System.out.print(servico.getValor());
        
        
        Cliente cliente = new Cliente(1, "Amanda", 'F', "31901010101" , "CATAPIMBAS");
        
        System.out.print(cliente);
        
        Usuario usario = new Usario()
        
    }
    
    
}
