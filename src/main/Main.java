package src.package2;

import src.package1.Prueba;
import src.singleton.Singleton;
import src.builder.*;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        Empleado empleado = Empleado.builder()
                .id(123)
                .nombre("Fernando")
                .build();
        System.out.println(empleado);
    }

}
