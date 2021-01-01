/* Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array. */

public class Ejercicio6T7variacion{
  public static void main(String[] args){
    int i;
    int [] array = new int [15];
    System.out.println("Introduzca 15 números: ");
    for (i = 0; i <= 14; i++){
      array[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println();
    for (int j = 0; j < 2; j++){
    // aux para guardar la últ y for para cambiar las posiciones del array
    int aux = array[14];
    System.out.println("aux: " + aux);
    for (i = 14; i > 0; i--){
      array[i] = array[i-1];
    }
  
    array[0] = aux;
  }
    // for para printear 
    for (i = 0; i < 15; i++){
      System.out.print(array[i] + " ");
    
    }
  }
}

