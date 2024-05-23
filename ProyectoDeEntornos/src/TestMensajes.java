import static org.junit.Assert.*;

import org.junit.Test;

public class TestMensajes {

	// Al final hemos decidido que el metodo no utiliza escaner.
	
	@Test
	public void test1() {
		Usuario u = new Usuario();
		assertTrue(u.enviarMensaje("+34789654123", "a.gif", (float) 2.0));
	}
	
	@Test
	public void test2() {
		Usuario u = new Usuario();
		assertTrue(u.enviarMensaje("+541593574862", "Che boludo, hemos ganado el mundial."));
	}

	@Test
	public void test3() {
		Usuario u = new Usuario();
		assertFalse(u.enviarMensaje("-214789632145", "a.jpg", (float) 12.0));
	}
	
	@Test
	public void test4() {
		Usuario u = new Usuario();
		assertFalse(u.enviarMensaje("+Lauritaaa", "a.gif", (float) 200.0));
	}
	
	@Test
	public void test5() {
		Usuario u = new Usuario();
		assertFalse(u.enviarMensaje("+7894561594786", "a.webp", (float) 25.0));
	}

}
