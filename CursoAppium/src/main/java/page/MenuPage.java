/**
 * 
 */
package page;

import core.BasePage;

/**
 * @author anderson.mann
 *
 */
public class MenuPage extends BasePage {

	public void acessarFormulario() {
		clicarPorTexto("Formul�rio");
	}

	public void acessarSplash() {
		clicarPorTexto("Splash");
	}
}