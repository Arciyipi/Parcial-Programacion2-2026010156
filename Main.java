public class Main {
    public static void main(String[] args) {
        // En la rama main, el Vendedor usa por defecto la ComisionEstandar
        EstrategiaComision estrategia = new ComisionEstandar();

        Vendedor vendedor = new Vendedor("Roberto", 1000.0, estrategia);
        vendedor.mostrarDetalle();
    }
}
