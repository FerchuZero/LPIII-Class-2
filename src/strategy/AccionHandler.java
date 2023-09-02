package src.strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Contruye mapas
public class AccionHandler {
    private AccionHandler(){}

    // Forma corta para mapear
//    private static final Map<Integer, Accion> strategy =
//            List.of(new AccionCrear(),
//                    new AccionLeer(),
//                    new AccionActualizar(),
//                    new AccionBorrar())
//                    .stream()
//                    .collect(Collectors.toMap(Accion::getOpcion, Function.identity()));
    private static final List<Accion> listaAcciones =
            List.of(new AccionCrear(),
                    new AccionLeer(),
                    new AccionActualizar(),
                    new AccionBorrar(),
                    new AccionBuscar());


    public static Map<Integer, Accion> getStrategy() {
        Map<Integer, Accion> strategy = new HashMap<>();
        for (Accion accion : listaAcciones){
            strategy.put(accion.getOpcion(), accion);
        }

        return strategy;
    }

}
