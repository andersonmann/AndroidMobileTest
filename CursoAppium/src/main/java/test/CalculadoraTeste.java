/**
 * 
 */
package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author anderson.mann
 *
 */
public class CalculadoraTeste {

	@Test
	public void deveSomarDoisValores() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "LGK430B6EETSNV");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
		desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),
				desiredCapabilities);

		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("2");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Adição");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("2");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("igual");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("4");
		el5.click();

		System.out.println(el5.getText());
		Assert.assertEquals("4", el5.getText());

		driver.quit();
	}
}
