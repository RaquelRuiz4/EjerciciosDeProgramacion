/* generaArrayInt: Genera un array de tamaño n con números aleatorios
cuyo intervalo (mínimo y máximo) se indica como parámetro */

public class Ejercicio20T8{
  public static void main(String[] args){

  System.out.println("Indique el número mínimo de la array: ");
  int min = Integer.parseInt(System.console().readLine());
  System.out.println("Indique el número máximo de la array: ");
  int max = Integer.parseInt(System.console().readLine());
  System.out.println("Indique el número de filas: ");
  int filas = Integer.parseInt(System.console().readLine());
  
  int[] arr2 = generaArrayInt(filas, max, min);
  
  for (int i = 0; i < filas; i++){
  
    System.out.print(arr2[i]);
    }

}

public static int[] generaArrayInt(int filas, int max, int min){

int[] arr = new int[filas];
for (int i = 0; i < filas; i++){
arr[i] =(int)(Math.random()*max - min + 1) + min;
    
    }
return arr;
}

}










