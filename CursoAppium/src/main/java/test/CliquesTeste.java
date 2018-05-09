/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
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

	@Before
	public void setup() {
		// acessar menu
		menu.acessarCliques();
	}

	@Test
	public void deveRealizarCliqueLongo() {
		// clique longo
		cliques.cliqueLongo();

		// verificar texto
		assertEquals("Clique Longo", cliques.obterTextoPorCampo());
	}

	@Test
	public void deveRealizarDuploClique() {
		// duplo clique
		cliques.clicarPorTexto("Clique duplo");
		cliques.clicarPorTexto("Clique duplo");

		// verificar texto
		assertEquals("Duplo Clique", cliques.obterTextoPorCampo());
	}

}
