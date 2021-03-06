/* Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo. */ 
public class Ejercicio5T72{
  public static void main(String[] args){
  
    int[][] arr = new int[6][10];
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < 6; i++){
      for (int j = 0; j < 10; j++){
        arr[i][j] = (int)(Math.random()*1001);
        System.out.printf("%5d", arr[i][j]);
        if (arr[i][j] < min){
          min = arr[i][j];
        } 
        if (arr[i][j] > max){
          max = arr[i][j];
        }
      }
      System.out.println();
    }
    
    for (int i = 0; i < 6; i++){
      for (int j = 0; j < 10; j++){
    if (arr[i][j] == min){
      System.out.println("El mínimo se encuentra en la fila: " + i + " y en la columna: " + j );
    } 
    else if (arr[i][j] == max){
      System.out.println("El máximo se encuentra en la fila: " + i + " y en la columna: " + j );
        }
      }
    }
  }
}
