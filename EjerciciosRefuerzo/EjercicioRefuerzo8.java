public class EjercicioRefuerzo8{
  public static void main(String[] args){
    int num;
    
    do {
      System.out.println("Intruduzca un número para saber su cuadrado, introduzca 0 para salir");
      num = Integer.parseInt(System.console().readLine());  
        if (num == 0){
           System.out.println("¡Gracias! ");
           }
    else {
          System.out.println("El cuadrado de " + num + " "+ "es" + " " + (num*num));
        }
    }
    while (num > 0);
    }
    }
