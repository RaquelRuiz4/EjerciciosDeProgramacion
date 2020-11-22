/* Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado. */

public class Ejercicio9T6{
  public static void main (String [] args) {
    int contador = 0;
    int num;
     do {
        num = (int)(Math.random()*51)*2;
       contador++;
       System.out.println("Números aleatórios: " + num);
     }
     while (!(num == 24));
     System.out.println("Cantidad de números aleatorios antes del 24: " + contador);
  
  }
}
