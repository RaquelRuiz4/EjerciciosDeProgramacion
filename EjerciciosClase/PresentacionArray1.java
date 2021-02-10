public class PresentacionArray1{
  public static void main(String[] args){
    int[][] prueba = {{1,100,1000},{4,65,31},{2000,23,10200}};
    System.out.print("Introduzca tamaño array: ");
     int tam = Integer.parseInt(System.console().readLine());
    int[] arr = new int[tam];
    System.out.print("Introduzca valor min: ");
     int min = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca valor max: ");
    int max = Integer.parseInt(System.console().readLine());
    rellenaArrayUni(arr, max, min);
    presentaArray2(arr);
 //   System.out.print(digitosMaxArray(pruebaBi));
    //presentaArrayFormateado(pruebaBi);

  }
  
  public static void presentaArray2(int[] arr){
    int digMax = digMaxArray(arr);
    System.out.print("┌");
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<digMax; j++){
        System.out.print("─");
      }
      if(i == arr.length-1){
          System.out.print("┐");
      }else{
        System.out.print("┬");
      }
    }
    System.out.println();
    for(int item: arr){
      System.out.print("│");
      for(int i=0; i<digMax-cuentaDig(item); i++){
        System.out.print(" ");
      }
      System.out.print(item);
    }
    System.out.print("│");
    System.out.println();
    System.out.print("└");
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<digMax; j++){
        System.out.print("─");
      }
      if(i == arr.length-1){
        System.out.print("┘\n");
      }else{
        System.out.print("┴");
      }
    }
  }
  
  /*public static void presentaArrayFormateado(int[][] arr){
    for(int i=0; i<arr.length; i++){
      presentaArrayFormateado(arr[i]);
    }
  }*/
  
  /*public static void presentaArrayFormateado(int[][] arr){
    int digitosMax = 0;
    for(int i=0; i<arr.length; i++){
      if(digitosMax < digitosMaxArray(arr[i])) digitosMax = digitosMaxArray(arr[i]);
    }
    
  }*/
  
  
  public static void rellenaArrayUni(int[] input, int max, int min){
    if(max < min){
      int aux = max;
      max = min;
      min = aux;
    }
    for(int i=0; i<input.length; i++){
      input[i] = (int)(Math.random()* (max+1-min)+min);
    }
  }
  
  public static int digMaxArray(int[] input){
    int max = 0;
    for(int i=0; i<input.length; i++){
      if(cuentaDig(input[i]) > max){
        max = cuentaDig(input[i]);
      }
    }
    return max;
  }
  
  public static int digMaxArray(int[][] input){
    int max = 0;
    for(int i=0; i<input.length; i++){
      max = digMaxArray(input[i]);
    }
    return max;
  }
  
  public static int cuentaDig(int num){
    int count = 0;
    while(num>0){
      count++;
      num /= 10;
    }
    return count;
  }
  
}
