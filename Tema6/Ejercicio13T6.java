/* Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor. */
public class Ejercicio13T6{
  public static void main(String[] args){
  int dado1;
  int dado2;
  
  do{
  dado1 = (int)(Math.random()*6)+1;
  dado2 = (int)(Math.random()*6)+1;
  System.out.println("Primer dado: " + dado1 + "    Segundo dado: " + dado2);
    }

  while (!(dado1 == dado2));
  System.out.println("Los dados han coincidido.");
}
}
