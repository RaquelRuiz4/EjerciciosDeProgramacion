package funciones;
 public class OperacionesArraysBi{
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
