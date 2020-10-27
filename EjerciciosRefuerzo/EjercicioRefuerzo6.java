public class EjercicioRefuerzo6{
  public static void main(String[] args){
  
    int num;

    System.out.println("Introduzca un número que indicara la altura de la pirámide");
    num = Integer.parseInt(System.console().readLine());
  
    for (int i = 0; i < num; i++){
  
      for (int j = 1; j<=i; j++){
        System.out.print(" ");
      }
      System.out.print(i+1);
      System.out.println();
    }
  }
}
    
