package excepciones;
//ErrorAritmeticoException : Clase sencilla de control de errores

/*Crear en JAVA una clase llamada  ErrorAritmeticoException en el fichero
  (ErrorAritmeticoException.java) con las  siguientes  caracteristicas :
  - Hereda de RuntimeException
  - Tiene un metodo constructor que recibe un String con el mensaje a visualizar.  
*/

//Importa los paquetes 
  import java.lang.*;   
  import java.util.*;
  
//Definici�n de la Clase ErrorAritmeticoException
  public class ErrorAritmeticoException extends RuntimeException
  {   
   //Definici�n del constructor 
     public ErrorAritmeticoException(String mensaje)
     {
      super(mensaje);   
     }  
  } 
   
 