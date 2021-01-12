/* Hacer una rotación a la derecha:
a) Por filas, utilizando una matriz bidim. Auxiliar
b) Por columnas, utilizando una matriz bidim. Aux
c) Por filas, en la misma matriz (usar un entero auxiliar)
d) Por columnas, en la misma matriz (usar una
matriz unidim. Auxiliar con tantas celdas como
número de filas) */

public class EjercicioClase1{
  public static void main(String[] args){
  
  int[][] array = new int [4][4];
  int i = 0;
  int j = 0;
  for( i = 0; i < 4; i++){
    for ( j = 0; j < 4; j++){
      array[i][j] = (int)(Math.random()*10);
      }
    }
      
      System.out.println();
       for(i = 0; i < 4; i++){
    for (j = 0; j < 4; j++){
      System.out.print(array[i][j]);
      }
      System.out.println();
    }
    
          System.out.println();
    int[][] aux1 = new int [4][4];
     for(i = 0; i < 4; i++){
       for (j = 0; j < 4-1; j++){
         aux1[i][0] = array[i][4-1];
         System.out.print(array[i][j]);
     }
     
     System.out.println();
   }

  }
}
