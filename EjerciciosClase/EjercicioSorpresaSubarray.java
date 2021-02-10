public class EjercicioSorpresaSubarray{
  public static void main(String [] args){
    System.out.print("Introduzca la coordenada Y:");
    int coory = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la coordenada X:");
    int coorx = Integer.parseInt(System.console().readLine());
    int[][] arr = rellenaYCreaArray(5,5,10,20);
    System.out.print("Matriz de origen: \n");
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    int[] result = repetidosSubarray(arr, coorx, coory);
    System.out.print("\nResultado: \n");
    for(int i=0; i<result.length; i++) System.out.print(result[i] + " ");
  }
  
  public static int[] repetidosSubarray(int[][] x, int coordx, int coordy){
    int counter = 0;
    boolean check = false;
    int[] unidadesEnBlanco = new int[x.length*x[0].length];
    for(int i=0; i<x.length; i++){
      for(int j=0; j<x[0].length; j++){
        check = false;
        if((i < coordy && j>coordx) || (i>coordy)){
          for(int p=0; p<unidadesEnBlanco.length; p++){
            if(x[i][j] == unidadesEnBlanco[p]) check = true;
          }
          if(!check) unidadesEnBlanco[counter++] = x[i][j]; 
        }
      }
    }
    //Check si está en el array original
    int[] aux = new int[counter];
    int counterB = 0;
    for(int i=0; i<=coordy; i++){
      for(int j=0; j<=coordx; j++){
        for(int u=0 ;u<unidadesEnBlanco.length; u++){
          if(unidadesEnBlanco[u] == x[i][j]){
            aux[counterB++] = x[i][j];
            unidadesEnBlanco[u] = Integer.MIN_VALUE;
          }
        }
      }
    }
    int[] result = new int[counterB];
    for(int i=0; i<counterB; i++){
      result[i] = aux[i];
    }
    return result;
  }
  
  public static int[][] rellenaYCreaArray(int filas, int columnas,
    int valora, int valorb){
      int[][] result;
        
      if(valora>valorb) {
        int aux;
        aux = valorb;
        valorb = valora;
        valora = aux;
      }
    
      result = new int [filas][columnas];
      for (int i=0; i<filas; i++) {
        for (int j=0; j<columnas; j++) {
          result[i][j] = (int) (Math.random()*(valorb-valora+1))+valora;
        }
      }
      return result;
    }  
}
