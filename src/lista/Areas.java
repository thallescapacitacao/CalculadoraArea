package lista;

import java.util.ArrayList;
import java.util.List;

import contrato.Area;

public class Areas {

    private List<Area> areas;

    public Areas() {
        areas = new ArrayList<Area>();
    }

    public void adicionar(Area area) {
        areas.add(area);
    }

    public double somar() {
        double resultado = 0;
        for (Area area : areas) {
            resultado += area.calcular();
        }
        return resultado;
    }

}
