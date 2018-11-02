/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio9.core;

/**
 *
 * @author Yair
 */
public class Maestro extends Persona{

    private String claveEmpleado;
    
    public Maestro(String nombre,String apellidos,int edad,String claveEmpleado){
        super(nombre,apellidos,edad);
        this.claveEmpleado=claveEmpleado;
    }
    
    public void setClaveEmpleado(String claveEmpleado){
        this.claveEmpleado=claveEmpleado;
    }

    public String getClaveEmpleado(){
        return claveEmpleado;
    }
    
   public String obtenerInformacion() {
     return "\n\nMaestro\n" +"Nombre: " + this.getNombre() + "\nApellido: " + this.getApellidos() + "\nEdad: " + this.getEdad() + "\nClave del Empleado: " + this.getClaveEmpleado();
    }
}