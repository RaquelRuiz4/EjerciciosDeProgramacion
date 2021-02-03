/*  posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
dentro de un número entero. Si no se encuentra, devuelve -1. */
import static funciones.OperacionesEnteros.devuelveDigito;
public class Ejercicio8T8{
  public static void main(String[] args){
    int prueba = 1434;
    System.out.println("Introduzca un número: ");
    int dig = Integer.parseInt(System.console().readLine());
     System.out.println(posicionDeDigito(prueba, dig));
  }
  public static int posicionDeDigito(int[] arr, int num){

  for (int i = 0; i < arr.length; i++){
    if (arr[i] == num){
  return i;
    }
  }
     return -1;
  }
}
