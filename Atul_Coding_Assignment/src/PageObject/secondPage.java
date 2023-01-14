package PageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import Configfile.path;
import io.cucumber.java.en.Then;
import utility.Frameworkutility;

public class secondPage extends Frameworkutility {
	@Then("^Filter the results by Brand Samsung$")
	public void filter_the_results_by_brand_samsung() throws Throwable {
		findElement(path.samsung).click();//Step to click on Samsung 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		findElement(path.dropdown).click();//Step to click on Sort 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		findElement(path.dropDownValue).click();//Step to click High to low value
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		findElement(path.secondHighest).click();//Step to click on second highest tv price
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

	}
}
