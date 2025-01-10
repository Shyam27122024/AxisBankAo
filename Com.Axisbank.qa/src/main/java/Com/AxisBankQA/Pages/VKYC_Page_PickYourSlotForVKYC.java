package Com.AxisBankQA.Pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.AxisBankQA.Base.TestBase;

public class VKYC_Page_PickYourSlotForVKYC extends TestBase {
	
	@FindBy(id="dateVKYCDatePicker") private WebElement timeForEkyc;
	@FindBy(id="//label[text()='Select A Time Slot']") private WebElement Unfocus;
	@FindBy(id="navigationNextBtn") private WebElement nextBtn;

	
	public VKYC_Page_PickYourSlotForVKYC(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	} 
	
	public void Selct_timeForEkyc() {
		timeForEkyc.sendKeys("16/04/2025");
		Unfocus.click();
	}
	
	public void select_time_slot() throws InterruptedException {
		 for(int i=0; i<6;i++) {
		    	int a[]= {11, 12,13,14,15,16};
		    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    	Thread.sleep(1000);
		    	WebElement secton3 = driver.findElement(By.id("VKYC_Tile"+a[i]+""));
		    	String text = secton3.getText();
		    	secton3.click();
		    	System.out.println(text);
		    }
		
	}
	
	public void Click_On_NextBtn() {
		nextBtn.click();
	}
}
