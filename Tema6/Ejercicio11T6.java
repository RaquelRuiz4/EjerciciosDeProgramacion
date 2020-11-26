public class Ejercicio11T6{
  public static void main(String[] args){
  int suspensos = 0;
  int bienes = 0;
  int suficientes = 0;
  int notables = 0;
  int sobresalientes = 0;
  int notas;
  
  for(int i = 0; i < 20; i++){
     notas = (int)(Math.random()*5);
  switch (notas){
  case 1:
    System.out.print("Suspensos ");
    suspensos++;
  break;
  case 2:
   System.out.print("Suficientes ");
   suficientes++;
  break;
  case 3:
   System.out.print("Bienes ");
   bienes++;
  break;
  case 4:
   System.out.print("Notables ");
   notables++;
  break;
  case 5:
   System.out.print("Sobresalientes ");
   sobresalientes++;
  break;
  default:
        }
      }
      System.out.println();
        System.out.println("Número de suspensos: " + suspensos);
        System.out.println("Número de suficientes: " + suficientes);
        System.out.println("Número de bienes: " + bienes);
        System.out.println("Número de notables: " + notables);
        System.out.println("Número de sobresalientes: " + sobresalientes);
    }
  }

