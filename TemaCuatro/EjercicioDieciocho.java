public class EjercicioDieciocho{
public static void main(String[] args){
  int x = 0;
  System.out.println("Introduzca un número y le diremos el primer dígito");
  System.out.println("Introduzca un número de hasta 5 dígitos");
  int num = Integer.parseInt(System.console().readLine());
    if( num >= 10000){
    x = num / 10000;
  }
    System.out.println("El primer número es: " + x);
     else if( num >= 1000){
    x = num / 1000;
  }
    System.out.println("El primer número es: " + x);
    else if( num >= 100){
    x = num / 100;
  }
    System.out.println("El primer número es: " + x);
    else if( num >= 10){
    x = num / 10;
  }
    System.out.println("El primer número es: " + x);
}
}
