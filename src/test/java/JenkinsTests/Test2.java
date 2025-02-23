package JenkinsTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test2 extends parallelbase {
	
	@Test
	public void Example() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement Adult = driver.findElement(By.cssSelector("#divpaxinfo"));

		Adult.click();
		Thread.sleep(2000);

		WebElement incre = driver.findElement(By.cssSelector("#hrefIncAdt"));

		int i = 1;
		while (i < 5) {
			incre.click();
			i++;
		}

		WebElement close = driver.findElement(By.cssSelector("#btnclosepaxoption"));
		close.click();


	}

}
