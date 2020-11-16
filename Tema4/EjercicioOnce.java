public class EjercicioOnce{
public static void main (String[] args){

  System.out.println("Introduzca una hora determinada para calcular los segundos que faltan hasta medianoche");

  System.out.println("Introduzca la hora deseada: ");
  int horas = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca los minutos deseados: ");
  int minutos = Integer.parseInt(System.console().readLine());
  
  int segundos = (minutos*60) + (horas*3600);
  int segdia= 24*3600;
  int result = segdia - segundos;

  System.out.println("Resultado: " + result);





}
}
