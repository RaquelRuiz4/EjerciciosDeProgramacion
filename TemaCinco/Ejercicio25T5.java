/* Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés. */

public class Ejercicio25T5{
   public static void main(String[] args){
    int num;
    System.out.println("Introduzca un número por teclado y se mostrará ese número al revés");
    num = Integer.parseInt(System.console().readLine());
    int aux = num;
    int vuelta = 0;
    while (aux > 0) {
    vuelta = (vuelta * 10) + ( aux % 10);
    aux /= 10;
    }
      System.out.println(vuelta);
  }
}

