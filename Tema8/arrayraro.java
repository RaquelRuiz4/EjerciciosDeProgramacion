import funciones.OperacionesEnteros.*;
public class arrayraro{
  public static void main(String[] args){
    int[] array = {2, 5, 7, 223, 567, 443, 674};
    System.out.println("Introduzca un número: ");
    int dig = Integer.parseInt(System.console().readLine());
     System.out.println(posicionDeDigito(array, dig));

  }

  public static int posicionDeDigito(int[] arr, int num){

    for (int i = 0; i < arr.length; i++){
      for (int j = 0; j < funciones.OperacionesEnteros.Digitos(arr[i]); j++){
        if (funciones.OperacionesEnteros.DigitoN(arr[i],j) == num){
          return i;
        }
      }
    }
     return -1;
    }
  }
