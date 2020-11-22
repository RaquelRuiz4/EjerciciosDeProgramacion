public class Ejercicio6T6{
  public static void main (String [] args) {
  int intento = 0;
  int contador = 0;
  
  int num = (int) (Math.random()*100);
  // System.out.println(num);
  
  do {
    System.out.println("Adivine un número al azar entre 0 y 100, tiene " + (5 - contador) + " oportunidades");
    intento = Integer.parseInt(System.console().readLine());
    contador++;
    if (intento == num){
    System.out.println("¡Lo has acertado!");
    }
    else if (intento < num) {
      System.out.println("El número introducido es menor!");
    }
      else if (intento > num) {
      System.out.println("El número introducido es mayor!");
}
}
    while ((contador < 5) && (!( num == intento)));
    if (contador == 5){
    System.out.println("Lo siento, has agotado las oportunidades"); }
      
    
}
  }

