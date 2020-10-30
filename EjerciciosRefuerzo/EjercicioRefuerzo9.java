public class EjercicioRefuerzo9{
  public static void main(String[] args){
    int num;
    int contador = 0;
    do {
      System.out.println("Intruduzca un número para saber su cuadrado, introduzca 0 para salir");
      num = Integer.parseInt(System.console().readLine()); 
      contador++; 
        if (num == 0){
           System.out.println("¡Gracias! ");
           }
    else {
          System.out.println("El cuadrado de " + num + " "+ "es" + " " + (num*num));
        }
    }
    while ((contador < 4) && (num != 0));
    }
    }
