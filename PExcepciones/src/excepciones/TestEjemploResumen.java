package excepciones;
// EjemploResumen:Capturar,levantar y lanzar excepciones.     

//Importa el paquete  
  import java.util.*;

//Definici�n de la clase
  public class TestEjemploResumen
  {

   //Definici�n de la funci�n principal
     public static void  main(String args[])
     {  
      //Declaracion de variables
        int nro1 = 10, nro2 = 0, cociente = 0 ;

      //Caso 1: Captura el error con Exception
        System.out.println("\n\nCaso 1 : Bloque catch Exception");
        try
        {
         cociente = nro1/nro2; 
         System.out.println("\n" + nro1 +" : " + nro2 + " = " + cociente);    
        }       
        catch(Exception e)
        {
         //Visualizar el error producido
           System.out.println("\nBloque catch Exception");
           System.out.println(e.getMessage());         
        }
        finally
        {
         System.out.println("\nFinal del caso 1 : capturar el error con exception");
        }
 
      //Caso 2: Captura el error con ArithmeticException
        System.out.println("\n\nCaso 2 : Bloque catch ArithmeticException");       
        try
        {
         cociente = nro1/nro2; 
         System.out.println("\n" + nro1 +" : " + nro2 + " = " + cociente);    
        }        
        catch(ArithmeticException e)
        {
         //Visualizar el error producido
           System.out.println("\nBloque catch ArithmeticException");
           System.out.println(e.getMessage());        
        }       
        finally
        {
         System.out.println("\nFinal del caso 2 : capturar el error con ArithmeticException   ");
        } 

      //Caso 3: Captura el error con ErrorAritmeticoException
        System.out.println("\n\nCaso 3 : Bloque catch ErrorAritmeticoException");       
        try
        {
         cociente = mDividir(nro1,nro2); 
         System.out.println("\n" + nro1 +" : " + nro2 + " = " + cociente);    
        }        
        catch(ErrorAritmeticoException e)
        {
         //Visualizar el error producido
           System.out.println("\nBloque catch ErrorAritmeticoException");
           System.out.println(e.getMessage());
        //Visualiza las llamadas producidas hasta el metodo que gener� el error
           e.printStackTrace();       
        }       
        finally
        {
         System.out.println("\nFinal del caso 3 : capturar el error con ErrorAritmeticoException");
        } 

      //Caso 4: Captura el error con ErrorAritmeticoException pero no hay errores
        System.out.println("\n\nCaso 4 : Bloque catch ErrorAritmeticoException");       
        try
        {
         nro2 = 2; 
         cociente = mDividir(nro1,nro2); 
         System.out.println("\n" + nro1 +" : " + nro2 + " = " + cociente);    
        }        
        catch(ErrorAritmeticoException e)
        {
         //Visualizar el error producido
           System.out.println("\nBloque catch ErrorAritmeticoException");
           System.out.println(e.getMessage());        
        }       
        finally
        {
         System.out.println("\nFinal del caso 4 : capturar el error con ErrorAritmeticoException pero sin error");
        }      
    
      //Final del programa  
        System.out.println("\nFinal del EjemploResumen");
    
   }

  //Calcular cociente
    static public int mDividir(int nro1,int nro2) throws ErrorAritmeticoException
    {
     int cociente = 0;

     if (nro2 == 0)
        throw new ErrorAritmeticoException("No se puede realizar la division del " + nro1 + " entre " +
                               nro2 + " porque daria un error");
      else 
        cociente = nro1 / nro2;
     
     System.out.println("\nFinal del metodo mDividir");
   
     return cociente;
    }
  }
