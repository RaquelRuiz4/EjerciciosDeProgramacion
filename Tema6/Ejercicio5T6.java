/*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números
 
 @Raquel Ruiz Pérez   */
 
public class Ejercicio5T6{
  public static void main(String [] args) {
  int numeros = 0;
  int max = 199;
  int min = 100;
  int n = 0;
  for (int i = 0; i < 50; i++){
    numeros = (int)(Math.random()*(max-min+1) + min);
    
    System.out.print(numeros + " ");
    numeros += n;
    if (n < min) {
      min = n;
    }
    if (n > max) {
      max = n;
    
    }
  }
  System.out.println("Mínimo: " + min);
   System.out.println("Máximo: " + max);
    System.out.println("Media: " + numeros / 50);
  }
}


