package generic;

public class Peluche implements Juguete, Cosa{

    public Peluche(){
        System.out.println("Peluche creado");
    }

    @Override
    public Integer getId() {
        return 1;
    }
}
