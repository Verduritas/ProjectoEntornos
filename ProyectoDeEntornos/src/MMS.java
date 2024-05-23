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
	 * @param numRemit   el numero del remitente
	 * @param numDest    el numero del destinatario
	 * @param ficheroImg el nombre del archivo de imagen
	 * @param tamanioImg el tamanno de la imagen
	 */
	public MMS(String numRemit, String numDest, String ficheroImg, float tamanioImg) {
		this.numRemit = numRemit;
		this.numDest = numDest;
		this.ficheroImg = ficheroImg;
		this.tamanioImg = tamanioImg;
	}

	/**
	 * Fija el numero del remitente.
	 *
	 * @param numRemit el numero del remitente
	 */
	public void setNumRemit(String numRemit) {
		this.numRemit = numRemit;
	}

	/**
	 * Fija el numero del destinatario.
	 *
	 * @param numDest el numero del destinatario
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
	 * Fija el tamanno de la imagen.
	 *
	 * @param tamanioImg el tamanno de la imagen
	 */
	public void setTamanioImg(float tamanioImg) {
		this.tamanioImg = tamanioImg;
	}

	/**
	 * Obtiene el numero del remitente.
	 *
	 * @return el numero del remitente
	 */
	@Override
	public String getNumRemit() {
		return numRemit;
	}

	/**
	 * Obtiene el numero del destinatario.
	 *
	 * @return el numero del destinatario
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
	 * Obtiene el tamanno de la imagen.
	 *
	 * @return el tamanno de la imagen
	 */
	public float getTamanioImg() {
		return tamanioImg;
	}
}
