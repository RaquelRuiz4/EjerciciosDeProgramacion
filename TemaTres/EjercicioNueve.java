public class EjercicioNueve{
public static void main(String[] args){
double NumPi = 3.14159;
System.out.println("Introduzca el radio: ");
float R = Float.parseFloat(System.console().readLine());

System.out.println("Introduzca la altura: ");
float H = Float.parseFloat(System.console().readLine()); 

double Div = (1.0/3.0);

double resultado = Div*NumPi*(R*R)*H;
System.out.println("El volumen del cono es: " + resultado + " cm3");


}
}
