// piramide completa.

public class PiramideAlReves{
  public static void main(String[] args){
  
  int num;
  String symbol = "";
  System.out.println("Introduzca la altura de la pirámide: ");
  num = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el símbolo para construir la pirámide: ");
  symbol = System.console().readLine();
  
  // altura 
  for (int i = num; i >= 1; i--){
  // espacio
  for (int j = num; j >= i+1; j--){
    System.out.print(" ");
  }
  //linea 
  for (int k = 1; k <= (i*2)-1; k++){
    System.out.print(symbol);
}
System.out.println();
  }
  }
  }
