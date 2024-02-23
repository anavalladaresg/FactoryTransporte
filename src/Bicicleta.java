/**
 * Clase que representa una bicicleta
 */
public class Bicicleta implements IComun {


    @Override
    public float costeTotal(int cp) {
        // Supongamos que el coste por envío en bicicleta es de 5€ fijos
        return 5.0f;
    }

    /**
     * tipoEmbalaje(Float x, Float y, Float z, Float peso): Integer
     * Recibe dimensiones y peso
     * Devuelve tipo de embalaje (que es un entero)
     * 0 - palet
     * 1 - envoltorio cartón
     * 2 - caja de madera
     */
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        if (x > 1.5 && y > 1.5 && z > 1.5) {
            return 0;
        } else if (x < 1.5 && y < 1.5 && z < 1.5) {
            return 1;
        } else {
            return 2;
        }
    }

    /**
     * Método que muestra el tipo de embalaje del producto.
     */
    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso) {
        // Supongamos que para una bicicleta se requiere un embalaje simple como un envoltorio de cartón
        return 1; // Envoltorio cartón
    }
}
