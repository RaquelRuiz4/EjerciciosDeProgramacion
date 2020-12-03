public class EjercicioArray{
  public static void main (String[] args){
    System.out.println("Introduzca cuantos números debe tener el Array");
    int i = 0;
    int cant = Integer.parseInt(System.console().readLine()); 
    int[] num = new int[cant];
    
    System.out.println("Introduzca el valor mínimo del Array");
     int num1 = Integer.parseInt(System.console().readLine()); 
    System.out.println("Introduzca el valor máximo del Array");
     int num2 = Integer.parseInt(System.console().readLine()); 
     
    for (i = 0; i < cant; i++){
      num[i] = (int)(Math.random()*(num2-num1+1)+num1);
      if ((i % 2 == 0) && (num[i] % 2 == 0)){
        System.out.println(num[i]);
       }
       else {
       System.out.println(num[i+1]);
       }
      }
   }
    }

