/**
 * 
 */
package page;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import core.BasePage;
import io.appium.java_client.TouchAction;

/**
 * @author anderson.mann
 *
 */
public class CliquesPage extends BasePage {

	public void cliqueLongo() {
		new TouchAction(getDriver()).longPress(getDriver().findElement(By.xpath("//*[@text='Clique Longo']")))
				.perform();
	}

	public String obterTextoPorCampo() {
		return getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
	}

}
