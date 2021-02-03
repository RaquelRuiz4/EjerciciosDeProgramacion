/* digitoN: Devuelve el dígito que está en la posición n de un número entero.
Se empieza contando por el 0 y de izquierda a derecha. */
import static funciones.OperacionesEnteros.voltea;
public class Ejercicio7T8{
  public static void main(String[] args){
    int prueba = 14567;

    System.out.print("Indique la posición del número que quiera: ");
    int ndigito = Integer.parseInt(System.console().readLine());
    System.out.println(devuelveDigito(prueba, ndigito));
    }
    public static int DigitoN (int num, int pos){
    num = voltea(num);
    while (pos-- > 0) {
      num = num / 10;
      }
    return (int)num % 10;
    }
  }
  
  
  
  
  
  
  
  
  
  
