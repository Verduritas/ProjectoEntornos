/**
 *  Interfaz que representa el mensaje.
 */
public interface Mensaje {
    /**
     * Obtiene el numero del emisor.
     *
     * @return el numero del emisor.
     */
    String getNumRemit();

    /**
     * Obtiene el numero del receptor.
     *
     * @return el numero del receptor.
     */
    String getNumDest();
}
