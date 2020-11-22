public class hola{
  public static void main(String[] args){
  
  int filas;
  int columnas;
  String bloques = "██";
  System.out.println("Introduzca el número de filas y columnas para crear un tablero de ajedrez: ");
  System.out.print("Introduzca el número de filas: ");
  filas = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el número de columnas: ");
  columnas = Integer.parseInt(System.console().readLine());
    // columnas
  for (int i = 0; i < columnas; i++){
    System.out.println(bloques);
    
    // espacios
    for(int j = filas; j < i; j++){
    System.out.println("  ");
    }
    // filas 
        for (int k = 0; k <= filas*2; k++){
          if( k % 2 == 0 ){
            System.out.println(bloques);
          }else{
            System.out.print("  ");
          } 
          for (int t = filas; t >= i-1; t--)
           if( k % 2 == 0 ){
            System.out.println("  ");
          }else{
            System.out.print(bloques);
          } 
        }
      }
     System.out.println();
    }
  }

