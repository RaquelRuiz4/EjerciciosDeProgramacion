public class EjercicioExamen3{
  public static void main(String[] args){
    int num;
    int desp;
    int longNum = 0;
    System.out.println("Introduzca el número: ");
    num = Integer.parseInt(System.console().readLine());
    
     System.out.println("Introduzca el número de posiciones que va a rotar ");
    desp = Integer.parseInt(System.console().readLine());
  // longitud del número
  int aux = num;
  while (aux > 0) {
    longNum++;
    aux = aux/10;
  }
  for (int i = 0; i < desp; i++) { // Cuento el nº desp de una unidad
    aux = num % 10;
    num = num / 10;
    for (int j = 0; j<longNum-1; j++){
      aux *= 10;
  }
  num = aux + num;
}
  System.out.println("Resultado: " + num);
}
}
