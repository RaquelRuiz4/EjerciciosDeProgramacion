public class pruebaElementoArray{
  public static void main(String[] args){
    int[] arr = {1,2,3,4};
    for(int item: arr) System.out.print(item + " ");
    System.out.println();
    arr = addObj(arr, 5);
    System.out.println("Array más el elemento");
    for(int obj: arr) System.out.print(obj + " ");
  } 
  
  public static int[] addObj(int[] input, int num){
    int[] result = new int[input.length+1];
    for(int i=0; i<input.length; i++){
      result[i] = input[i];
    }
    result[result.length-1] = num;
    return result;
  }
}
