// potencia: Dada una base y un exponente devuelve la potencia.
 
 public class Ejercicio4T8{
  public static void main(String[] args){
    
    int base = 2; 
    int exp = 4;
    System.out.println(potencia(base, exp));
  }
  
  public static int potencia (int base, int exp){
    int resultado = base;
    for (int i = 1; i < exp; i++){
      resultado *= base;
    }
    return resultado;
  }
}
  
