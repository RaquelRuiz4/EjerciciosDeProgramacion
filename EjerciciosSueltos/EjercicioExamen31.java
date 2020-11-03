 public class EjercicioExamen31{
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
  
  // Calcular la potencia de 10 elevado a la longitud del número menos 1
  int potencia = 1;
   for (int j = 0; j<longNum-1; j++){
      potencia = potencia*10;
  }
  for (int i = 0; i < desp; i++) { // Cuento el nº desp de una unidad
    aux = num % potencia;
    num = num / potencia;
  num = aux*10 + num;
}
    System.out.println(num);
}
}
