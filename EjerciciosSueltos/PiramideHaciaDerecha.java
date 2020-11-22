// Pirámide de lado
/*     *                
      ***                 
     *****
    *******
    
    
    *
    **
    ***
    ****
    ***
    **
    *                   
*/

public class PiramideHaciaDerecha{
  public static void main(String [] args){
  int num;
  String symbol = "";
  String symbol2 = "";
  System.out.print("Introduzca la altura: ");
  num = Integer.parseInt(System.console().readLine());
   System.out.print("Introduzca el símbolo: ");
  symbol = System.console().readLine();
  symbol2 = System.console().readLine();
  
  // altura
  for (int i = num; i >= 0; i--){
  // espacio
  for (int j = num; j >= i; j--){
    System.out.print(" ");
  }
  // linea
  for (int k = 1; k<= (i*2)-1; k++){
  if( k % 2 == 0 ){
          System.out.print(symbol);
        }else{
          System.out.print(symbol2);
        }
}

System.out.println();
}
  //altura
  
  // espacio
  
  // linea 
  }
  }
