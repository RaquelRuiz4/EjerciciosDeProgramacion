/* . Realice un programa que capture palabras por teclado y las presente en el mismo orden en que las introdujo.
El programa pedirá recurrentemente palabras, y se detendrá cuando la palabra introducida sea “salir”.
Entonces mostrará por pantalla todas las palabras anteriores introducidas. */

public class EjercicioRefuerzo10{
  public static void main(String[] args){
    String word = "";
    String conc = "";
  do {
    System.out.println("Introduzca una palabra (acaba con “salir”): ");
    word = System.console().readLine();
      if (!(word.equals("salir"))){
        conc = conc + word +" ";
      }
    }
    while (!(word.equals("salir")));
    System.out.println(conc);
   }
 }

