/* Hacer una función que devuelva el  número de números pares que hay en una matriz 
 * de enteros que se le pasa como argumento. */

/* Hacer una función que devuelva una matriz de enteros con los números pares que hay en otra
 * matriz de enteros que se le pasa como argumento. */


public class EjercicioClase{
  public static void main(String[] args){
    
    int[] arr = { 3, 2, 4, 6 ,7 ,1, 8, 9, 2};
    System.out.println(paresEnArray(arr));
    int[] resultado = matrizPares(arr);
    for (int i = 0; i < resultado.length; i++){
      System.out.print(resultado[i] + " ");
    }
  }
  
  
  public static int paresEnArray (int[] array){
   
    int cont = 0;
    for (int i = 0; i < array.length; i++){
      if (array[i] % 2 == 0){
        cont++;
      } 
    }
    return cont;
  }
  public static int[] matrizPares (int[] matriz){
     int[] resultado = new int [paresEnArray(matriz)];
     int cont = 0;
     for (int i = 0; i < matriz.length; i++){
        if (matriz[i] % 2 == 0){
          resultado[cont++] = matriz[i];
        } 
      }
      return resultado;
    }
  }



