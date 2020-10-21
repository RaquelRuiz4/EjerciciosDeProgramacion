public class EjercicioSieteT5{
public static void main(String[] args){
  int pin = 1234;
  System.out.println(" Introduzca el pin de la caja fuerte para poder abrirla. Tiene 4 intentos");
  for ( int i = 3; i >=0; i--){
     pin = Integer.parseInt(System.console().readLine());
  if (pin == 1234){
    System.out.println("El pin es correcto. La caja fuerte está abierta");
}
 else {
   System.out.println("El pin es incorrecto. Le quedan" + " " + i + " " + "intentos.");
 }
 if (pin == 1234){
   i = 3;
 }
}
  
}
}
