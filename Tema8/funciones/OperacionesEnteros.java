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
  
   public static int potencia (int base, int exp){
    int resultado = base;
    for (int i = 1; i < exp; i++){
      resultado *= base;
    }
    return resultado;
  }
  
  
   public static int devuelveDigito (int num, int pos){
    num = voltea(num);
    while (pos-- > 0) {
      num = num / 10;
      }
    return (int)num % 10;
    }
  
  
  
  
  
  
  
  
  
}

 


