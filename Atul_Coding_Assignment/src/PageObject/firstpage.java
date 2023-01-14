package PageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Configfile.path;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Frameworkutility;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firstpage extends Frameworkutility {

	public static String url = "https://www.amazon.in/";

	@Given("^Open amazon$")
	public void open_amazon() throws Exception {

		chromeSetup(url);

	}

	@Then("^Open the navigation and select televisions$")
	public void open_the_navigation_and_select_televisions() throws Throwable {
		
		findElement(path.menu).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		findElement(path.tvAppliance).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("path.televisions")));
		Thread.sleep(2000);
		findElement(path.televisions).click();
	}

}
