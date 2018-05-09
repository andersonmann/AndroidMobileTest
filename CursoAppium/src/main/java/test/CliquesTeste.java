/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import core.BaseTest;
import page.CliquesPage;
import page.MenuPage;

/**
 * @author anderson.mann
 *
 */
public class CliquesTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private CliquesPage cliques = new CliquesPage();

	@Test
	public void deveRealizarCliqueLongo() {
		// acessar menu
		menu.acessarCliques();

		// clique longo
		cliques.cliqueLongo();

		// verificar texto
		assertEquals("Clique Longo", cliques.obterTextoPorCampo());

	}

}
