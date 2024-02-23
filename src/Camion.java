import java.util.Random;
/**
 * Clase Camion que implementa la interfaz IComun.
 */
public class Camion implements IComun {

    /**
     * Método que muestra el coste total del producto.
     *
     * @param cp Código postal.
     *           return Float
     */
    @Override
    public float costeTotal(int cp) {
        float costeBase = 50.0f;
        float costePorKilometro = 1.0f;
        int distanciaKilometros = obtenerDistancia(cp); // Esta función devuelve la distancia hasta el destino en kilómetros
        return costeBase + (costePorKilometro * distanciaKilometros);
    }

    /**
     * Método que muestra el tipo de embalaje del producto.
     */
    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso) {
        if (peso <= 0 || x <= 0 || y <= 0 || z <= 0) {
            throw new IllegalArgumentException("Las dimensiones y el peso deben ser positivos");
        }
        if (peso > 20 || x > 50 || y > 50 || z > 50) {
            return 3;
        } else {
            return 2;
        }
    }

    /**
     * Método que muestra la distancia real basada en el código postal.
     *
     * @param cp Código postal.
     *           return Integer
     */
    private int obtenerDistancia(int cp) {
        // Generamos una distancia aleatoria entre 1 y 200 km
        Random rand = new Random(cp);
        return 1 + rand.nextInt(200);
    }

}
