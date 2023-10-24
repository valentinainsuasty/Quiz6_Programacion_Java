/**
 * clase FIguraGeometrica
 */
class FiguraGeometrica {
    /**
     * Atributos
     */
    private String nombre;
    private String color;
    /**
     * Métodos
     *
     * Constructor para iniciaizar atributos
     *
     * @param nombre
     * @param color
     *
     * Complejidad temporal: 0(1) tiempo constante
     */
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    /**
     * Método que devuelve el area de la figura
     * @return Area de la figura
     */
    public double obtenerArea() {
        return 0.0;
    }

    /**
     * Método que devuelve el perimetro de la figura
     * @return Perimetro de la figura
     */
    public double obtenerPerimetro() {
        return 0.0;
    }

    /**
     * Metodo qgetter que permite obtener el nombre de la figura
     * @return Nombre de la figura
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setter que permite cambiar el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter que permite obtener el color de la figura
     * @return Color de la figura
     */
    public String getColor() {
        return color;
    }
    /**
     *Método setter que permite cambiar el color de la figura
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
}
