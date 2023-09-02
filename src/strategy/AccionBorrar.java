package src.strategy;

import java.util.Map;

public class AccionBorrar implements Accion{
    @Override
    public void aplicar() {
        System.out.println("Estoy borrando...");
    }

    @Override
    public int getOpcion() {
        return 4;
    }
}
