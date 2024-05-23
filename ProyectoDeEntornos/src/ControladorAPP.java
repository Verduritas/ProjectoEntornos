import java.util.ArrayList;

/**
 * Clase que controla la aplicacion.
 */
public class ControladorAPP {
	private static ArrayList<Mensaje> mensajes = new ArrayList<>();
	private static ArrayList<Usuario> usuarios = new ArrayList<>();
	private static Usuario cuenta;

	public static Usuario getCuenta() {
		return cuenta;
	}

	public static void setCuenta(Usuario cuenta) {
		ControladorAPP.cuenta = cuenta;
	}

	public static ArrayList<Mensaje> getMensajes() {
		return mensajes;
	}

	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	/**
	 * Busca un usuario por el numero de telefono.
	 *
	 * @param tlfno el telefono a buscar
	 * @return el usuario si se encuentra null si no
	 */
	public static Usuario buscarUsuario(String tlfno) {
		for (Usuario usuario : usuarios) {
			if (usuario.getTlfno().equals(tlfno)) {
				return usuario;
			}
		}
		return null;
	}

	/**
	 * Busca mensajes enviados de un numero a otro.
	 *
	 * @param tlfnoRemit telefono del que envia
	 * @param tlfnoDest  telefono del que reciva
	 * @return una lista con los mensajes apropiados
	 */
	public static ArrayList<Mensaje> buscarMensajes(String tlfnoRemit, String tlfnoDest) {
		ArrayList<Mensaje> resultado = new ArrayList<>();
		for (Mensaje mensaje : mensajes) {
			if (mensaje.getNumRemit().equals(tlfnoRemit) && mensaje.getNumDest().equals(tlfnoDest)) {
				resultado.add(mensaje);
			}
		}
		return resultado;
	}

	/**
	 * Searches for messages sent by a specific phone number.
	 *
	 * @param tlfnoRemit el telefono del remitente.
	 * @return una lista con los mensajes apropiados
	 */
	public static ArrayList<Mensaje> buscarMensajesEnviados(String tlfnoRemit) {
		ArrayList<Mensaje> resultado = new ArrayList<>();
		for (Mensaje mensaje : mensajes) {
			if (mensaje.getNumRemit().equals(tlfnoRemit)) {
				resultado.add(mensaje);
			}
		}
		return resultado;
	}

	/**
	 * Searches for messages received by a specific phone number.
	 *
	 * @param tlfnoDest the receiver's phone number
	 * @return una lista con los mensajes apropiados
	 */
	public static ArrayList<Mensaje> buscarMensajesRecibidos(String tlfnoDest) {
		ArrayList<Mensaje> resultado = new ArrayList<>();
		for (Mensaje mensaje : mensajes) {
			if (mensaje.getNumDest().equals(tlfnoDest)) {
				resultado.add(mensaje);
			}
		}
		return resultado;
	}
}
