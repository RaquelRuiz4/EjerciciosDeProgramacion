/* Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente. */

public class Ejercicio5T7{
  public static void main(String[] args){
    System.out.println ("Introduzca 10 números y se le indicará cual es el max y cual el min");
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int i;
    int [] array = new int [10];
    for (i = 0; i < 10; i++){
      array[i] = Integer.parseInt(System.console().readLine());
    if (array[i] < minimo) {
      minimo = array[i];
    }
    if (array[i] > maximo) {
      maximo = array[i];
    }
    }
    System.out.println();
    
    for (i = 0; i < 10; i++) {
      System.out.print(array[i]);
      if (array[i] == maximo) {
        System.out.print(" máximo");
      }
    if (array[i] == minimo) {
      System.out.print(" mínimo");
    }

    System.out.println();
    }
  }
}
