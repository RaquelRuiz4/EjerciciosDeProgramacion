public class EjercicioNuevo4{
public static void main(String [] args){
  int num = 0;
  int k;
  System.out.println("Introduzca la cantidad de filas: ");
    k = Integer.parseInt(System.console().readLine());
  System.out.println("Elija el número que quiera multiplicar");
  num = Integer.parseInt(System.console().readLine());
  for ( int i = 0; i < k; i++){
    System.out.println(num + " x" +" "+ i +" "+ "=" + " " + i*num);
  }
}
}
