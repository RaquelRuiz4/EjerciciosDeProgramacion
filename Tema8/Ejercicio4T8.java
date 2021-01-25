// potencia: Dada una base y un exponente devuelve la potencia.
 
 public class Ejercicio4T8{
  public static void main(String[] args){
    
    int base = 2; 
    int exp = 0;
    System.out.println(potencia(base, exp));
  }
  
  public static int potencia (int base, int exp){
    int resultado = base;
    if ( exp == 0){
      return 1;
    }
    for (int i = 1; i < exp; i++){
      resultado *= base;
    }
    return resultado;
  }
}
  
