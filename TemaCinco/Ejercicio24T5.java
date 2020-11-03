public class Ejercicio24T5{
   public static void main(String[] args){
    int num;
    System.out.println("Introduzca la altura de la pirámide");
    num = Integer.parseInt(System.console().readLine());
   //altura
      for (int i = 0; i <= num; i++){
   //espacio
        for (int j = num; j >= i+1; j--){
          System.out.print(" ");
        }
   //linea
          for (int k = 1; k < (i+1); k++){
          System.out.print(k);
          }
          for (int k = (i+1); k >= 1; k--){
          System.out.print(k);
          }
             System.out.println();
   }
    }
    }
