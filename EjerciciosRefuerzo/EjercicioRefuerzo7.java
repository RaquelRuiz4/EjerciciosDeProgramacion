public class EjercicioRefuerzo7{
  public static void main(String [] args){
  int num;
  System.out.println("Introduzca la altura de la pirámide");
  num = Integer.parseInt(System.console().readLine());
    for (int i = 0; i <= num; i++) {
      for (int j= 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
      
// ====================================================================

  int num2;
  System.out.println("Introduzca la altura de la pirámide");
  num2 = Integer.parseInt(System.console().readLine());
  for (int z = 0; z < num2; z++){
    for (int j = num2; j >= (num2 -z); j--){
      System.out.print(num2-z);
    }
    System.out.println();
  }

 // ==========================================================
  int num1;
  System.out.println("Introduzca la altura de la pirámide");
  num1 = Integer.parseInt(System.console().readLine());
  for(int m = 0; m <= num1; m++){
    for(int n = 1; n <= m; n++) {
      System.out.print(n);
    }
    System.out.println();
  }
}
}
