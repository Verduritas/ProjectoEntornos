/**
 * Clase que representa un mensaje MMS.
 */
public class MMS implements Mensaje {
	private String numRemit;
	private String numDest;
	private String ficheroImg;
	private float tamanioImg;

	/**
	 * Constructor.
	 *
	 * @param numRemit   el número del remitente
	 * @param numDest    el número del destinatario
	 * @param ficheroImg el nombre del archivo de imagen
	 * @param tamanioImg el tamaño de la imagen
	 */
	public MMS(String numRemit, String numDest, String ficheroImg, float tamanioImg) {
		this.numRemit = numRemit;
		this.numDest = numDest;
		this.ficheroImg = ficheroImg;
		this.tamanioImg = tamanioImg;
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
	 * Fija el nombre del archivo de imagen.
	 *
	 * @param ficheroImg el nombre del archivo de imagen
	 */
	public void setFicheroImg(String ficheroImg) {
		this.ficheroImg = ficheroImg;
	}

	/**
	 * Fija el tamaño de la imagen.
	 *
	 * @param tamanioImg el tamaño de la imagen
	 */
	public void setTamanioImg(float tamanioImg) {
		this.tamanioImg = tamanioImg;
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
	 * Obtiene el nombre del archivo de imagen.
	 *
	 * @return el nombre del archivo de imagen
	 */
	public String getFicheroImg() {
		return ficheroImg;
	}

	/**
	 * Obtiene el tamaño de la imagen.
	 *
	 * @return el tamaño de la imagen
	 */
	public float getTamanioImg() {
		return tamanioImg;
	}
}
