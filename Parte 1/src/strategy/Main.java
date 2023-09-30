package src.strategy;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int op_salir = 10;
    public static void main(String[] args) {
        Map<Integer, Accion> strategy = AccionHandler.getStrategy();

        int op;
        do{
            System.out.println("Elija una opción: ");
            op = scanner.nextInt();
            scanner.nextLine();
            Accion accion = strategy.get(op);

            if (op == op_salir) {continue;}
            if (accion == null){
                System.out.println("¡Esta opción no existe!");
            }else{
                accion.aplicar();
            }

        }while(op != op_salir);



    }
}
