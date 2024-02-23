public class Factory {
    public static final int PALET = 1;
    public static final int CARTON = 2;
    public static final int MADERA = 3;

    /**
     * Devuelve producto del tipo de la Interface
     *
     * @param type 1: palet, 2: carton, 3: madera
     * @return instancia de un objeto de tipo Transporte
     */
    public Object getProducto(int type) {
        return switch (type) {
            // tipo palet
            case PALET -> new Camion(); // Supongamos que un palet se envía en camión
            // tipo carton
            case CARTON -> new Bicicleta(); // Supongamos que un envoltorio de cartón se envía en bicicleta
            // tipo madera
            case MADERA -> new Camion(); // Supongamos que una caja de madera se envía en camión
            // otro tipo
            default -> null;
        };
    }

}