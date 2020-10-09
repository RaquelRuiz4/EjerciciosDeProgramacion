public class EjercicioCinco {
public static void main(String[] args){
  double A;
  double B;
  
  System.out.println("Introduzca el primer dato: ");
   A = Double.parseDouble(System.console().readLine());
  System.out.println("Introduzca el segundo dato: ");
   B = Double.parseDouble(System.console().readLine());
 if (A == 0){
   System.out.println("No se puede realizar la operación.");
 }
 else {
   System.out.println("Resultado: " + (-B/A));
}
}
}
