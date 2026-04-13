/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapacientes;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Usuario
 */
public class AtenderPacientes {
    
    Queue<Paciente> cola= new LinkedList<>();
    
    public void agregar(Paciente p){
    
        cola.add(p);
    }
    
     public void atender(Paciente p){
    
        cola.add(p);
    }
     

}
