package page;

import static core.DriverFactory.getDriver;

import java.util.Set;

import org.openqa.selenium.By;

import core.BasePage;

public class WebViewPage extends BasePage {

	public void entrarContextoWeb() {
		Set<String> contextHandles = getDriver().getContextHandles();
		for (String valor : contextHandles) {
			System.out.println(valor);
		}

		getDriver().context((String) contextHandles.toArray()[1]);
	}

	public void sairContextoWeb() {
		getDriver().context((String) getDriver().getContextHandles().toArray()[0]);
	}

	public void setEmail(String valor) {
		getDriver().findElement(By.id("email")).sendKeys(valor);
	}

}
