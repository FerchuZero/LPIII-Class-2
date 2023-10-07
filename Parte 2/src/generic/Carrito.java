package generic;

public class Carrito implements Juguete, Cosa{
    public Carrito() {
        System.out.println("Carrito creado");
    }

    @Override
    public Integer getId() {
        return 2;
    }
}
