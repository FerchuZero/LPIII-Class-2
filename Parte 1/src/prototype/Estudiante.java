package src.prototype;
// Crear objetos a partir de otros

public class Estudiante {
    private String nombre;
    private long id;
    private int creditos;

    public Estudiante(String nombre, int id, int creditos) {
        this.nombre = nombre;
        this.id = id;
        this.creditos = creditos;
    }

    public Estudiante(Estudiante estudiante){
        this.nombre = estudiante.nombre;
        this.id = estudiante.id;
        this.creditos = estudiante.creditos;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", creditos=" + creditos +
                '}';
    }

    @Override
    public Estudiante clone(){
        return new Estudiante(this);
    }

}
