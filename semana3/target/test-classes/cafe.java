

public class cafe {
    String nombre;
    String region;
    double precio;
    int cantidad;

public cafe(String nombre, String region, double precio, int cantidad) {
        this.nombre = nombre;
        this.region   = region;
        this.precio =  precio;
        this.cantidad = cantidad;


        System.out.println("Nombre: " + this.nombre);
        System.out.println("Región: " + this.region);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("-------------------------");
    }

    public double calcularprecio(){
        return this.precio * this.cantidad;
    }
 

    



    
}