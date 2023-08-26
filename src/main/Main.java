package src.main;

import src.factorymethod.*;

public class Main {

    public static void main(String[] args) {

//        Singleton singleton = Singleton.getInstance();

//        Empleado empleado = Empleado.builder()
//                .id(123)
//                .nombre("Fernando")
//                .build();
//        System.out.println(empleado);

//        Estudiante estudiante = new Estudiante("Fernando",12345,6);
//        Estudiante estudiante2 = estudiante.clone();
//
//        System.out.println(estudiante == estudiante2);
//        System.out.println("Estudiante 1: " + estudiante);
//        System.out.println("Estudiante 2: " + estudiante2);

        CreadorPizza creadorPizzaHawaiana = new CreadorPizzaHawaiana();
        CreadorPizza creadorPizzaSalami = new CreadorPizzaSalami();

        Pizza pizza1 = creadorPizzaHawaiana.crear();
        Pizza pizza2 = creadorPizzaSalami.crear();

        System.out.println(pizza1);
        System.out.println(pizza2);

    }

}
