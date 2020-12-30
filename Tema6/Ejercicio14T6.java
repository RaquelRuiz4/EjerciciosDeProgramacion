/* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir. */

public class Ejercicio14T6{
  public static void main(String[] args){
  
  int i = 5;
  System.out.println("Introduzca el número en el que está pensando (entre 0 y 100)");
  System.out.println("Tiene " + i + " oportunidades");
  int numPensado = Integer.parseInt(System.console().readLine());
  
  for (i = 5; i > 0; i--){
    int num = (int)(Math.random()*101);
    System.out.println(num);
  }
    
  
  
  
  
  
  
  
  
  
  }
}
