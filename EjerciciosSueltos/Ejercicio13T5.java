/* Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos. */
public class Ejercicio13T5{
  public static void main(String[] args) {
int positivo = 0;
int negativo = 0;
int num;

  System.out.println("introduzca 10 números para determinar cuántos son negativos y cuántos positivos: ");
  for( int i = 1; i <= 10; i++){
    num = Integer.parseInt(System.console().readLine());
    if (num > 0){
      positivo++;
     System.out.println("Ha introducido" + " " + positivo + " " + "números positivos y " + negativo + " " + "números negativos");
   }
   else if (num != 0){
     negativo++;
     System.out.println("Ha introducido" + " " + negativo + " " + "números negativos y " + positivo + " " + "números positivos");
   }
 }
}
}
