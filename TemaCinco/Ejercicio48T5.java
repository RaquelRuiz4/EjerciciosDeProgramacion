public class Ejercicio48T5{
  public static void main(String [] args){
  long dato;
  
  System.out.print("Introduzca un número entero: ");
  dato = Long.parseLong(System.console().readLine());
  
  boolean digitoEncontrado; 
  for (int i = 0; i<=9; i++){ //En cada pasada analizo el digito i
  digitoEncontrado = false;
  long aux = dato;
  while(dato>0){
  if ((aux % 10) == i) {
    digitoEncontrado = true;
    
  }
  aux = aux / 10; 
  }
  if (digitoEncontrado){
    System.out.println( i + " ");
  }
  }
  }
  }
