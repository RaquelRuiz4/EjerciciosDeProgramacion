/* voltea: Le da la vuelta a un número. */

public class Ejercicio6T8{
  public static void main(String[] args){ 
  int num = 12345;
  int numinvertido = voltea(num);
  System.out.println(numinvertido);
}
  public static long voltea(long x) {
  if (x < 0) {
    return -voltea(-x);
  }
  long volteado = 0;
  while(x > 0) {
    volteado = (volteado * 10) + (x % 10);
    x = x / 10;
  }
  return volteado;
  }

  public static int voltea(int x) {
    return (int)voltea((long)x);
    }
}
