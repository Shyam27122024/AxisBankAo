package Com.AxisBankQA.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Com.AxisBankQA.Base.TestBase;

public class ConfigurationPage_AccountDetails extends TestBase{
	
	@FindBy(xpath="//div[@id='CongratulationPage_frame1']/div[1]") private WebElement AccDetails;
	@FindBy(id="finalSubmitBtn") private WebElement FinalBtn;
	@FindBy(xpath="//button[text()='Yes']") private WebElement WindowAlert;
	
	
	public ConfigurationPage_AccountDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Click_On_Account_details() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Account details Last Screen");
		AccDetails.click();
	}
	
	public void Click_On_FinalSubmitBtn() {
		FinalBtn.click();
	}

	public void Click_On_WindowAlert() {
		String alertWindow = driver.getWindowHandle();
		driver.switchTo().window(alertWindow);
		WindowAlert.click();
	}
	
	
	
}
