public class Ejercicio26T5{
  public static void main(String[] args){
  int num;
  int digito;
  int numvuelta = 0;
  int cont = 0;
  System.out.println("Introduzca un número:");
  num = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca un dígito:");
  digito = Integer.parseInt(System.console().readLine());
   while (num > 0) {
  cont++;
  numvuelta = (numvuelta * 10) + (num % 10);
  num /= 10;
  }
  for (int j = 1; j <= cont; j++) {
    if (numvuelta % 10 == digito){
      System.out.println("La posición del dígito es: " + " " + j);
    }
   numvuelta /= 10;
    }
  }
}
