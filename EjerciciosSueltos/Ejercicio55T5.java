public class Ejercicio55T5{
  public static void main (String [] args){
    long num;
    int desplazamientos;
    int cont = 0;
    long aux;
    System.out.print("Introduzca un número: ");
    num = Long.parseLong(System.console().readLine());
    System.out.print("Número de desplazamientos: ");
    desplazamientos = Integer.parseInt(System.console().readLine());
    aux = num;
    while(aux > 0){
      cont++;
      aux /= 10;
    }
    for( int i = 0; i < desplazamientos; i++){
      int primero = (int)num % 10;
      num /= 10;
      primero *= Math.pow(10, (cont - 1));
      num += primero;
    }
    System.out.println(num);
      
  }
}
