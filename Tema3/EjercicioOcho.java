public class EjercicioOcho{
public static void main(String[] args){

  System.out.println("Número de horas trabajadas: " );
  float PrecioHora = 12;
  float HorasTrabajadas = Float.parseFloat(System.console().readLine());
  System.out.println("Salario por las horas trabajadas: " + (PrecioHora*HorasTrabajadas)+"€");
}
}
  
