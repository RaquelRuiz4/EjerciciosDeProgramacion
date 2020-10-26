public class EjercicioRefuerzo5{
  public static void main (String [] args){
    int num;
    System.out.print("Introduzca la cantidad de filas por teclado: ");
    num = Integer.parseInt(System.console().readLine());
  // Columnas
    for (int i = num; i >= 1; i--){ 
    //filas
      for (int j = 1; j <= i; j++) { 
        System.out.print("*");
      }
        System.out.println();
    }
  }
}


