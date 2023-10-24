/**
 * clase Circulo que hereda  de FiguraGeometrica
 */
class Circulo extends FiguraGeometrica {
    /**
     * Atributos
     */
    private double radio;

    /**
     * Metodos
     *
     * Contructor para inicializar atributos
     *
     * @param nombre
     * @param color
     * @param radio
     *
     * Complejidad temporal: 0(1) tiempo constante
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    /**
     * Metodo que obtiene el area de la figura
     * @return Area de la figura
     */
    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
    /**
     *Metodo que permite obtener el perimetro de la figura
     * @return Perimetro de la figura
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}