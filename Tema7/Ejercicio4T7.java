public class Ejercicio4T7{
  public static void main (String[] args){
  int i;
  int [] num = new int [20];
  int [] cuadrado = new int [20];
  int [] cubo = new int [20];
  
  for (i = 0; i < 20; i++) {
num[i] = (int)(Math.random()*101);
cuadrado[i] = num[i] * num[i];
cubo[i] = num[i] * num[i] * num[i];
}

for (i = 0; i < 20; i++) {
System.out.println("número: " + num[i] + "    " + "cuadrado: " + cuadrado[i] + "    " + "cubo: " + cubo[i]);
}
}
}

