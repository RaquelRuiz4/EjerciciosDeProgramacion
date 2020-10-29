public class EjercicioRefuerzo7{
  public static void main(String[] args){
  
  int num ;
  System.out.println("Introduzca un número para determinar la altura de la pirámide");
  num = Integer.parseInt(System.console().readLine());
  //altura
    for (int i = 1; i <= num; i++){
  // espacios
      for(int j = num; j >= i+1; j--){
        System.out.print(" ");
        }
  // lineas 
        for (int k = 1; k <= i; k++){
          System.out.print(k);
      
        } 
      System.out.println();
      }
  
  
// ==============================================================

 int num1;
  System.out.println("Introduzca un número para determinar la altura de la pirámide");
  num1 = Integer.parseInt(System.console().readLine());
    //altura
    for (int m = 1; m <= num1; m++){
    //espacio
      for (int n = num1; n >= m+1; n--){
        System.out.print(" ");
      }
    //linea 
        for ( int b = num1; b > num1-m; b--){
          System.out.print(m);
  }
  System.out.println();
  }
  
  //===============================================================
  int num2;
  System.out.println("Introduzca un número para determinar la altura de la pirámide");
  num2 = Integer.parseInt(System.console().readLine());
  // altura 
  for (int z = 0; z < num2; z++){
  // espacios
    for (int x = num2; x >= z+2; x--){
      System.out.print(" ");
    }
  // lineas
  for (int c = num2; c >= num2-z; c--){
    
    System.out.print(num2-z);
  }
  System.out.println();
}
}
}
