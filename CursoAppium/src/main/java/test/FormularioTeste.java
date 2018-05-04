/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

import core.BaseTest;
import page.FormularioPage;
import page.MenuPage;

/**
 * @author anderson.mann
 *
 */
public class FormularioTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private FormularioPage formulario = new FormularioPage();

	@Before
	public void inicializarAppium() throws MalformedURLException {
		menu.acessarFormulario();
	}

	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {
		formulario.escreverNome("Anderson");
		assertEquals("Anderson", formulario.obterNome());
	}

	@Test
	public void deveInteragirComCombo() throws MalformedURLException {
		formulario.selecionarCombo("Nintendo Switch");
		assertEquals("Nintendo Switch", formulario.obterValorCombo());
	}

	@Test
	public void deveInteragirSwitchCheckBox() throws MalformedURLException {
		assertFalse(formulario.isCheckMarcado());
		assertTrue(formulario.isSwitchMarcado());

		formulario.clicarCheck();
		formulario.clicarSwitch();

		assertTrue(formulario.isCheckMarcado());
		assertFalse(formulario.isSwitchMarcado());
	}

	@Test
	public void deveRealizarCadastro() throws MalformedURLException {
		formulario.escreverNome("Wagner");
		formulario.clicarCheck();
		formulario.clicarSwitch();
		formulario.selecionarCombo("Nintendo Switch");

		formulario.salvar();

		assertEquals("Nome: Wagner", formulario.obterNomeCadastrado());
		assertEquals("Console: switch", formulario.obterConsoleCadastrado());
		assertTrue(formulario.obterCheckCadastrado().endsWith("Off"));
		assertTrue(formulario.obterSwitchCadastrado().endsWith("Marcado"));
	}
}