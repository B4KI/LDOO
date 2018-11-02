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
public class Persona {
    
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona(String nombre, String apellidos,int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String obtenerInformacion(){
    String bot= nombre + apellidos;
    return bot;
    }
    
}
