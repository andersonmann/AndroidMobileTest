/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import core.BaseTest;
import page.AlertaPage;
import page.MenuPage;

/**
 * @author anderson.mann
 *
 */
public class AlertTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private AlertaPage alerta = new AlertaPage();

	@Test
	public void deveConfirmarAlerta() {
		// acessar menu alerta
		menu.acessarAlertas();

		// clicar em alerta confirm
		alerta.clicarAlertaConfirm();

		// verificar os textos
		assertEquals("Info", alerta.obterTituloAlerta());
		assertEquals("Confirma a operação?", alerta.obterMensagemAlerta());

		// confirmar alerta
		alerta.confirmar();

		// verificar nova mensagem
		assertEquals("Confirmado", alerta.obterMensagemAlerta());

		// sair
		alerta.sair();
	}
}