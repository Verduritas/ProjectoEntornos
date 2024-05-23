/**
 * Clase que representa un mensaje del tipo SMS.
 */
public class SMS implements Mensaje {
	private String numRemit;
	private String numDest;
	private String text;

	/**
	 * Constructor.
	 *
	 * @param numRemit el número del remitente
	 * @param numDest  el número del destinatario
	 * @param text     el texto del mensaje
	 */
	public SMS(String numRemit, String numDest, String text) {
		this.numRemit = numRemit;
		this.numDest = numDest;
		this.text = text;
	}

	/**
	 * Fija el número del remitente.
	 *
	 * @param numRemit el número del remitente
	 */
	public void setNumRemit(String numRemit) {
		this.numRemit = numRemit;
	}

	/**
	 * Fija el número del destinatario.
	 *
	 * @param numDest el número del destinatario
	 */
	public void setNumDest(String numDest) {
		this.numDest = numDest;
	}

	/**
	 * Fija el texto del mensaje.
	 *
	 * @param text el texto del mensaje
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Obtiene el número del remitente.
	 *
	 * @return el número del remitente
	 */
	@Override
	public String getNumRemit() {
		return numRemit;
	}

	/**
	 * Obtiene el número del destinatario.
	 *
	 * @return el número del destinatario
	 */
	@Override
	public String getNumDest() {
		return numDest;
	}

	/**
	 * Obtiene el texto del mensaje.
	 *
	 * @return el texto del mensaje
	 */
	public String getText() {
		return text;
	}
}
