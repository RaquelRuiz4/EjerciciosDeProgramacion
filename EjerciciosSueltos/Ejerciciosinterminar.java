/*
 4
 * System.out.console("Introduzca la altura de la pirámide".);
  int num = Integer.parseInt(System.console().readLine());
---*
--***
-*****
*******


espacios en blanco = 4-1;
cantidad de asteriscos = 1;
for (int i=1; i<=4; i++) {
	for () //espacios

	for () //asteriscos

	System.out.println();
	1 espacio en blanco menos
	2 asteriscos más
}
*/

public class EjercicioPiramide3{
  public static void main(String[] args){
  
    for (int i = 1; i <=4; i++) {
      // Espacios
      for (int j = 4; j >= 1; j++){
        // Asteriscos
        for (int k = 1; k <= 4; k+=2) {
        }
        System.out.print("*");
      }
    }
    System.out.println();
  }
}
