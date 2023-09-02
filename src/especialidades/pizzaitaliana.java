package especialidades;
import pizza.base.*;
public class pizzaitaliana extends Pizza{
    private String salsa;
    public pizzaitaliana(String nombre, double precio, String salsa, Topping... toppings) {
        super(nombre,precio,toppings);
        this.salsa = salsa;
    }
    public String getSalsa() {
        return salsa;
    }
    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }



}