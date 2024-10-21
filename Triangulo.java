public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        // Complejidad temporal: O(1) Tiempo constante.
        return (base * altura) / 2;
    }

    @Override
    public double obtenerPerimetro() {
        // Complejidad temporal: O(1) Tiempo constante.
       
        return 3 * base;
    }
}
