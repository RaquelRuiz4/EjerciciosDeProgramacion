/* El programa va a manejar un array unidimensional. Simulará lo que está gestionando es un
array bidimensional. Pedirá al usuario el nº de filas y el nº de columnas. 
Generará aleatoriamente los valores entre 1 y 100.
Presentará la matriz en formando unidimensional y tmbn en formato bidimensional */ 

public class EjercicioArrayNew{
  public static void main(String[] args){
  
  System.out.println("Introduzca el nº de filas: ");
  int filas = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el nº de columnas: ");
  int columnas = Integer.parseInt(System.console().readLine());
  int [] array = new int [filas*columnas];
    
    System.out.print("Array unidimensional: ");
    for (int i = 0; i < filas; i++){
      array[i] = (int)(Math.random()*100);
      System.out.print(array[i] + " ");
    }
    System.out.println();
    System.out.print("Array bidimensional: ");
    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++){
         System.out.print(array[i*columnas+j] + " ");
      }
    }
  }
}
   //  array2[i*columnas+j] i = k/columnas      j = k%columnas 
