/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapacientes;

/**
 *
 * @author Usuario
 */
public class Paciente {
    
    String id;
    String name;
    String prioridad;
    String malestar;

    public Paciente(String id, String name, String prioridad, String malestar) {
        this.id = id;
        this.name = name;
        this.prioridad = prioridad;
        this.malestar = malestar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getMalestar() {
        return malestar;
    }

    public void setMalestar(String malestar) {
        this.malestar = malestar;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", name=" + name + ", prioridad=" + prioridad + ", malestar=" + malestar + '}';
    }
    
    
    
}
