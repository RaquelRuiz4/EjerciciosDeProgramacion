/* Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999). */

public class Ejercicio3T72{
    public static void main(String[] args){
      int[][] arr = new int [4][5];
      
      System.out.println("Array con sumas: ");
  
      for (int i = 0; i < 4; i++){
        for (int j = 0; j < 5; j++){
        arr[i][j] = (int)(Math.random()*(999-100+1)+100);
        }
        System.out.println();
        }

      int suma = 0;
      for (int i = 0; i < 4; i++){
        suma = 0;
        for (int j = 0; j < 5; j++){
          System.out.print(arr[i][j] + "  " );
          suma += arr[i][j];
          }
        System.out.print("suma: " + suma);
        System.out.println();
        }
        
        int suma1 = 0;
        for (int j = 0; j < 5; j++){
          suma1 = 0;
          for (int i = 0; i < 4; i++){
            suma1 += arr[i][j];
        }
         System.out.print("suma: " + suma1);
         System.out.println();
        }
      }
    }
