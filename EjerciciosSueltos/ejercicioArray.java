public class EjercicioArray{
  public static void main (String[] args){
  int matriz[][] = new int[5][5];
  for (int x=0; x < matriz.length; x++) {
  for (int y=0; y < matriz[x].length; y++) {
    matriz[x][y] = (int) (Math.random()*9+1);
  }
}
}
}
