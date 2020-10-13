public class EjercicioDoce{
public static void main(String[] args){
  
  int puntos = 0;
  String respuesta;
  
  System.out.println("Minicuestionario de Sistemas Informáticos.");
  System.out.println("Responda con V si es verdadero y con F si es falso");
  System.out.println("Un teclado es un dispositivo de salida");
  respuesta = System.console().readLine();
  if (respuesta.equals("F")) {
  puntos++; 
  }
  System.out.println("El número 1001 es un número decimal");
   respuesta = System.console().readLine();
  if (respuesta.equals("F")) {
  puntos++; 
  }
  System.out.println("Un monitor es un dispositivo de entrada");
   respuesta = System.console().readLine();
  if (respuesta.equals("F")) {
  puntos++; 
  }
  System.out.println("El número 21 se escribe en binario de la siguiente forma: 10101");
   respuesta = System.console().readLine();
  if (respuesta.equals("V")) {
  puntos++; 
  }
  System.out.println("Una impresora 3D se clasifica como un dispositivo de entrada-salida");
   respuesta = System.console().readLine();
  if (respuesta.equals("V")) {
  puntos++; 
  }
  System.out.println("El numero 1100 se corresponde con la letra C en hexadecimal");
   respuesta = System.console().readLine();
  if (respuesta.equals("V")) {
  puntos++; 
  }
  System.out.println("El ratón es un dispositivo de salida ");
   respuesta = System.console().readLine();
  if (respuesta.equals("F")) {
  puntos++; 
  }
  System.out.println("El número 1111 en decimal corresponde al 15");
   respuesta = System.console().readLine();
  if (respuesta.equals("V")) {
  puntos++; 
  }
  System.out.println("Un micrófono es un dispositivo de entrada");
   respuesta = System.console().readLine();
  if (respuesta.equals("V")) {
  puntos++; 
  }
  System.out.println("La letra A se escribe 1010 de forma binaria");
 respuesta = System.console().readLine();
  if (respuesta.equals("V")) {
  puntos++; 
  }
System.out.println("\nHa obtenido " + puntos + " puntos.");
}
}
