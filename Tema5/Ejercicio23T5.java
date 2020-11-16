/* Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media. */

public class Ejercicio23T5{
  public static void main(String [] args){
    int num;
    int contador = 0;
    int suma = 0;
    
    do {
      System.out.println("Introduzca los números: ");
      num = Integer.parseInt(System.console().readLine());
    suma += num;
    contador++;
    }
      while ( suma < 10000); 
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("Los números introducidos son: " + contador);
        System.out.println("El resultado de la media es: " + suma/contador);


}
}
