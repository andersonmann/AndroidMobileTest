/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
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

	@Before
	public void setup() {
		menu.acessarAlertas();
	}

	@Test
	public void deveConfirmarAlerta() {
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

	@Test
	public void deveClicarForaAlerta() {
		// clicar alerta simples
		alerta.clicarAlertaSimples();

		// clicar fora da caixa
		esperar(1000);
		alerta.clicarForaCaixa();

		// verificar que a mensagem não está presente
		assertFalse(alerta.existeElementosPorTexto("Pode clicar no OK ou fora da caixa para sair"));
	}

}