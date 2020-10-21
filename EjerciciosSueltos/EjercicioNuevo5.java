public class EjercicioNuevo5{
public static void main(String[] args) {
  int i = 1;
  int j = 0;
  int base;
  int numexp;
  int exp;
  int pot;
  System.out.println("Introduzca un número de base y otro de potencia");
 System.out.println("-------------------------------------------------");
  System.out.println("Introduzca un número como base: ");
    base = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca un número como potencia: ");
    numexp = Integer.parseInt(System.console().readLine());
  for (i = 1; i <= numexp; i++) {
    exp = i;
    pot = 1;
    
  for (j = 0; j < exp; j++) {
  pot *= base;
      }
System.out.println(base + " " + "^" + " " + i + " = " + pot);
    }
  }
}
