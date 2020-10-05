public class EjercicioSeis{
public static void main(String[] args){

double plato = 60;
double vaso = 40;
double IVA = 1.21;
double sum = plato + vaso;

System.out.println("Objeto     Precio");
System.out.println("-----------------");
System.out.printf("%-10s   %-10d\n", "Vaso", 40);
System.out.printf("%-10s   %-10d\n", "Plato", 60);
System.out.println("-----------------");
System.out.printf("%-10s  %-10.2f\n", "BI", sum);
System.out.printf("%-10s  %-10.2f\n", "BI + IVA", 100*1.21);
}
}
