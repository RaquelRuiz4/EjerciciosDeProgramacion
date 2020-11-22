public class PiramideSelector {
  public static void main(String [] args){
    char symbol1;
    char symbol2;
    int num;
    System.out.print("Introduzca la altura que desea: ");
    num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la orientación (izquierda, derecha, arriba, abajo): ");
    String direction = System.console().readLine();
    System.out.print("Introduzca el primer carácter: ");
    symbol1 = System.console().readLine().charAt(0);
    System.out.print("Introduzca el segundo carácter: ");
    symbol2 = System.console().readLine().charAt(0);
    int i = 0;
    
    switch (direction){
      case "izquierda":
        for(  i = 1; i <= num; i++){
          for(int l = 0; l < num - i; l++){
            System.out.print(" ");
          }
          for( int j = 0; j < i; j++){
            if( j % 2 == 0 ){
              System.out.print(symbol1);
            }else{
              System.out.print(symbol2);
            }
          }
          System.out.println();
        }
        for( int k = i - 2; k >= 1; k--){
          for(int l = 0; l < num - k; l++){
            System.out.print(" ");
          }
          for( int j = 0; j < k; j++){
            if( j % 2 == 0){
              System.out.print(symbol1);
            }else{
              System.out.print(symbol2);
            }
          }
          System.out.println();
        }
      break;
      
      case "derecha":
        for(  i = 1; i <= num; i++){
          for( int j = 0; j < i; j++){
            if( j % 2 == 0 ){
              System.out.print(symbol1);
            }else{
              System.out.print(symbol2);
            }
          }
          System.out.println();
        }
        for( int k = i - 2; k >= 1; k--){
          for( int j = 0; j < k; j++){
            if( j % 2 == 0){
              System.out.print(symbol1);
            }else{
              System.out.print(symbol2);
            }
          }
          System.out.println();
        }
      break;
      
      case "arriba":
        for( int l = 1; l <= num; l++){
          for( int j = 0; j < num - l; j++){
            System.out.print(" ");
          }
          for( int k = 0; k < (l * 2) - 1; k++){
            if( k % 2 == 0){
              System.out.print(symbol1);
            }else{
              System.out.print(symbol2);
            }
          }
          System.out.println();
        }
      break;
      
      case "abajo":
        for( int l = 1; l <= num; l++){
          for(int k = 1; k < l; k++){
            System.out.print(" ");
          }
          for(int j = 0; j < ((num - (l - 1 )) * 2) - 1; j++){
            if( j % 2 == 0 ){
              System.out.print(symbol1);
            }else{
              System.out.print(symbol2);
            }
          }
          System.out.println();
        }
      break;
      
      default:
    }
  }
}
