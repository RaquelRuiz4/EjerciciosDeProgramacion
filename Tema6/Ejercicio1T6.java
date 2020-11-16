/* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados). */

public class Ejercicio1T6{
  public static void main(String [] args) {
    int puntos = 0;
  
    System.out.println("Se mostrará la tirada de 3 dados y la suma de ellos");
    for (int i = 1; i <= 3; i++){
      int dado = (int)(Math.random()*6)+1;
      puntos += dado;
      System.out.println("Numero del dado: " + dado);
      System.out.println("La suma de los puntos es: " + puntos);
    }
  }
}  
