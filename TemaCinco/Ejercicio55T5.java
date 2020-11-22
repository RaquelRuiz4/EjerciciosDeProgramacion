public class Ejercicio55T5{
  public static void main (String [] args){
    System.out.print("Introduzca un número: ");
    long num = Long.parseLong(System.console().readLine());
    System.out.print("Número de desplazamientos: ");
    int desp = Integer.parseInt(System.console().readLine());
    long aux = num;
    int cont = 0;
    while(aux > 0){
      cont++;
      aux /= 10;
    }
    for( int i = 0; i < desp; i++){
      int primero = (int)num % 10;
      num /= 10;
      primero *= Math.pow(10, (cont - 1));
      num += primero;
    }
    System.out.println(num);
      
  }
}
