/* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array.

 El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario. */ 

public class Ejercicio10T7{
  public static void main(String[] args){
  
  int[] array = new int [20];
  
  for (int i = 0; i < 20; i++){
  array[i] = (int)(Math.random()*101);
  }
  
  
  }
}
