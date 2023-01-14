package PageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import Configfile.path;
import io.cucumber.java.en.Then;
import utility.Frameworkutility;

public class nextwindow extends Frameworkutility {
	@Then("^Switching to next window$")
	public void switching_to_next_window() throws Throwable {
			//Switching the window
			Set<String> window = driver.getWindowHandles();
			ArrayList<String> w1 = new ArrayList<String>(window);

			driver.switchTo().window(w1.get(1));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//Asserting "about this section" and logging in console 
			System.out.println("About this item is.." + findElement(path.text).isDisplayed());
			System.out.println("About this item is.." + findElement(path.text).getText());
			softassert.assertEquals(true, findElement(path.text).isDisplayed());
			driver.quit();
	}
}
