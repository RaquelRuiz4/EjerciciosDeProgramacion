/* Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda. */

public class Ejercicio9T7{
  public static void main(String[] args){
    int[] array = new int [8];
    
    System.out.println("Introduzca 8 números para indicar cual es par y cual impar: ");
    for (int i = 0; i < 8; i++){
      array[i] = Integer.parseInt(System.console().readLine());
    }
  
    for (int j = 0; j < 8; j++){
      if (array[j] % 2 == 0){
        System.out.println("par: " + array[j]);
    } else {
        System.out.println("impar: " + array[j]);
      }
    }
  }
}
