// Devuelve el menor primo que es mayor al número que se pasa como parámetro
import static funciones.OperacionesEnteros.esPrimo;
public class Ejercicio3T8{
  public static void main(String[] args){
    
    int prueba = 11;
    System.out.println(siguientePrimo(prueba));
    
  }
  
  public static int siguientePrimo(int num){
    num++;
    while(esPrimo(num) == false) {
    num++;
  }
    return num;
  }
}
