/* . Realice un programa que capture palabras por teclado y las presente en el mismo orden en que las introdujo.
El programa pedirá recurrentemente palabras, y se detendrá cuando la palabra introducida sea “salir”.
Entonces mostrará por pantalla todas las palabras anteriores introducidas. */

public class EjercicioRefuerzo12{
  public static void main(String[] args){
    String word = "";
    int contador = 0;
    String conc = "";
  do {
    System.out.println("Introduzca una palabra (acaba con “salir”): ");
    word = System.console().readLine();
    contador++;
      if (!(word.equals("salir"))){
        conc =word + " " + conc;
        
      }
    }
    while (!(word.equals("salir")) && (contador < 4));
    System.out.println(conc);
   }
 }

