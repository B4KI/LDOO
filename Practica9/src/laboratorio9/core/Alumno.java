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
public class Alumno extends Persona{
    
    private int matricula;
    
    public Alumno(String nombre,String apellidos, int edad, int matricula){
        super(nombre,apellidos,edad);
        this.matricula=matricula;
        
    }
   
    
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }
    
     public int getMatricula(){
        return matricula;
    }
     
    public String obtenerInformacion() {
         return "\n\n\nAlumno\n" + "Nombre: " + this.getNombre() + "\nApellido: " + this.getApellidos() + "\nEdad: " + this.getEdad() + "\nMatricula: " + this.getMatricula();
    }
}
