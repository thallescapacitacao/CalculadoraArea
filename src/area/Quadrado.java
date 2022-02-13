package area;

import contrato.Area;

public class Quadrado implements Area {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcular() {
        return lado * lado;
    }

}
