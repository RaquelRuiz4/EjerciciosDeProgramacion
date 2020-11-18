public class PrimerEjercicio{
  public static void main (String [] args){
    int fila;
    int altura;
    
    System.out.println("Introduzca el número de altura");
    altura = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el número de fila");
    fila = Integer.parseInt(System.console().readLine());
  
  for (int i = 0; i <altura; i++){
  for (int j = 0; j <fila; j++){
  if ((i+j)%2==0){
  System.out.print("XX");
  } else {
  System.out.print("  ");
    } 
  }
  System.out.println();
}
}
}
