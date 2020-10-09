public class EjercicioSeis{
  public static void main(String[] args) {
    
  double g = 9.81;
  double h;
  System.out.println("Introduzca la altura: ");
  h = Double.parseDouble(System.console().readLine());
    if (h == 0) {
    System.out.println("No se puede realizar la fórmula");
    }
    else {
      double calculo = Math.sqrt((2*h)/g);
    System.out.println("Resultado: " + calculo + " " + "segundos");
}
}
}








