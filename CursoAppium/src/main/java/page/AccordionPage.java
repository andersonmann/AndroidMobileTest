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
public class AccordionPage extends BasePage {
	
	public void selecionarOp1() {
		clicarPorTexto("Op��o 1");
	}
	
	public String obterValorOp1() {
		return obterTexto(By.xpath("//*[@text='Op��o 1']/../..//following-sibling::android.view.ViewGroup//android.widget.TextView"));
	}
}