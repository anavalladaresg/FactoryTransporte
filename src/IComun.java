/**
 * Interfaz que contiene los métodos comunes de los productos.
 */
public interface IComun {
    /**
     * Método que muestra el coste total del producto.
     *
     * @param cp Código postal.
     */
    public float costeTotal(int cp);

    /**
     * Método que muestra el tipo de embalaje del producto.
     */
    int tipoEmbalaje(float x, float y, float z, float peso);
}

