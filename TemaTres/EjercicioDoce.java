public class EjercicioDoce{
public static void main(String[] args){
  System.out.println("Introduzca la nota del primer examen: ");
  float PriExa = Float.parseFloat(System.console().readLine());

  System.out.println("Introduzca la nota del segundo examen: ");
   float FinExa = Float.parseFloat(System.console().readLine());
   double SegExa = ((FinExa*100) - (PriExa*40))/60;
  System.out.println("Para tener un " + FinExa + " en el trimestre necesitas sacar un " + SegExa + " en el segundo examen.");
}
}
