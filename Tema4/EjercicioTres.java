public class EjercicioTres{
public static void main(String[] args){
  System.out.println("Introduzca un número del 1-7 para indicarle el día de la semana correspondiente");
  int Num = Integer.parseInt(System.console().readLine());
  switch(Num) {
  case 1:
  System.out.println("Lunes");
  break; 
  case 2:
  System.out.println("Martes");
  break;
  case 3:
  System.out.println("Miércoles");
  break;
  case 4:
  System.out.println("Jueves");
  break;
  case 5:
  System.out.println("Viernes");
  break;
  case 6:
  System.out.println("Sábado");
  break;
  case 7:
  System.out.println("Domingo");
  break;
  default: 
  System.out.println("El número que ha introducido no es correcto.");
 } 
}
}
