/* Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separa-
dos por espacios. */

public class Ejercicio4T6{
  public static void main(String [] args) {
  System.out.println("Muestra 20 números aleatorios entre 0 y 10 separados por espacios");
  int numeros = 0;
  for (int i = 0; i < 20; i++){
  numeros = (int)(Math.random()*11);
   System.out.print(numeros + " ");
    }
  }
}
