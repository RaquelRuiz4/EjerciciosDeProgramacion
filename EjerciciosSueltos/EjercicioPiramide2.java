/* El usuario va a meter dos números, uno para columna y otro para fila, con eso se hará el trapecio. */

public class EjercicioPiramide2{
  public static void main (String [] args){
    int num1;
    int num2;
    System.out.print("Introduzca la cantidad de columnas por teclado: ");
    num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la cantidad de filas por teclado: ");
    num2 = Integer.parseInt(System.console().readLine());
   if (num1 < num2) {
      for (int i = num1; i <= num2; i++) {
        for (int j = 1; j <= i; j++){
        System.out.print("*");
        }
      System.out.println();
      }
    } else {
      for (int i = num1; i >= num2; i--) {
        for (int j = 1; j <= i; j++){
        System.out.print("*");
        }
      System.out.println();
      }
    }
  }
}
    
      
    
