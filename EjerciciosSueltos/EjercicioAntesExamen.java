public class EjercicioAntesExamen{
  public static void main(String[] args){
  
    System.out.println("Introduzca por favor el nº de filas, el nº de columna será el doble: ");
    int fila = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el nº min para rellenar la matriz bidimensional: ");
    int min = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el nº max para rellenar la matriz bidimensional: ");
    int max = Integer.parseInt(System.console().readLine());
    
    int columna = fila*2;
    int[][] arr = new int[fila][columna];
 
    for (int i = 0; i < fila; i++){
      for (int j = 0; j < columna; j++){
        arr[i][j] = (int)(Math.random()*max-min+1)+min;
        System.out.printf("%3d", arr[i][j]);
      }
    System.out.println();
    }
  }
}
    
