package excepciones;
/* Ejemplo2: Se captura el error.
             Se salta las operaciones que est�n en el bloque try a continuaci�n
             de la operaci�n donde est� el error y pasa a ejecutarse :
             -  lo indicado en el bloque catch donde se captura el error            
             -  y siguiendo la ejecuci�n del programa en secuencia.
*/

//Importa el paquete  
  import java.util.*;

//Definici�n de la clase
  public class TestEjemplo2
  {

   //Definici�n de la funci�n principal
     public static void  main(String args[])
     {
      //Declaracion de variables
        int nro1 = 10,nro2 = 0,cociente = 0;

      //Operaci�n de division entre cero
        try
        {
         cociente = nro1 / nro2; 
         System.out.println("\n" + nro1 +" : " + nro2 + " = " + cociente);    
        }
        catch(Exception e)
        {
         //Visualizar el error producido
           System.out.println("Se ha producido la excepcion: "+e.getMessage());
         //Visualiza las llamadas producidas hasta el metodo que gener� el error
           e.printStackTrace();
        }
 
    
      //Final del programa  
        System.out.println("\nFinal del Ejemplo2");
    
   }
  }
