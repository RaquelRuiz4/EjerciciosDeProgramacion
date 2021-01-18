package funciones;

public class Ejercicio6T8{
 
  public static int voltea(int num){
    int numvuelta = 0;
   while (num > 0) {
     numvuelta = (numvuelta*10) + num % 10;
     num /= 10;
   }
   return numvuelta;
  }
}
