/* Realice un programa que capture palabras por teclado y las presente en el mismo orden en que las introdujo.
El programa pedirá recurrentemente palabras, y se detendrá cuando la palabra introducida sea “salir”.
Entonces mostrará por pantalla todas las palabras anteriores introducidas. */

public class PracticaExamen2{
  public static void main(String [] args){
  
  String word = "";
  String conc = "";
  
  do {
    System.out.println("Introduzca palabras y las monstraremos en una frase dándole la vuelta");
    word = System.console().readLine();
      if (!(word.equals("salir"))){
        conc = word + " " + conc;
      }
    }
  while (!(word.equals("salir")));
  System.out.println(conc);
  }
}

  
