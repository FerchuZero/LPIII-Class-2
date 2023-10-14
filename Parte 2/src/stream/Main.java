package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1l, 17, "Luis"));
        empleados.add(new Empleado(6l, 21, "Fernando"));
        empleados.add(new Empleado(7l, 19, "Felipe"));

        //Empleado::getNombre - Method Reference
        //Obtener los nombres de los empleados
        Set<String> nombres = empleados.stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toSet());

        //Filtrar empleados por primer caracter del nombre
        Set<Empleado> empleadosfilter = empleados.stream()
                        .filter(empleado -> empleado.getNombre().charAt(0) != 'L')
                        .collect(Collectors.toSet());

        //Econtrar el maximo o minimo de un valor
        //La clase Optional evita nulos
        Optional<Empleado> empleadoNMLargo =  empleados.stream()
                        .max(Comparator.comparing(empleado -> empleado.getNombre().length()));

        //Encontrar el primero
        Optional<Empleado> primerEmpleado =  empleados.stream()
                        .filter(empleado -> empleado.getNombre().charAt(0) == 'A')
                        .findFirst();

        //Mapear una clase utilizando su id y asi mismo
        Map<Long, Empleado> empleadosMap = empleados.stream()
                        .collect(Collectors.toMap(Empleado::getId, empleado -> empleado ));

        //Mostrar mediante forEach utilizando streams
        empleados.stream()
                        .filter(empleado -> empleado.getNombre().charAt(0) == 'F')
                        .forEach(System.out::println);

        System.out.println();
        System.out.println("Nombres");
        System.out.println(nombres);
        System.out.println();

        System.out.println("Filtro por caracter");
        System.out.println(empleadosfilter);
        System.out.println();

        System.out.println("Filtro por nombre más largo");
        System.out.println(empleadoNMLargo);
        System.out.println();

        System.out.println("Mapeo usando id y asi mismo");
        System.out.println(empleadosMap);
        System.out.println();

        Optional<Empleado> optionalEmpleado = Optional.of(new Empleado(5l, 17, "Alan Brito"))
                .filter(empleado -> empleado.getEdad() > 18);

        optionalEmpleado.orElseThrow(); //Devuelve una excepción si no hay un valor
        optionalEmpleado.orElse(null);//Devuelve otro objeto si no hay un valor - Eager(Si ponemos funcion siempre se ejecuta)
        optionalEmpleado.orElseGet(null);//Devuelve una función lamda si no hay un valor - Lazy(Solo se ejecuta la funcion si no hay valor)

        System.out.println(optionalEmpleado.isPresent());
    }
}
