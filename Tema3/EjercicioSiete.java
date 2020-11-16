public class EjercicioSiete {
public static void main(String[] args){
    System.out.println("Precio1: ");
   float raton = Integer.parseInt(System.console().readLine());
  System.out.println("Precio2: ");
   float teclado = Integer.parseInt(System.console().readLine());
  
  System.out.println("Precio3: ");
   float pantalla = Integer.parseInt(System.console().readLine());
   double iva = 1.21;
  System.out.println("Objeto    Precio");
  System.out.println("-----------------");
  System.out.printf("%-10s %-10.2f\n", "Ratón", raton);
  System.out.printf("%-10s %-10.2f\n", "Teclado", teclado);
  System.out.printf("%-10s %-10.2f\n", "Pantalla", pantalla); 
  System.out.println("-----------------");
  
  System.out.printf("%-10s %-10.2f\n","BI", (raton+teclado+pantalla));
  System.out.printf("%-10s %-10.2f\n","Total", (raton+teclado+pantalla)*iva);
  




}
}
