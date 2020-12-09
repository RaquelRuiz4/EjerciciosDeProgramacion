/* Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo. */

public class Ejercicio 17T6{
  public static void main(String[] args){
  String pececito = "@";
  System.out.println("Introduzca el alto de la pecera ");
  int alto = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el ancho de la pecera ");
  int ancho = Integer.parseInt(System.console().readLine());
  int num = (int) (Math.random()*ancho-alto+1)+alto;
  }
  }
