public class EjercicioUno{
public static void main(String[] args){
  String dia;
  System.out.println("Introduzca el día de la semana");
  dia = (System.console().readLine());
  switch(dia) {
  case "lunes":
  System.out.println("El lunes tienes Programación");
  break; 
  case "martes":
  System.out.println("El martes tienes Sistemas Informáticos");
  break;
  case "miércoles":
  System.out.println("El miércoles tienes Programación");
  break;
  case "jueves":
  System.out.println("El jueves tienes Programación");
  break;
  case "viernes":
  System.out.println("El viernes tienes Sistemas Informáticos");
  break;
  case "sábado":
  System.out.println("No tienes clases");
  break;
  case "domingo":
  System.out.println("No tienes clases");
  break;
  default: 
  System.out.println("El día que ha introducido no es correcto.");
 } 
}
}
