public class EjercicioOnce{
public static void main(String[] args){

  System.out.println("Introduzca los KB: ");
  float KB = Float.parseFloat(System.console().readLine());
  float MB = KB/1000;
  System.out.println("Resultado: " + MB + "MB");
  

}
}
