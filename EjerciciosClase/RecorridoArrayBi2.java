public class RecorridoArrayBi2 {
  public static void main (String[] args) {
    int[][] arrayBi;
    
    int filas, columnas;
    int valora, valorb;
    
    System.out.print("Indique número de filas: ");
    filas = Integer.parseInt(System.console().readLine());
    System.out.print("Indique número de columnas: ");
    columnas = Integer.parseInt(System.console().readLine());
    System.out.print("Indique valor 1 rango aleatorio: ");
    valora = Integer.parseInt(System.console().readLine());
    System.out.print("Indique valor 2 rango aleatorio: ");
    valorb = Integer.parseInt(System.console().readLine());
    
    arrayBi = creaArrayBi(filas,columnas,valora,valorb);
    
    presentaArray(arrayBi,"fila");
    presentaArray(arrayBi,"filab");
    presentaArray(arrayBi,"columna");
    presentaArray(arrayBi,"columnab");
  }
  
  
  public static void presentaArray (int[][] arr, String formato) {
    int [][] aux;
    switch(formato){
      case "fila":
        presentaArray(arr);
        break;
       
      case "filab":
        aux = invierteFilas(arr);
        presentaArray(aux);
        break;
       
      case "columna":
        aux = traspuesta(arr);
        presentaArray(aux);
        break;
       
      case "columnab":
        aux = traspuesta(arr);
        aux = invierteFilas(aux);
        presentaArray(aux);
        break;
    }
  }
  
  public static void presentaArray (int[][] a){
    int cols = a[0].length;
    for(int i=0; i<a.length; i++){
      for(int j=0; j<a[0].length; j++){
        System.out.printf("%4d", a[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  public static int[][] creaArrayBi (int filas, int columnas, int valorA, int valorB) {  
    int[][] pepita;
        
    if (valorA>valorB) {
      int aux;
      aux = valorB;
      valorB = valorA;
      valorA = aux;
    }
    
    pepita = new int [filas][columnas];
    for (int i=0; i<filas; i++) {
      for (int j=0; j<columnas; j++) {
        pepita[i][j] = (int) (Math.random()*(valorB-valorA+1))+valorA;
      }
    }
    
    return pepita;
  }  
  
  public static int [][] traspuesta (int [][] a) {
    int [][] resultado;
    resultado = new int[a[0].length][a.length];
    for (int i=0; i<a.length; i++) {
      for (int j=0; j<a[0].length; j++) {
        resultado[j][i] = a[i][j];
      }
    }
    return resultado;
  }
  
  public static int [][] invierteFilas (int[][] a) {
    int[][] resultado = new int[a.length][a[0].length];
    for(int i=0; i<a.length; i++){
      for(int j=0; j<a[0].length; j++){
        resultado[i][j] = a[i][Math.abs((a[0].length-1) - j)];
      }
    }
    return resultado;
  }
}
