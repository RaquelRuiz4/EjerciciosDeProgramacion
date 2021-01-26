public class Ejercicio5T8{
  public static void main(String[] args){
  
  int prueba = 1222;
  System.out.println(numeroDigitos(num));
  }
  
  
  public static int numeroDigitos (int num){
  int cont = 0;
  
  while (num > 0){
    num /= 10;
    cont ++;
  }
  return cont;
  
}
  
  }
