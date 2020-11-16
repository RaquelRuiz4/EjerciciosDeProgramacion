public class EjercicioOcho{
public static void main(String[] args){ 
  System.out.println("Vamos a calcular la media de tres notas.");
  float PriNot;
  float SegNot;
  float TerNot;
  float notas = 0;
  System.out.println("Introduce la primera nota: ");
  PriNot = Float.parseFloat(System.console().readLine());
  System.out.println("Introduce la segunda nota: ");
  SegNot = Float.parseFloat(System.console().readLine());
  System.out.println("Introduce la tercera nota: ");
  TerNot = Float.parseFloat(System.console().readLine());
   if ((PriNot >10) || (SegNot >10)|| (TerNot >10)){
  System.out.println("La nota que ha introducido es incorrecta: ");
}
 else{ notas = (PriNot+SegNot+TerNot)/3;
    System.out.println("resultado: " + notas);
}
if ((notas < 5)){
  System.out.println("Insuficiente");
}
if ((notas >= 5) && (notas < 6)){
  System.out.println("Suficiente");
}
if ((notas >= 6) && (notas < 7)) {
  System.out.println("Bien");
}
  if ((notas >= 7) && (notas < 8)) {
  System.out.println("Notable");
}
  if ((notas >= 9) && (notas <= 10)) {
  System.out.println("Sobresaliente");
}
}
}
