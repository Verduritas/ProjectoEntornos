/**
 *  Interfaz que representa el mensaje.
 */
public interface Mensaje {
    /**
     * Obtiene el número del emisor.
     *
     * @return el número del emisor.
     */
    String getNumRemit();

    /**
     * Obtiene el número del receptor.
     *
     * @return el número del receptor.
     */
    String getNumDest();
}
