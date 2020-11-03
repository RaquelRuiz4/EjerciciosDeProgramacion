public class EjercicioPiramide2{
  public static void main(String[] args){
  
  int num;
  String symbol = "";
  System.out.println("Introduzca la altura de la pirámide: ");
  num = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el símbolo para construir la pirámide: ");
  symbol = System.console().readLine();
  
    // altura 
  for (int i = 0; i <= num; i++){
  // espacio
  for (int j = num; j >= i+1; j--){
    System.out.print(" ");
  }
  //linea 
  for (int k = 1; k <= (i*2)-1; k++){

  if ( num == i) {
    System.out.print(symbol);
    }
    else {
    if ((k == 1) || ( k == (i*2)-1)) {
    System.out.print(symbol);
    } 
    else {
    System.out.print(" ");
    }
    }
  }
System.out.println();
  }
  }
  }
