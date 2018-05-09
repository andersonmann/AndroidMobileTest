/**
 * 
 */
package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import core.BaseTest;
import page.MenuPage;

/**
 * @author anderson.mann
 *
 */
public class SwipeTest extends BaseTest {

	private MenuPage menu = new MenuPage();

	@Test
	public void deveRealizarSwipe() {
		// acessar menu
		menu.acessarSwipe();

		// verificar texto 'a esquerda'
		assertTrue(menu.existeElementosPorTexto("a esquerda"));

		// swipe para direita
		menu.swipeRight();

		// verificar texto 'E veja se'
		assertTrue(menu.existeElementosPorTexto("E veja se"));

		// clicar botao direita
		menu.clicarPorTexto("›");

		// verificar texto 'Chegar até o fim!'
		assertTrue(menu.existeElementosPorTexto("Chegar até o fim!"));

		// swipe esquerda
		menu.swipeLeft();

		// clicar botao esquerda
		menu.clicarPorTexto("‹");

		// verificar texto 'a esquerda'
		assertTrue(menu.existeElementosPorTexto("a esquerda"));
	}
}
