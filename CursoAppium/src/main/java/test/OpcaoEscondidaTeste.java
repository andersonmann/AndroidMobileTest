/**
 * 
 */
package test;

import static core.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseTest;
import page.MenuPage;

/**
 * @author anderson.mann
 *
 */
public class OpcaoEscondidaTeste extends BaseTest {

	private MenuPage menu = new MenuPage();

	@Test
	public void deveEncontrarOpcaoEscondida() {
		// scroll down
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formul�rio']")));
		
		menu.scrollDown();

		// clicar menu
		menu.clicarPorTexto("Op��o bem escondida");

		// verificar mensagem
		assertEquals("Voc� achou essa op��o", menu.obterMensagemAlerta());

		// sair
		menu.clicarPorTexto("OK");
	}
}