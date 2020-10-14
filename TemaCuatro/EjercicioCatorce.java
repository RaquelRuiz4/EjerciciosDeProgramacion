public class EjercicioCatorce{
public static void main(String[] args){

  System.out.println("Introduzca un número y le diremos si es par y/o divisible entre 5");
  System.out.println("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
  if ((num % 2) == 0){
    System.out.println("Este número es par de 5");
  }
  else {
    System.out.println("Este número no es par de 5");
  }
   if ((num % 5) == 0){
    System.out.println("Este número es divisible entre 5");
  }
  else {
    System.out.println("Este número no es divisible entre 5");
  }
}
}
