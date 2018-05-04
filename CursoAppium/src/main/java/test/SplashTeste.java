/**
 * 
 */
package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import core.BaseTest;
import page.MenuPage;
import page.SplashPage;

/**
 * @author anderson.mann
 *
 */
public class SplashTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SplashPage splash = new SplashPage();

	@Test
	public void deveAguardarSplashSumir() {
		// acessar menu
		menu.acessarSplash();

		// verificar que o splash esta sendo exibido
		splash.isTelaSplashVisivel();

		// aguardar saida do splash
		splash.aguardarSplashSumir();		

		// verificar que o formulario esta aparecendo
		assertTrue(splash.existeElementosPorTexto("Formulário"));
		
		
	}

}
