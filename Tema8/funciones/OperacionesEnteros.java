package funciones;

public class OperacionesEnteros{
 
  public static int voltea(int num){
    int numvuelta = 0;
   while (num > 0) {
     numvuelta = (numvuelta*10) + num % 10;
     num /= 10;
   }
   return numvuelta;
  }
  
  public static boolean capicua(int num){
    if (num == voltea(num)){
      return true;
   }else {
      return false;
    }
  }
  
  public static boolean esPrimo (int num){
    boolean respuesta = true;
    for (int i = 2; i < num; i++){
      if (num % i == 0){
        respuesta = false;
      } 
    }
    return respuesta;
  }
}

 


