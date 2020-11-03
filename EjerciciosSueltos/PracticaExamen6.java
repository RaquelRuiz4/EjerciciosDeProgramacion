public class PracticaExamen6{
   public static void main(String[] args){
    long num;
    int par = 0;
    int impar = 0;
    System.out.println("Introduzca un número por teclado y dirá qué digito es par y cual impar");
    num = Long.parseLong(System.console().readLine());
    while (num > 0) {
      if (((num % 10)% 2 == 0)){
        par++;
      }
        else {
          impar++;
        }
      num /= 10;
    }
    System.out.println("El número tiene" + " " + par + " " + "dígitos pares y" + " " + impar + " " + "dígitos impares"); 
  }
}
