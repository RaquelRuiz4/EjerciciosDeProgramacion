public class EjercicioNuevo6{
public static void main(String[] args){

double num1;
double media = 0;
String num = "";
for (int i = 10; i >= 1; i--){
  System.out.println("Introduzca"+ " " + i + " " + "números y se hará la media de ellos");
  num1 = Double.parseDouble(System.console().readLine());
  media += num1;
  num += num1 + " - ";
}
System.out.println ("La media de los números es: " + media/10);
System.out.println(num);
}
}
