public class EjercicioOchoT5{
public static void main(String [] args){
  int num = 0;
  System.out.println("Tabla de multiplicar");
  for ( int i = 0; i<=10; i++){
    num = Integer.parseInt(System.console().readLine());
    System.out.println(i*num);
  }
}
}
