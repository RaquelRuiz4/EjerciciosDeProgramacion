/* Implemente una función que reciba como argumentos un array de enteros,
y otros dos enteros, que serán los extremos de un rango entre los que la función
elegirá valores aleatorios (ambos incluidos) y rellenará el array pasado como argumento. 
Esta función no tiene que devolver, como función, nada 
(ya realiza cambios a través del argumento del array de enteros, el cual va pasado por 
referencia) */


public class EjercicioFuncClase2{
  public static void main (String [] args){
    int[] arr = new int[5];
    
    System.out.println("Valor mínimo: ");
     int nummin = Integer.parseInt(System.console().readLine());
    
    System.out.println("Valor máximo: ");
     int nummax = Integer.parseInt(System.console().readLine());
    
    ArrayUni(arr, nummax, nummin);
    for (int j = 0; j < arr.length; j++){
      System.out.print(" " + arr[j] + " ");
      }
    }
  
  public static void ArrayUni(int[] arr, int nummax, int nummin){
    for (int j = 0; j < arr.length; j++){
      arr[j] = (int)(Math.random()*(nummax-nummin+1)+nummin);
    }
  }
}
