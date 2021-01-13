/* Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
12 filas por 12 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados. */

public class Ejercicio9T72{
  public static void main(String[] args){
    int[][] arr = new int[12][12];
    for(int i = 0; i < 12; i++){
      for (int j = 0; j < 12; j++){
      arr[i][j] = (int)(Math.random()*101);
      System.out.printf("%4d", arr[i][j]);
      }
      System.out.println();
    }
    int aux = 0;
    int aux1 = 0;
    for(int i = 0; i <= 5; i++){
      //fila superior
      aux = arr[0+i][11-i];
      for (int j = 11-i; j >= 1+i; j--){
        arr[i][j] = arr[i][j-1];
      }
    
      // columna derecha 
      aux1 = arr[11-i][11-i];
      for (int j = 11-i; j > 1+i; j--){
        arr[j][11-i] = arr[j-1][11-i];
      }
      arr[i+1][11-i] = aux;
      
      // fila inferior
      aux = arr[11-i][i];
      for (int j = i; j < 11-i; j++){
        arr[11-i][j] = arr[11-i][j+1];
      }
      arr[11-i][11-i-1] = aux1;

      //columna izquierda
      for (int j = i; j < 11-i; j++){
        arr[j][i] = arr[j+1][i];
      }
      arr[11-i-1][i] = aux;
    }
    System.out.println();
    for(int i = 0; i < 12; i++){
      for (int j = 0; j < 12; j++){
        System.out.printf("%4d", arr[i][j]);
      }
    System.out.println();
    }
  } 
}
