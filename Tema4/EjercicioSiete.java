public class EjercicioSiete{
public static void main(String[] args){ 
  System.out.println("Vamos a calcular la media de tres notas.");
  float PriNot;
  float SegNot;
  float TerNot;
 
  System.out.println("Introduce la primera nota: ");
  PriNot = Float.parseFloat(System.console().readLine());
  System.out.println("Introduce la segunda nota: ");
  SegNot = Float.parseFloat(System.console().readLine());
  System.out.println("Introduce la tercera nota: ");
  TerNot = Float.parseFloat(System.console().readLine());
   if ((PriNot >10) || (SegNot >10)|| (TerNot >10)){
  System.out.println("La nota que ha introducido es incorrecta: ");
}
 else{  float notas = (PriNot+SegNot+TerNot)/3;
    System.out.println("resultado: " + notas);
}
}
}
