/* Realice un programa que capture palabras por teclado y las presente en el mismo orden en que las introdujo.
El programa pedirá recurrentemente palabras, y se detendrá cuando la palabra introducida sea “salir”.
Entonces mostrará por pantalla todas las palabras anteriores introducidas. */

public class PracticaExamen1{
  public static void main(String [] args){
  
  String result = "";
  String word = "";
  do {
  System.out.println("Introduzca palabras y se mostrarán en una frase cuando se use la palabra salir");
    word = System.console().readLine();
    if (!(word.equals("salir"))) {
      result += word + " ";
    }
    }   
      while (!(word.equals("salir")));
          System.out.println(result);
        }
        
    }
