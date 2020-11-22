public class Piramide2simbolos{
  public static void main(String [] args){
  int num;
  System.out.print("Introduzca la altura: ");
  num = Integer.parseInt(System.console().readLine());
   System.out.print("Introduzca el símbolo: ");
  symbol = System.console().readLine();
  symbol2 = System.console().readLine();
  
  // altura
  for (int i = 0; i <= num; i++){
  // espacio
  for (int j = 0; j <= num*2; j++){
    System.out.print(" ");
  }
  // linea
  for (int k = 1; k<= (i*2); k++){
  if( k % 2 == 0 ){
          System.out.print("██");
        }else{
          System.out.print("  ");
        }
}

System.out.println();
}
}
}
