public class EjercicioTreceT5{
public static void main(String[] args){

int negativ = 0;
int positiv = 0;
int num = 0;
  System.out.println("Introduzca 10 números (negativos o positivos) y se separarán unos de otros");
  for (int i = 10; i > 1; i++) {
  if (Integer.parseInt(System.console().readLine()) < 0) {
  negativ++;
  }
  else {
  positiv++;
  }
  System.out.println("Ha introducido: " + " " + negativ + " " + "negativos y " + " " + positiv + " " + "positivos");
  }
  }
}
