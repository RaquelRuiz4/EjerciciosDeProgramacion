/*  Devuelve verdadero si el número que se pasa como parámetro
es primo y falso en caso contrario. */
public class Ejercicio2T8{
  public static void main(String[] args){
    
    int prueba = 8;
    esPrimo(prueba);
    System.out.println(esPrimo(prueba));
  }
  
  
  
  public static boolean esPrimo (int num){
    boolean respuesta = true;
    for (int i = 2; i < num; i++){
      if (num % i == 0){
        respuesta = false;
      } 
  }
          return respuesta;
  }
}
