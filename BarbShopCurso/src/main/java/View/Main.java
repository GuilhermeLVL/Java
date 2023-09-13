/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

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
        
        
        Cliente cliente = new Cliente("adasda", "asd", 1, "adasd");
        
        System.out.print(cliente);
        
        Usuario usuario = new Usuario("1231", 1, "123123");
        System.out.print(usuario.getEmail());
        
        
        Agendamento agendamento = new Agendamento(1,cliente,servico, 30,"01/02/2024 03:15");
        System.out.print(agendamento.getCliente().getNome());
        
    }
    
    
}
