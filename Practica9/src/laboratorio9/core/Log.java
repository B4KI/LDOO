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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Log {
    
    private final String filename;
    private static Log Log;
    /*Cambiar el nombre de la pc donde dice yair poner el de su PC*/
    private Log(String filename){    
        this.filename="C:\\Users\\Yair\\Desktop\\lab2-log.txt";
    }   
    
    public static Log getInstance(String filename){
        if(Log == null){
            Log= new Log(filename);
        }
    return Log;    
    }
    
    public String write(String message){
        try(BufferedWriter br = new BufferedWriter(new FileWriter(this.filename,true))){
            
      
           DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            
          
            
          String data = "\r\n"+ "[" + dateFormat.format(cal.getTime()) + "]" + " " + message;
         
          
            br.write(data);
        } catch(Exception e){ }
        
        return null;
    }
    
    
        
}
