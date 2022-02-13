import area.Calculadora;
import figura.Circulo;
import figura.Quadrado;
import listagem.Areas;

public class App {

    public static void main(String[] args) throws Exception {
        Areas areas = criarAreas();
        double resultado = calcularSoma(areas);
        exibirNoTerminal(resultado);
    }

    private static Areas criarAreas() {
        Areas areas = new Areas();
        areas.adicionar(new Quadrado(3));
        areas.adicionar(new Circulo(2.44));
        return areas;
    }

    private static double calcularSoma(Areas areas) {
        Calculadora calculadora = new Calculadora(areas);
        double resultado = calculadora.somar();
        return resultado;
    }

    private static void exibirNoTerminal(double resultado) {
        System.out.println(resultado);
    }

}