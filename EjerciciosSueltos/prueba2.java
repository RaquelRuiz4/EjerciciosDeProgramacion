/* Raquel Ruiz Pérez -- 14/01/2021 */

public class prueba2{
  public static void main(String[] args){
  
  System.out.print("Indique el tamaño de la matriz bidimensional - filas: ");
  int filas = Integer.parseInt(System.console().readLine());
  System.out.print("Indique el tamaño de la matriz bidimensional - columnas: ");
  int colum = Integer.parseInt(System.console().readLine());
  
  System.out.print("Indique extremo inferior rango aleatorio para rellenar matriz: ");
  int min = Integer.parseInt(System.console().readLine());
  System.out.print("Indique extremo superior rango aleatorio para rellenar matriz: ");
  int max = Integer.parseInt(System.console().readLine());
  
  System.out.print("Indique la cantidad de valores aleatorios que desea extraer: ");
  int extraer = Integer.parseInt(System.console().readLine());
  
  int[][] arr = new int [filas][colum];
  int i = 0;
  int j = 0;
  
  for(i = 0; i < filas; i++){
    for(j = 0; j < colum; j++){
      arr[i][j] = (int)(Math.random()*max-min+1)+min;
      System.out.printf("%4d", arr[i][j]);
      
    }
    System.out.println();
  }
  
    System.out.print("Los valores aleatoriamente obtenidos de la matriz son: ");
    for (int k = 0; k < extraer; k++){
    
    }
  }
}
