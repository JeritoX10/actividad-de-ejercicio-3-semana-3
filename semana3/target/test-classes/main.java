import actividad.de.ejercicio3.semana3.cafe;
    

public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      
        cafe1 = new cafe1();
        cafe1.nombre = "cafetainali";
        cafe1.region   = "santander";
        cafe1.precio =  100;
        cafe1.cantidad = 12;

        cafe2 = new cafe2();
        cafe2.nombre = "cafearoma";
        cafe2.region   = "bogota";
        cafe2.precio =  20000;
        cafe2.cantidad = 10;

        cafe3 = new cafe3();
        cafe3.nombre = "caferitadisima";
        cafe3.region   = "antioquia";
        cafe3.precio =  3000;
        cafe3.cantidad = 25;
   }

   public void actualizarcantidad(int cantidad) {
        cafe1.cantidad = 15;
        cafe2.cantidad = 20;
        cafe3.cantidad = 30;

        System.out.println("Cantidad actualizada:");
        System.out.println("Cafe1: " + cafe1.cantidad);
        System.out.println("Cafe2: " + cafe2.cantidad);
        System.out.println("Cafe3: " + cafe3.cantidad);
   }
}


