/* Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres. */

public class Ejercicio10T6{
public static void main(String [] args) {

  for ( int i = 0; i < 10; i++){
  // caracteres de la linea lineas 
  int num = (int)(Math.random()*(40-1+1))+1;
}
System.out.print(num);

}
}
