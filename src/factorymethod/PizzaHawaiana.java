package src.factorymethod;

public class PizzaHawaiana implements Pizza{

    @Override
    public String getTipoMasa() {
        return "Delgada";
    }

    @Override
    public String getTipoQueso() {
        return "Mozzarella";
    }

    @Override
    public String getToppings() {
        return "Jamon y Piña";
    }

    @Override
    public String toString() {
        return getTipoMasa() + " " +
                getTipoQueso() + " " +
                getToppings();
    }
}
