/**
* 5. Bucles
*
* 10. Escribe un programa que calcule la media de un conjunto de números
* positivos introducidos por teclado. A priori, el programa no sabe
* cuántos números se introducirán. El usuario indicará que ha terminado
* de introducir los datos cuando meta un número negativo.
*
* @author Raquel Ruiz Pérez
*/

public class EjercicioDiezT5{
  public static void main(String[] args) {
    int contador = 0;
    int num = 0;
    int div;
    int suma = 0;
    System.out.println("Introduzca números para hacer la media. Para parar, introduzca un número negativo.");
      while  (num >= 0){
      num = Integer.parseInt(System.console().readLine());
      contador++;
      suma+= num;
    }
     System.out.println("Resultado: " + ((suma - num) / (contador-1)));
   }
  }

