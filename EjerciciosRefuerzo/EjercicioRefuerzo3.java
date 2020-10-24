public class EjercicioRefuerzo3{
  public static void main(String[] args) {
  int primnum;
  int cantnum;
  int salto;
   System.out.println("Elije la cantidad de números que quiere que se muestren por pantalla.");
    cantnum = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el número por el que desee que empiece la lista.");
    primnum = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el número de saltos");
      salto = Integer.parseInt(System.console().readLine());
    for (int i = 1; i <= cantnum; i++){
      if (i == cantnum){ 
      System.out.print(primnum);
    }
    else {
      System.out.print(primnum + " - ");
      primnum+=salto;
      }
    }
  } 
}
