package excepciones;
/* Ejemplo6: No se captura el error en el metodo en el que se produce sino que se levanta
             o expulsa la excepci�n,esto quiere decir que se envia el error al metodo que
             lo ha llamado, en el cual se captura y se trata el error.

             Se evita el error verificando los datos antes de realizar la operaci�n y si
             los datos no son correctos no se realiza la operaci�n y se lanza  de  forma
             explicita una exception personalizada.
   
             Se suspende la ejecuci�n en el metodo donde se produce el error y se cede el
             control al metodo llamador en el cual se captura y se trata el error.
          
             Se salta las operaciones que est�n en el bloque try a continuaci�n de la 
             llamada al metodo donde est� el error y pasa a ejecutarse :
             -  lo indicado en el bloque catch donde se captura el error.
             -  lo indicado en el bloque finally.
             -  y siguiendo la ejecuci�n del programa en secuencia, saltando el resto de 
                bloques catch.   
*/

//Importa el paquete  
  import java.util.*;

//Definici�n de la clase
  public class TestEjemplo6
  {

   //Definici�n de la funci�n principal
     public static void  main(String args[])
     {
      //Declaracion de variables
        int nro1 = 10,nro2 = 0,cociente = 0;

      //Operaci�n de division entre cero
        try
        {
         cociente = mDividir(nro1,nro2); 
         System.out.println("\n" + nro1 +" : " + nro2 + " = " + cociente);    
        }
        catch(ArithmeticException e)
        {
         //Visualizar el error producido
           System.out.println("\nBloque catch ArithmeticException");
           System.out.println(e.getMessage());
         //Visualiza las llamadas producidas hasta el metodo que gener� el error
           e.printStackTrace();
        }
        catch(Exception e)
        {
         //Visualizar el error producido
           System.out.println("\nBloque catch Exception");
           System.out.println(e.getMessage());
         //Visualiza las llamadas producidas hasta el metodo que gener� el error
           e.printStackTrace();
        }
        finally
        {
         System.out.println("\nFinal del control de errores");
        }
 
    
      //Final del programa  
        System.out.println("\nFinal del Ejemplo6");
    
   }

  //Calcular cociente
    static public int mDividir(int nro1,int nro2) throws Exception
    {
     int cociente = 0;

     if (nro2 == 0)
        throw new Exception("No se puede realizar la division del " + nro1 + " entre " +
                               nro2 + " porque daria un error");
      else 
        cociente = nro1 / nro2;
     
     System.out.println("\nFinal del metodo mDividir");
   
     return cociente;
    }
  }
