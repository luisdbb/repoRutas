package excepciones;
/* Ejemplo1: No se captura el error.
             Terminaci�n anormal del programa,se suspende la ejecuci�n en la operaci�n
             donde se ha producido el error y el sistema proporciona informaci�n del
             error. 
*/

//Importa el paquete  
  import java.util.*;

//Definici�n de la clase
  public class TestEjemplo1
  {

   //Definici�n de la funci�n principal
     public static void  main(String args[])
     {
      //Declaracion de variables
        int nro1 = 10,nro2 = 0,cociente = 0;

      //Operaci�n de division entre cero
        cociente = nro1 / nro2; 
        System.out.println("\n" + nro1 +" : " + nro2 + " = " + cociente);    
    
      //final del programa  
        System.out.println("\nFinal del Ejemplo1");
    
   }
  }
