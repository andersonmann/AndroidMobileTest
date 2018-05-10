package test;

import org.junit.After;
import org.junit.Test;

import core.BaseTest;
import page.MenuPage;
import page.WebViewPage;

public class WebViewTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private WebViewPage page = new WebViewPage();

	@Test
	public void deveFazerLogin() {
		// acessar o menu
		menu.acessarSBHibrido();

		esperar(4000);
		page.entrarContextoWeb();

		// preencher email
		page.setEmail("anderson.mann@4all.com");

		// senha

		// entrar

	}

	@After
	public void tearDown() {
		page.sairContextoWeb();
	}

}
