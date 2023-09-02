import especialidades.pizzaitaliana;
import pizza.base.Pizza;
import pizza.base.Topping;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        pizzaitaliana pizzaitaliana = new pizzaitaliana("Pizza Italiana", 25, "De Tomate");
        Pizza.addTopping(new Topping("Salsa", 5));
        Pizza.addTopping(new Topping("Queso mozzarella",    8));
        Pizza.addTopping(new Topping("Champion", 5));
        Pizza.prepare();
        System.out.println("Salsa: " + pizzaitaliana.getSalsa());

double precio = Pizza.getPizzaPrice();
System.out.println("Precio: " + precio);

    }
}