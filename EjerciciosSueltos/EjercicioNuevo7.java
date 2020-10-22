public class EjercicioNuevo7{
  public static void main(String[] args){
    int num;
    int i;
    String fila = "";
  
    System.out.println("Introduzca la altura de la pirámide: ");
    num = Integer.parseInt(System.console().readLine());
    for (i = 1; i<= num; i++) {
      fila += i + " ";
      System.out.println(fila);
    }
  }
}
