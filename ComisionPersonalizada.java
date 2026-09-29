public class ComisionPersonalizada implements EstrategiaComision {

    private final int n; // cantidad de letras del primer nombre

    public ComisionPersonalizada(String primerNombre) {
        this.n = primerNombre.length();
    }

    @Override
    public double calcularComision(double montoVenta) {
        double porcentaje = 5.0 + n; // (5 + N) %
        return montoVenta * (porcentaje / 100.0);
    }
}
