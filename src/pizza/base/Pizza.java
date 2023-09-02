package pizza.base;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Pizza {

    private static String name;

    //convertir el price en una funcion que me retorne el valor de la pizza en base a sis ingredientes.

    private static double price;

    private double precioTotal;
    private static List<Topping> toppings = new ArrayList<>();

    //    los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
//    un significado especial en Java.
//    Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
//    conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
//    espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
//    objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
//    lista de objetos Topping.
    public Pizza(String name, double price, Topping... toppings) {
        this.name = name;
        this.price = price;
        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }
    }

    public static void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public static double getPizzaPrice() {
double total = 0;
        for (Topping topping : toppings) {
            total = total + topping.getPrecio();
        }
        total = total + price;
        return total;
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public List<Topping> getToppings() {

        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getName() {
        return name;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\'' + ", price=" + price + ", toppings=" + toppings + '}';
    }

    public static void prepare() {
        System.out.println("Preparing..... " + name);
        System.out.println("Adding toppings:");
        double total = 0;
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre() + "   Precio: " + topping.getPrecio());

            total = total + topping.getPrecio();
            //put 1 second delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        total = total + price;
        System.out.println("The Pizza is ready!" + "\nTotal a pagar: " + total);
    }
}