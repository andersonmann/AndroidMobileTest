/**
 * 
 */
package page;

import core.BasePage;

/**
 * @author anderson.mann
 *
 */
public class AbaPage extends BasePage {

	public boolean isAba1() {
		return existeElementosPorTexto("Este � o conte�do da Aba 1");
	}

	public boolean isAba2() {
		return existeElementosPorTexto("Este � o conte�do da Aba 2");
	}

	public void selecionarAba2() {
		clicarPorTexto("ABA 2");
	}
}