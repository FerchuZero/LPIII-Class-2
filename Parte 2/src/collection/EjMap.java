package collection;

import java.util.HashMap;
import java.util.Map;

public class EjMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "Accion Eliminar");
        map.put(5, "Accion Mostrar");

        System.out.println(map);

        map.put(5, "Accion Crear");

        map.forEach((key, value) -> System.out.println("Key: " + key + " -> " + "Value: " + value));
    }
}
