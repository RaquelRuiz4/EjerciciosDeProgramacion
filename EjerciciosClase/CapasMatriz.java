public class CapasMatriz {
  public static void main (String[] args) {
    int dim=17;
    int capas = dim/2+1;
    int [][] matriz = new int[dim][dim];
    
    for (int i=0; i<capas; i++) {
      //recorrido fila superior capa; nos movemos por columnas manteniendo la fila fija
      for (int j=i; j<dim-i; j++) {
        matriz[i][j] = capas -i;
      }      
      //recorrido fila inferior capa; nos movemos por columnas manteniendo la fila fija
      for (int j=i; j<dim-i; j++) {
        matriz[dim-1-i][j] = capas -i;
      }      
      //recorrido columna izquierda capa; nos movemos por filas manteniendo la columna fija
      for (int j=i+1; j<dim-i-1; j++) {
        matriz[j][i] = capas -i;
      }      
      
//recorrido columna derecha capa; nos movemos por filas manteniendo la columna fija
      for (int j=i+1; j<dim-i-1; j++) {
        matriz[j][dim-1-i] = capas -i;
      }
    }
    
    for (int i=0; i<dim; i++) {
      for (int j=0; j<dim; j++) {
        System.out.printf("%3d",matriz[i][j]);
      }
      System.out.println();
    }
    
  }  
}
