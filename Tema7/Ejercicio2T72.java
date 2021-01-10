/* Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha. */

  public class Ejercicio2T72{
    public static void main(String[] args){
      int[][] arr = new int [4][5];
      
      System.out.println("Introduzca 20 números enteros: ");
  
      for (int i = 0; i < 4; i++){
        for (int j = 0; j < 5; j++){
        arr[i][j] = Integer.parseInt(System.console().readLine());
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
        
