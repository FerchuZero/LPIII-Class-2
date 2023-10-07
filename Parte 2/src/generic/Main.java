package generic;

public class Main {
    public static void main(String[] args) {
        Creador<Peluche> creadorCarrito = new Creador<Peluche>() {
            @Override
            public Peluche crear() {
                return new Peluche();
            }
        };

        Creador<Carrito> creadorPeluche = new Creador<Carrito>() {
            @Override
            public Carrito crear() {
                return new Carrito();
            }
        };


        creadorPeluche.crear();
        creadorCarrito.crear();

        Integer integer = Calculadora.suma(creadorCarrito.crear(),creadorPeluche.crear());
        System.out.println(integer);
    }
}
