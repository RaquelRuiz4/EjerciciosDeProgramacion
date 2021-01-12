/* Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números. */

  public class Ejercicio4T72{
    public static void main(String[] args){
      int[][] arr = new int [4][5];
      int resultado = 0;

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
          resultado += suma;
        System.out.print("suma: " + suma);
        System.out.println();
        }
        int suma1 = 0;
        
        for (int j = 0; j < 5; j++){
          suma1 = 0;
          for (int i = 0; i < 4; i++){
            suma1 += arr[i][j];
        }
        resultado += suma1;
         System.out.print("suma: " + suma1);
         System.out.println();
        }
        System.out.print("Total: " + resultado);
      }
    }
  
