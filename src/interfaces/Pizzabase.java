package interfaces;
public class Pizzabase implements IPreparable{

    private String nombre;
    private double precio;
    public Pizzabase(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public void prepare(){
        System.out.println("Preparando Pizza");
        System.out.println("La pizza esta lista!");
    }
}
