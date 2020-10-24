public class EjercicioRefuerzo4{
  public static void main(String[] args) {
  int numalto;
  int numbajo;
  int salto;
    System.out.println("Introduzca el número más alto");
      numalto = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el número más bajo");
      numbajo = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el número de saltos");
      salto = Integer.parseInt(System.console().readLine());
    for ( int i = numalto; i >= numbajo; i-=salto) {
      if (i == numbajo){
        System.out.print(i);
    }
     else {
       System.out.print(i + " - ");
      }
    }
  }
}
