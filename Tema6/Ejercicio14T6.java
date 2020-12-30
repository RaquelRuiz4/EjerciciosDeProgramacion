/* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir. */

public class Ejercicio14T6{
  public static void main(String[] args){
<<<<<<< HEAD
=======
    int num;
    int oportunidades = 5;
    System.out.println("Introduzca un número pensado entre el 0 y el 100");
    int numPensado = Integer.parseInt(System.console().readLine());
    String respuesta = " ";

   do{
      num = (int)(Math.random()*101);
      System.out.println("Quedan " + oportunidades + " oportunidades");
      System.out.println(num);
      if (oportunidades != 1){
      System.out.println("¿Es el número que he dicho mayor o menor?");
      respuesta = System.console().readLine();
    }
      oportunidades--;
    }
    
    while ((numPensado != num) && (oportunidades != 0));
   if ((numPensado != num)) {
    System.out.println("¡Ya no quedan más oportunidades!");
  } else {
        System.out.println("¡He acertado!");
    }
  
}
}
>>>>>>> fe6a86952cc70995e05054cd4d21cd89681715b9
  
  int i = 5;
  System.out.println("Introduzca el número en el que está pensando (entre 0 y 100)");
  System.out.println("Tiene " + i + " oportunidades");
  int numPensado = Integer.parseInt(System.console().readLine());
  
  for (i = 5; i > 0; i--){
    int num = (int)(Math.random()*101);
    System.out.println(num);
  }
    
  
  
  
  
  
  
  
  
  
  }
}
