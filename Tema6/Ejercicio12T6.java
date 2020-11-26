/* Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter. */

public class Ejercicio12T6{
  public static void main(String[] args){
    int fin = 0;
    for (int i = 0; i < 5000; i++){
    System.out.print((char)(Math.random()*(126-32+1)+32));
      if (fin++ == 80){
      fin = 0;
      System.out.println();
      }
    }
  }
}
