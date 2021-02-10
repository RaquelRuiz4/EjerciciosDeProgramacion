public class EjercicioClasePila{
  public static void main(String[] args){
    int arr;
    int[] pila = new int[0];
    do{
      presentaMenu();
      arr = Integer.parseInt(System.console().readLine());
      if(arr != 5){
        switch(arr){
          case 1:
            int num = Integer.parseInt(System.console().readLine());
            pila = addElemento(pila,num);
          break;
          
          case 2:
            pila = eliminaItem(pila);
          break;
          
          case 3:
            consultarUltPila(pila);
          break;
          
          case 4:
            presentaPila(pila);
          break;
          default:
        }
      }else{
        System.out.print("Hasta luego");
      }
    }while(arr != 5);
  }
  
  public static void presentaMenu(){
    System.out.println("Elija una opción: ");
    System.out.println("1. Añadir dato. ");
    System.out.println("2. Eliminar dato. ");
    System.out.println("3. Consultar último pila. ");
    System.out.println("4. Presentar pila. ");
    System.out.println("5. Salir. ");
    System.out.println();
  }
  
  public static int[] addElemento(int[] input, int num){
    int[] add = new int[input.length+1];
    for(int i=0; i<input.length; i++){
      add[i] = input[i];
    }
    add[add.length-1] = num;
    return add;
  }
  
  public static int[] eliminaItem(int[] input){
    if(input.length>0){
      int[] add = new int[input.length-1];
      for(int i=0; i<input.length-1; i++){
        add[i] = input[i];
      }
      return add;
    }else{
      System.out.println("La matriz ya está vacia");
      return input;
    }
  }
  
  public static void presentaPila(int[] pila){
    if(pila.length>=1){
      for(int obj: pila) System.out.print(obj + " ");
    }else{
      System.out.println("La matriz está vacia");
    }
    System.out.println();
  }
  
  public static void consultarUltPila(int[] pila){
    if(pila.length>=1){
      System.out.print(pila[pila.length-1]);
    }else{
      System.out.println("La matriz está vacia");
    }
    System.out.println();
  }
  
}
