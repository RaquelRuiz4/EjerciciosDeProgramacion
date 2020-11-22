/* Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres. */

public class Ejercicio10T6{
public static void main(String [] args) {
  int num = 0;
  String symbol = "";
  int linea;
  for ( int i = 10; i > 0; i--){
          linea = (int)(Math.random()*40)+1;

   num = (int)(Math.random()*7);
    switch (num) {
      case 1:
        symbol = "*";
      break;
   
      case 2:
        symbol = "-";
      break;
   
      case 3:
        symbol = "=";
      break;
   
      case 4:
        symbol = ".";
      break;
   
      case 5:
        symbol = "|";
      break;
   
      case 6:
        symbol = "@";
      break;
      }
      for(int j = 1; j <= linea; j++) {
System.out.print(symbol);
}
System.out.println();
}
}
}
