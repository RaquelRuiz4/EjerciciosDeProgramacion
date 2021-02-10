/* generaArrayBiInt: Genera un array de tamaño n x m con números aleatorios cuyo intervalo
(mínimo y máximo) se indica como parámetro. */

public class Ejercicio29T8{
  public static void main(String[] args){
  System.out.println("Indique el número de filas: ");
  int filas = Integer.parseInt(System.console().readLine());
  System.out.println("Indique el número de columnas: ");
  int columnas = Integer.parseInt(System.console().readLine());
  System.out.println("Indique el número mínimo: ");
  int min = Integer.parseInt(System.console().readLine());
  System.out.println("Indique el número máximo: ");
  int max = Integer.parseInt(System.console().readLine());
  int[][] input = generaArrayBiInt(filas, columnas, min, max);
  
    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++){
        System.out.printf("%4d", input[i][j]);
      }
      System.out.println();
    }
  }
  public static int[][] generaArrayBiInt (int filas, int columnas, int min, int max){
    int [][] array = new int [filas][columnas];
    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++){
        array[i][j] = (int)(Math.random()*max-min+1)+min;
      }
      System.out.println();
    }
    return array;
  }
}
