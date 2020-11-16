/* Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado. */

public class Ejercicio11T5{
  public static void main(String[] args){
    int num;
    int contador = 0;
    System.out.println("Introduzca un número para calcular el cuadrado y el cubo");
    num = Integer.parseInt(System.console().readLine());
    for (int i = num+1; i < num+6; i++) {
      contador++;
      System.out.printf("%-10d  %-10d  %10d\n", i, i*i, i*i*i);
      
}
  }
  }
