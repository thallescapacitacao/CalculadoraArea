package figura;

import base.Area;

public class Circulo implements Area {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcular() {
        double PI = 3.14;
        return PI * (raio * raio);
    }

}
