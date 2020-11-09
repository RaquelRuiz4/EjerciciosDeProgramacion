/* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as. */

public class Ejercicio3T6{
  public static void main(String [] args) {
    String palo = "";
    String carta = "";
    System.out.println("Se va a mostrar al azar el nombre de una carta de la baraja española");
    int paloCarta = (int) (Math.random()*4)+1;
    switch (paloCarta) {
        case 1:
        palo = "basto";
      break;
        case 2:
        palo = "copa";
      break;
        case 3:
        palo = "espada";
      break;
        case 4:
        palo = "oro";
      break;
      default:
    }
     int numeroCarta = (int)(Math.random()*9) + 1;
     switch(numeroCarta) {
        case 1:
        carta = "As";
        break;
        case 8:
        carta = "Sota";
        break;
        case 9:
        carta = "Caballo";
        break;
        case 10:
        carta = "Rey";
        break;
        default:
        carta = String.valueOf(numeroCarta);
      }
      System.out.println("La carta es: " + carta + " de " + palo);
    }
  }
