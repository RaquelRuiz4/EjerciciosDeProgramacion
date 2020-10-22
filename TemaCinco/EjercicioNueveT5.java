/**
* 5. Bucles
*
* 9. Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
*
* @author Raquel Ruiz Pérez
*/

public class EjercicioNueveT5{
  public static void main(String[] args){
    int contador = 0;
    int num;
  
    System.out.println("Introduzca un número por teclado y le diremos cuántos dígitos tiene.");
      num = Integer.parseInt(System.console().readLine());
      while (num > 0) {
        num /= 10;
        contador++;
    }
    System.out.println(contador);
  }
}
