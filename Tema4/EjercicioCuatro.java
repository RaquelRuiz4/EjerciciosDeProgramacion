public class EjercicioCuatro{
public static void main(String[] args){
  System.out.println("Introduzca el número de horas trabajadas en la semana");
  int horas = Integer.parseInt(System.console().readLine());
  int precio = 12;
  int precioDos = 16;
if ((horas <= 40)){
 System.out.println("Resultado: " + (horas*precio));
} 
else horas = (40 * precio) + ((horas - 40) * precioDos); {
 System.out.println("Resultado: " + horas);
} 

}
}
