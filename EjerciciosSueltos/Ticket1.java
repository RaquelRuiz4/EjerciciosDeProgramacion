public class Ticket1{
  public static void main(String[] args){
  int unidades;
  double precio;
  String descuento = ""; 
  double IVA = 1.21; 
  double descuentoAplicado = 0;
  boolean noCodigo = false;
  String fallo = "";
  System.out.println("¿Cuál es el precio del artículo?");
  precio = Double.parseDouble(System.console().readLine());
  System.out.println("¿Cuántas unidades lleva?");
  unidades = Integer.parseInt(System.console().readLine());
  System.out.println("¿Cuál es el código de descuento?");
  descuento = System.console().readLine();
    switch (descuento){
      case "685":  // Llevan comillas porque son Strings
        descuentoAplicado = 15;
      break;
      case "778":
        if (unidades >= 20) {
          descuentoAplicado = (20 * precio) * 0.05;
        }         else {
        descuentoAplicado = (unidades * precio) * 0.05;
        }
      break;
      case "219":
          if (unidades > 5) {
            descuentoAplicado = precio * 5;
          }
      break;
      default: 
      noCodigo = true;
        }
        if (noCodigo == true){
          fallo = "Código no válido";
          descuento = "";
        }
        System.out.println("A continuación se le muestra el desglose del pedido: ");
        System.out.print("-----------------------------------------------------------\n");
        System.out.printf("%-10s  %35.2f\n", "Precio del artículo: ", precio);
        System.out.printf("%-10s  %33d\n", "Número de unidades: ", unidades);
        System.out.printf("%-10s  %35.2f\n", "Precio total unidades", precio*unidades );
        System.out.printf("%-10s  %1s %-10s %18.2f\n", "Descuento aplicado:", descuento, fallo, descuentoAplicado);
        System.out.printf("%-10s  %35.2f\n", "Precio con descuento:", (precio*unidades)-descuentoAplicado);
        System.out.printf("%-10s  %46.2f\n", "IVA (21%)", (unidades*precio)*0.21);
        System.out.printf("-----------------------------------------------------------\n"); 
        System.out.printf("%-10s  %43.2f\n", "PRECIO FINAL:", (double)((unidades*precio)-descuentoAplicado)*IVA);
  }
  }
