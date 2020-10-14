public class EjercicioNuevo{
public static void main(String[] args){
  String NomUno;
  String NomDos;
  String NomTres;
  double PreUno;
  double PreDos;
  double PreTres;
  int CantUno;
  int CantDos;
  int CantTres;
  System.out.println("Introduzca el nombre del primer artículo");
    NomUno = System.console().readLine();
  System.out.println("Introduzca el precio del primer artículo");
     PreUno = Double.parseDouble(System.console().readLine());
  System.out.println("Introduzca la cantidad de artículos");
     CantUno = Integer.parseInt(System.console().readLine());

  System.out.println("Introduzca el nombre del segundo artículo");
    NomDos = System.console().readLine();
  System.out.println("Introduzca el precio del segundo artículo");
     PreDos = Double.parseDouble(System.console().readLine());
  System.out.println("Introduzca la cantidad de artículos");
     CantDos = Integer.parseInt(System.console().readLine());
     
       System.out.println("Introduzca el nombre del tercer artículo");
    NomTres = System.console().readLine();
  System.out.println("Introduzca el precio del tercer artículo");
     PreTres = Double.parseDouble(System.console().readLine());
  System.out.println("Introduzca la cantidad de artículos");
     CantTres = Integer.parseInt(System.console().readLine());

  
 System.out.println("El precio es: " + (PreUno*CantUno + PreDos*CantDos + PreTres*CantTres) + "Euros");
}
}
