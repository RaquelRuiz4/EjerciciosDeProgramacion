public class EjercicioNuevo3{
  public static void main(String[] args){
    System.out.println("Introduzca dos números y se realizará una suma");
  
    for(int i = 1; i <= 10; i++) {
      System.out.println("Introduzca el primer número: ");
      int num1 = Integer.parseInt(System.console().readLine());
      System.out.println("Intruduzca el segundo número: ");
      int num2 = Integer.parseInt(System.console().readLine());
      System.out.println(num1 + " " + "+" + " " + num2 + " " + "=" + " " +(num1+num2));
    }
  }
}
