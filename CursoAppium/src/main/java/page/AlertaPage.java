/**
 * 
 */
package page;

import org.openqa.selenium.By;

import core.BasePage;

/**
 * @author anderson.mann
 *
 */
public class AlertaPage extends BasePage {

	public void clicarAlertaConfirm() {
		clicarPorTexto("ALERTA CONFIRM");
	}

	public String obterTituloAlerta() {
		return obterTexto(By.id("android:id/alertTitle"));
	}

	public String obterMensagemAlerta() {
		return obterTexto(By.id("android:id/message"));
	}

	public void confirmar() {
		clicarPorTexto("CONFIRMAR");
	}

	public void sair() {
		clicarPorTexto("SAIR");
	}
}