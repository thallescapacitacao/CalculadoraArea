import area.Circulo;
import area.Quadrado;
import lista.Areas;

public class App {

    public static void main(String[] args) throws Exception {
        Areas areas = criarAreas();
        double resultado = areas.somar();
        System.out.println(resultado);
    }

    private static Areas criarAreas() {
        Areas areas = new Areas();
        areas.adicionar(new Quadrado(3));
        areas.adicionar(new Circulo(2.44));
        return areas;
    }

}