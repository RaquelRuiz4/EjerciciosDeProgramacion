/* Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa. */

public class Ejercicio3T7{
  public static void main(String[] args){
  
  System.out.println("Introduzca 10 números: ");
  int[] array = new int [10];
  for (int i = 0; i < 10; i++){
    array[i] = Integer.parseInt(System.console().readLine());
    }
  for (int i = 0; i < 10; i++){
    System.out.print(array[i] + " ");
    }
    System.out.println();
  for (int i = 9; i >= 0; i--){
    System.out.print(array[i] + " ");
    }
  }
}
