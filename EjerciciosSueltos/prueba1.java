/* Raquel Ruiz Pérez -- 14/01/2021 */

public class prueba1{
  public static void main(String[] args){
  
    System.out.print("Introduzca el tamaño de la matriz unidimensional: ");
    int tam = Integer.parseInt(System.console().readLine());
    int[] arr = new int[tam];
  
    for (int i = 0; i < tam; i++){
      System.out.print("Introduzca elemento " + (i+1) + "º" + " ");
      arr[i] = Integer.parseInt(System.console().readLine());
    }

   System.out.print("Indique el tamaño de la matriz bidimensional - filas: ");
  int filas = Integer.parseInt(System.console().readLine());
  System.out.print("Indique el tamaño de la matriz bidimensional - columnas: ");
  int colum = Integer.parseInt(System.console().readLine());
  int i = 0;
  
  System.out.println("La matriz unidimensional de origen es: ");
   for (i = 0; i < tam; i++){
      System.out.print(arr[i] + "  ");
    }
    System.out.println();
    
    System.out.println("La matriz bidimensional de destino queda así: ");
    
    int[][] arrb = new int[filas][colum];
    
    
    for( i = 0; i < filas; i++){
      for (int j = 0; j < colum; j++){
        arrb[i][j] = -1;
        System.out.printf("%6d", arrb[i][j]);
        
      }
      System.out.println();
    }
  
    
}
}
