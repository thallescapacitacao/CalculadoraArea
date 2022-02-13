package area;

import base.Area;
import listagem.Areas;

public class Calculadora {

    private Areas areas;

    public Calculadora(Areas areas) {
        this.areas = areas;
    }

    public double somar() {
        double resultado = 0;
        for (Area area : areas.listar()) {
            resultado += area.calcular();
        }
        return resultado;
    }

}
