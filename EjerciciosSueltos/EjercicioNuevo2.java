public class EjercicioNuevo2{
public static void main(String[] args){
  System.out.println("Introduzca una frase y las veces que quiere que se ejecute");
  System.out.println("Introduzca la frase:");
  String h = System.console().readLine();
  System.out.println("Introduzca las veces que quiere que se repita");
  int num = Integer.parseInt(System.console().readLine());
  for(int i = 1; i <= num; i++) {
  System.out.println(h);
}
}
}
