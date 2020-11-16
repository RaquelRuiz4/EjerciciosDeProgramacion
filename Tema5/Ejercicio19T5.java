/* Haz una pirámide */

public class Ejercicio19T5{
  public static void main(String[] args){
  int alt;
  String symbol= "";
  System.out.println("Introduzca la altura:");
  alt = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el símbolo que desee:");
  symbol = System.console().readLine();
// altura
  for (int i = 0; i < alt; i++){

// espacio
    for (int j = alt; j > i+1; j--) {
      System.out.print(" ");
    }
      for (int k = 0; k < (i+1)*2-1; k++){
              System.out.print(symbol);
      }
            System.out.println();
    }
  }
}
