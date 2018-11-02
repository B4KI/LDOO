/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.InputMismatchException;
import laboratorio9.core.Alumno;
import laboratorio9.core.Log;
import laboratorio9.core.Maestro;
import laboratorio9.core.Persona;


public class Practica9 {

   
    public static void main(String[] args) {
        
        /*Poner direcion de su PC deonde dice yair para generar un documento en el escritorio*/
       Log log = Log.getInstance("C:\\Users\\Yair\\Desktop\\lab2-log.txt");
       
        try{
           
            log.write("=====INICIO=====");
            
             ArrayList<Persona> personas = new ArrayList();
             Scanner sc = new Scanner(System.in);
        
             String nombreM,nombreA,apellidoM,apellidoA,clave;
             int edadM,edadA,matricula;
             
             
             
             log.write("Captura de información");
             
             System.out.println("Captura nombre del maestro");
                nombreM=sc.nextLine();
             System.out.println("Captura apellido del maestro");
                apellidoM=sc.nextLine();
             System.out.println("Captura clave del maestro");   
                clave=sc.nextLine();
             System.out.println("Captura edad del maestro");      
                edadM=sc.nextInt();
               
        sc.nextLine();
        
             System.out.println("Captura nombre del alumno");
                nombreA=sc.nextLine();
               
             System.out.println("Captura apellido del alumno");
                apellidoA=sc.nextLine();
             System.out.println("Captura matricula del alumno");   
                matricula=sc.nextInt();
             System.out.println("Captura edad del alumno");      
                edadA=sc.nextInt();        
                
            
            log.write("Construcción de objetos y listas de elementos");
            
             Persona maestro = new Maestro(nombreM, apellidoM, edadM, clave);
             Persona alumno = new Alumno(nombreA, apellidoA, edadA, matricula);
        
             personas.add(maestro);
             personas.add(alumno);
        
            log.write("Impresión de la informacion");
            
             for(Persona persona:personas){
             System.out.println(persona.obtenerInformacion());
            
             }
        }
        catch(InputMismatchException e){ 
        log.write("Error al capturar la información.Datos Invalidos");
        }
        
        log.write("=======FIN========");
        
        
    }
        
}