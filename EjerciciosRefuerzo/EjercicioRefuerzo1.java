public class EjercicioRefuerzo1{
  public static void main(String[] args) {
  int num;
  String sim = " " ;
  System.out.println("Elije la cantidad de números que quiere que se muestren por pantalla.");
    num = Integer.parseInt(System.console().readLine());
  for (int i= 1; i <= num; i++) {
    if ( i == num) {
    System.out.print(i);
  }
  else {
    System.out.print(i + " - ");
  }
    }
  }
}
