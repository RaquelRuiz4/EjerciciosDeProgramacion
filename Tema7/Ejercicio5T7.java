/* Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente. */


public class Ejercicio5T7{
  public static void main(String[] args){
   
    int[] array = new int[10];
    System.out.println("Introduzca 10 números: ");
    
    for (int i = 0; i < 10; i++) {
      array[i] = Integer.parseInt(System.console().readLine());
      System.out.println(array[i]);
    }
  
  
  
  
  
  
  
  
  
  }
}
