package generic;

public class Calculadora {

    public static <T extends Juguete> Integer suma(T p1, T p2){
        return p1.getId() + p2.getId();
    }
}
