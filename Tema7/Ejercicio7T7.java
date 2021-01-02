/* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados. */

public class Ejercicio7T7{
  public static void main(String[] args){
  
    int[] array = new int [100];
    int i = 0;
    for(i = 0; i < 100; i++){
      array[i] = (int)(Math.random()*21);
    }
    System.out.println("Introduzca un valor: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca un valor para ser cambiado: ");
    int num1 = Integer.parseInt(System.console().readLine());
    for (int j = 0; j < 100; j++){
      if (array[j] == num){
        array[j] = num1;
        System.out.print("'" + array[j]+ "' ");
      } else {
        System.out.print(array[j] + " ");
      }
    }
  }
}
