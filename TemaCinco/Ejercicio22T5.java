public class Ejercicio22T5{
  public static void main(String[] args){
    System.out.println("Números primos entre 2 y 100");
    boolean primo = true;
    for(int i = 2; i <= 100; i++){
      //comprueba si es primo
        primo = true;
        for(int j = 2; j < i; j++){
          if ( i % j == 0){
            primo = false;
          }
        }
        if (primo){
          System.out.println(i);
        }
      }
      System.out.println();
    }
  }

