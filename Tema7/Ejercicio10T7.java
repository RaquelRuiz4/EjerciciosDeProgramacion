/* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario. */

public class Ejercicio10T7{
  public static void main(String[] args){
    int contpar = 0;
    int contimpar = 0;
    
    int[] resultado = new int [20];
    int[] apar = new int[20];
    int[] aimpar = new int[20];
    
    int random = 0;
    
    for (int i = 0; i < 20; i++){
      random = (int)(Math.random()*101);
      if (random % 2 == 0){
        apar[contpar] = random;
        contpar++;
      } else {
          aimpar[contimpar] = random;
          contimpar++;
      }
    }
    for (int j = 0; j <= contpar; j++){
      resultado[j] = apar[j];
    }
    int contador = 0;
     for (int k = contpar+1; k < contimpar+contpar; k++){
      resultado[k] = aimpar[contador];
      contador++;
    }
    for (int l = 0; l < 20; l++){
      System.out.print(resultado[l] + " ");
    }
  }
}
    
    
   
