/**
 * 
 */
package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import core.BaseTest;
import page.AbaPage;
import page.MenuPage;

/**
 * @author anderson.mann
 *
 */
public class AbasTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private AbaPage aba = new AbaPage();

	@Test
	public void deveInteragirComAbas() {
		// acessar menu abas
		menu.acessarAbas();

		// verificar que esta na aba 1
		assertTrue(aba.isAba1());

		// acessar aba 2
		aba.selecionarAba2();

		// verificar que esta na aba 2
		assertTrue(aba.isAba2());
	}
}