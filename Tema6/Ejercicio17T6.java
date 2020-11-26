/* Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo. */

public class Ejercicio17T6{
  public static void main(String[] args){
  
  int alto;
  int ancho;
  
  System.out.println("Introduzca el alto de la pecera (min un 4)");
  alto = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el ancho de la pecera (min un 4)");
  ancho = Integer.parseInt(System.console().readLine());

for (int i = 0; i <= ancho; i++){
  System.out.print("*");
}
Syste.out.println();
for (int j = 2; j <= alto; j++){
}
}
}
}

