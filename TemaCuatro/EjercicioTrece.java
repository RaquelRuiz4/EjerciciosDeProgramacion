public class EjercicioTrece{
public static void main(String[] args){
  int aux;
  System.out.println("Introduzca 3 números y serán ordenados de mayor a menor.");
  System.out.println("Introduzca el primer número: ");
    int a = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el segundo número: ");
    int b = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el tercer número: ");
    int c = Integer.parseInt(System.console().readLine());
  if (a > b) {
    aux = a;
    a = b;
    b = aux;
  }
  if (b > c) {
    aux = b;
    b = c;
    c = aux;
  }
  if (a > b) {
    aux = a;
    a = b;
    b = aux;
  }
  System.out.println("El orden correcto de los números es: " + a + ", "+ b + ", " + c);
}
}
