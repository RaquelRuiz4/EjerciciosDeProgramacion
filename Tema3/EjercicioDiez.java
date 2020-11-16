public class EjercicioDiez{
public static void main(String[] args){

  System.out.println("Introduzca los MB que desee convertir: ");
  float MB = Float.parseFloat(System.console().readLine());
  float KB = MB*1000;
  System.out.println("Resultado: " + KB + "KB");

}
}
