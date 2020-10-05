public class EjercicioCinco {
public static void main (String [] args) {
System.out.println( "\033[35mLunes    Martes    Miércoles    Jueves    Viernes");
System.out.println("\033[93m----------\033[32m----------\033[96m----------\033[94m----------\033[95m---------- ");
System.out.printf(" \033[94m%-8s \033[91m%-11s \033[94m%-11s \033[94m%-9s \033[91m%-10s\n", "PRO", "SINF", "PRO", "PRO", "SINF"); 
System.out.printf(" \033[94m%-8s \033[91m%-11s \033[94m%-11s \033[94m%-9s \033[91m%-10s\n", "PRO", "SINF", "PRO", "PRO", "SINF");
System.out.printf(" \033[33m%-8s \033[91m%-11s \033[33m%-11s \033[94m%-9s \033[91m%-10s\n", "BBDD", "SINF", "BBDD", "PRO", "SINF");
System.out.printf(" \033[33m%-8s \033[94m%-11s \033[92m%-11s \033[33m%-9s \033[96m%-10s\n", "BBDD", "PRO", "ED", "BBDD", "FOL");
System.out.printf(" \033[95m%-8s \033[95m%-11s \033[92m%-11s \033[33m%-9s \033[96m%-10s\n", "LM", "LM", "ED", "BBDD", "FOL");
System.out.printf(" \033[95m%-8s \033[95m%-11s \033[92m%-11s \033[33m%-9s \033[96m%-10s\n", "LM", "LM", "ED", "BBDD", "FOL");
}
}
