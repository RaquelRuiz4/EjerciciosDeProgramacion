public class EjercicioNuevo6{
public static void main(String[] args){

int num1;
int media = 0;
String num = "";
for (int i = 10; i >= 1; i--){
  System.out.println("Introduzca"+ " " + i + " " + "números y se hará la media de ellos");
  num1 = Integer.parseInt(System.console().readLine());
  media += num1;
  num += num1 + " - ";
}
System.out.println ("La media de los números es: " + media/10);
System.out.println(num);
}
}
