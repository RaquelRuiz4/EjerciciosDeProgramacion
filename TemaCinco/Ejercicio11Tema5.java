public class Ejercicio11Tema5{
  public static void main(String [] args){
    int num;
  
    System.out.println("Introduzca el número que desee calcular: ");
    num = Integer.parseInt(System.console().readLine());
    for (int i = 1; i >= 5; i++) {
    System.out.printf("%-10d  %-10d  %10d\n", num, num*num, num*num*num);
  }
}
}
