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
  


//----------------------------------------------------

    int num1;
    System.out.println("Introduzca un número para indicar la altura de la pirámide");
    num1 = Integer.parseInt(System.console().readLine());
        //altura
      for (int l = 0; l < num1; l++) {
        // espacio
        for(int m = 1; m<=l; m++){
          System.out.print(m);
           for(int n = num1; n<=m; n++){
              System.out.print(" ");
            }
          }
        System.out.print(l+1);
        System.out.println();
        }
      
      
// ===================================================================
   int num2;
    System.out.println("Introduzca un número para indicar la altura de la pirámide");
    num2 = Integer.parseInt(System.console().readLine());
        //altura
      for (int w = 1; w <= num2; w++) {
        // espacio
        for(int e = 0; e < w -1 ; e++){
          System.out.print(" ");
        }
        for(int t = num2; t > (num2 - w); t--){
          System.out.print(t);
        } 
        System.out.println();
      }
        
      
  }
}
 

    
