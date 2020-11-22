public class Serpiente{
  public static void main( String [] args){
  System.out.println("Controles: j= Abajo izquierda.  k= Abajo. l= Abajo derecha");
  System.out.println("Pulsa 's' para salir");
  int posicion = 0;
  char letra = 'a';
  while(letra != 's'){
   for(int i = 0; i < posicion; i++){
        System.out.print(" ");
      }
  System.out.print("*");
    for(int j = posicion; j < 20; j++){
      System.out.printf(" ");
    }
  System.out.print("¿j,k,l,s?: ");
  letra = System.console().readLine().charAt(0);
  switch(letra){
    case 'j':
      posicion = posicion > 0 ? posicion - 1 : posicion;
      break;
    
    case 'l':
      posicion = posicion < 10 ? posicion + 1 : posicion;
      break;
      
    case 'k':
      break;
    
    case 's':
      System.out.println();
      System.out.println("El programa ha finalizado");
      break;
      
    default:
      System.out.println("Comando no deseado");
  }
 
  }
}
}
