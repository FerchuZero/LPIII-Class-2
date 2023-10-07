package functional;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        Function<Integer, String> function = (Integer integer) -> integer.toString() + ", este es el numero...";
//        System.out.println(function.apply(5));

        FunctionalInterface<String, Integer> functionalInterface = (string1, string2) -> {
            System.out.println("Valor 1: " + string1 + " - Valor2: " + string2);
            Integer int1 = Integer.parseInt(string1);
            Integer int2 = Integer.parseInt(string2);
            return int1 + int2;
        };
        System.out.println(functionalInterface.aplicar("100","200"));
    }
}
