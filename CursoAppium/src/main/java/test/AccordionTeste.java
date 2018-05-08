/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import core.BaseTest;
import page.AccordionPage;
import page.MenuPage;

/**
 * @author anderson.mann
 *
 */
public class AccordionTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private AccordionPage accordion = new AccordionPage();

	@Test
	public void deveInteragirComAccordion() throws InterruptedException {
		// acessar menu
		menu.acessarAccordion();

		// clicar op 1
		accordion.selecionarOp1();

		// verificar texto 1
		Thread.sleep(1000);
		assertEquals("Esta é a descrição da opção 1", accordion.obterValorOp1());

	}

}
