public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        // Complejidad temporal: O(1) Tiempo constante.
        return Math.PI * radio * radio;
    }

    @Override
    public double obtenerPerimetro() {
        // Complejidad temporal: O(1) Tiempo constante.
        return 2 * Math.PI * radio;
    }
}
