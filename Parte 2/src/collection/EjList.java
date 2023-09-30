package collection;
import java.util.ArrayList;
import java.util.List;

public class EjList {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hola");
        strings.add("Mundo");
        strings.add("Hi");

        System.out.println(strings);

        strings.remove(0); //Remover por indice
        strings.remove("Hi"); //Remover por obejto
        strings.remove(" Mundo    ".trim()); //Remover por objeto ignorando espacios
        strings.addAll(List.of("Hi","World")); //Añadir una colección

        System.out.println(strings);

        strings.add(2, "\uD83C\uDF0F"); //Añadir objeto en una posición

        // ---------------- Recorrer listas -----------------

        //Enhanced for
        for (String string : strings){
            System.out.print(string);
        }

        //For each
        strings.forEach(string -> System.out.print(string));
    }
}
