/**
 * clase Rectangulo que hereda de FigraGeometrica
 */
class Rectangulo extends FiguraGeometrica {
    /**
     * Atributos
     */
    private double lado1;
    private double lado2;

    /**
     * Metodos
     *
     * Contructor para inicializar atributos
     *
     * @param nombre
     * @param color
     * @param lado1
     * @param lado2
     *
     * Complejidad temporal: 0(1) tiempo constante
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    /**
     * Metodo que permite obtener el area de la figura
     * @return Obtiene el area de la figura
     */
    @Override
    public double obtenerArea() {
        return lado1 * lado2;
    }
    /**
     *Metodo que obtiene el perimetro de la figura
     * @return Perimetro de la figura
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }
}
