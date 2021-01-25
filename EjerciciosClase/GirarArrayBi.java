/* Dada una matriz, preséntese por filas y columnas, hacia adelante y hacia atrás.
El programa ha de rellenar la matriz con valores aleatorios igualmente probables entre 2
valores introducidos por el usuario. ambos incluidos. */

//        -- CORREGIR, ALGO FALLA --   -- CORREGIR, ALGO FALLA --

public class GirarArrayBi{
  public static void main(String[] args){
    int[][] matrizBi;
    
    int filas, columnas;
    int valorA, valorB;
    System.out.print("Programa que rellena aleatoriamente una matriz y la muestra de diversas formas.");
    System.out.println();
    System.out.println();
    System.out.print("Indique el nº de filas: ");
    filas = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el nº de columnas: ");
    columnas = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el valor A: ");
    valorA = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el valor B: ");
    valorB = Integer.parseInt(System.console().readLine());
    
    matrizBi = creaArrayBiRelleno(filas, columnas, valorA, valorB);
    
    presentaArray(matrizBi, "fila");
    System.out.println();
    presentaArray(matrizBi, "filainvertida");
    System.out.println();
    presentaArray(matrizBi, "columna");
    System.out.println();
    presentaArray(matrizBi, "columainvertida"); 
    System.out.println();   
}
  
    public static void presentaArray(int[][] input, String formato){
      
      switch(formato){  
      case "fila":
        presentaArrayPorFilas(input, false);
        break;
        
      case "filainvertida":
       presentaArrayPorFilas(input, true);
        break;
        
      case "columna":
        presentaArrayPorColumnas(input, false);
        break;
        
      case "columnainvertida":
        presentaArrayPorColumnas(input, true);
        break;
      }
    }
  public static void presentaArrayPorFilas(int[][] a, boolean invertida){
   int cols = a[0].length;
    for(int i=0; i<a.length; i++){
      for(int j=0; j<a[0].length; j++){
        if(invertida){
          System.out.printf("%4d", a[i][cols-1-j]);
        }else{
          System.out.printf("%4d", a[i][j]);
        }
      }
      System.out.println();
    }
  }
  
 public static void presentaArrayPorColumnas(int[][] a, boolean invertida){
     int fils = a[0].length;
    for(int i=0; i<a[0].length; i++){
      for(int j=0; j<a.length; j++){
        if(invertida){
          System.out.printf("%4d", a[fils-1-j][i]);
        }else{
          System.out.printf("%4d", a[j][i]);
        }
      }
      System.out.println();
    }
  }




  public static int[][] creaArrayBiRelleno (int filas, int columnas, int valorA, int valorB){
    
    if (valorA>valorB){
      int aux;
      aux = valorB;
      valorB = valorA;
      valorA = aux;
    }
    
    int[][] arr = new int [filas][columnas];
      for (int i = 0; i < filas; i++){
        for (int j = 0; i < columnas; j++){
      arr[i][j] = (int)(Math.random()*(valorB-valorA+1))+valorA;
        }
      }
    return arr;
  }
}
