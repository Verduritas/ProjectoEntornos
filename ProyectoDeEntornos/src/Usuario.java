import java.util.ArrayList;

/**
 * Clase que representa a un Usuario.
 */
public class Usuario {
	private String tlfno;
	private String nombre;
	private ArrayList<Mensaje> mensajesEnviados;
	private ArrayList<Mensaje> mensajesRecibidos;

	/**
	 * Constructor de Usuario.
	 */
	public Usuario() {
		this.mensajesEnviados = new ArrayList<>();
		this.mensajesRecibidos = new ArrayList<>();
	}

	public String getTlfno() {
		return tlfno;
	}

	public void setTlfno(String tlfno) {
		this.tlfno = tlfno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Mensaje> getMensajesEnviados() {
		return mensajesEnviados;
	}

	public void setMensajesEnviados(ArrayList<Mensaje> mensajesEnviados) {
		this.mensajesEnviados = mensajesEnviados;
	}

	public ArrayList<Mensaje> getMensajesRecibidos() {
		return mensajesRecibidos;
	}

	public void setMensajesRecibidos(ArrayList<Mensaje> mensajesRecibidos) {
		this.mensajesRecibidos = mensajesRecibidos;
	}

	/**
	 * Manda un mensaje SMS.
	 *
	 * @param numDest el numero del recividor
	 * @param text    el texto del sms
	 * @return true si se envio bien falso si no
	 */
	public boolean enviarMensaje(String numDest, String text) {
		if (validatePhoneNumber(numDest)) {
			SMS sms = new SMS(this.tlfno, numDest, text);
			mensajesEnviados.add(sms);
			return true;
		}
		return false;
	}

	/**
	 * Manda un mensaje MMS.
	 *
	 * @param numDest    numero del destinatario
	 * @param ficheroImg the image file name
	 * @param tamanioImg the image size
	 * @return true si se encuentra el examen false si no
	 */
	public boolean enviarMensaje(String numDest, String ficheroImg, float tamanioImg) {
		if (validatePhoneNumber(numDest) && tamanioImg > 0 && tamanioImg <= 20.0) {
			MMS mms = new MMS(this.tlfno, numDest, ficheroImg, tamanioImg);
			mensajesEnviados.add(mms);
			return true;
		}
		return false;
	}

	/**
	 * Valida el numero de telefono.
	 *
	 * @param phoneNumber el numero a validar
	 * @return true true si el numero es valido falso si no
	 */
	private boolean validatePhoneNumber(String phoneNumber) {
		return phoneNumber.matches("\\+\\d{10,13}");
	}

}
