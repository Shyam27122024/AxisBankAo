package Com.AxisBankQA.Pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.AxisBankQA.Base.TestBase;

public class Application_Review_Page extends TestBase {
	
	@FindBy(id="navigationNextBtn") private WebElement NextBtn;
	
	
	public Application_Review_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnNext() {
		NextBtn.click();
	}
	
	
	public void Verify_Application_Review_Page() throws InterruptedException {
	for(int i=0; i<13;i++) {
	    int a[]= {8,9,14,12,11,13,1,2,3,4,15,7,16};
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    WebElement secton = driver.findElement(By.xpath("//div[@id='ReviewApplication_frame"+a[i]+"']/div[1]"));
	    String text = secton.getText();
	    secton.click();
	    System.out.println(text);
}
}
}
