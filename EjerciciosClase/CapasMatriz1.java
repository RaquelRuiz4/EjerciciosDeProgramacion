public class CapasMatriz1 {
  public static void main (String[] args) {
    int dim=17;
    int capas = dim/2+1;
    int [][] matriz = new int[dim][dim];

    for (int k=0; k<capas; k++) {
      for (int i=k; i<dim-k; i++) {
        for (int j=k; j<dim-k; j++) {
          matriz [i][j] = capas-k;
        }
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
