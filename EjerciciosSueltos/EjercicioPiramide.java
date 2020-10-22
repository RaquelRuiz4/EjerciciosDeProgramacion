/* A partir de un número introducido por teclado (ej:5)
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5 */

public class EjercicioPiramide{
public static void main(String[] args){
  
  int alt;
  int num;
  System.out.print("Introduzca la altura de la pirámide: ");
    alt = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el carácter de relleno: ");
    num = Integer.parseInt(System.console().readLine());
    int planta = 1;
int longitudDeLinea = 1;
int espacios = alt-1;
while (planta <= alt) {

for (int i = 1; i <= espacios; i++) {
System.out.print(" ");
}

for (int i = 1; i <= longitudDeLinea; i++) {
System.out.print(num);
}
System.out.println();
planta++;
espacios--;
longitudDeLinea += 2;
}

  }
}
