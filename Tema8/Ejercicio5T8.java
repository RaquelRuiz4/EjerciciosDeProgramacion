public class Ejercicio5T8{
  public static void main(String[] args){
  
  int prueba = 1555;
  System.out.println(numeroDigitos(prueba));
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
