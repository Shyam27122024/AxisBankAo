package Com.AxisBankQA.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.AxisBankQA.Base.TestBase;

public class VKYC_Page_Verification_Via_Video extends TestBase{
	@FindBy(xpath="//*[@id='DIY_PORTAL_VKYC_Org_PANCARD_label']/parent::div/div") private WebElement PANcardReady;
	@FindBy(xpath="//*[@id='DIY_PORTAL_VKYC_Internet_Conntect_label']/parent::div/div") private WebElement InterNetconnection;
	@FindBy(xpath="//*[@id='DIY_PORTAL_VKYC_Well_Environment']/parent::div/div") private WebElement litEnviornment;
	@FindBy(xpath="//*[@id='DIY_PORTAL_VKYC_Terms_And_Condition']/parent::div/div") private WebElement VideoKycProcess;
	@FindBy(xpath="//*[@id='rbVKYCSkip_0']/parent::div/div") private WebElement SkipVideokyc;
    @FindBy(id="navigationNextBtn") private WebElement NextBtn;
    
	
	
	public VKYC_Page_Verification_Via_Video(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void select_PANcardReady_CheckBox() {
		PANcardReady.click();
	}
	
	public void select_InterNetconnection_checkBox() {
		InterNetconnection.click();
	}
	
	public void Select_LitEnvironment_checkBox() {
		litEnviornment.click();
	}
	
	public void SelectVideoKycProcess_checkBox() {
		VideoKycProcess.click();
	}
	
	public void SelectSkipVideokyc_RadioBtn() {
		SkipVideokyc.click();
		NextBtn.click();
	}

	public void selectButton() throws InterruptedException {
		 for(int i=0; i<3;i++) {
		        int a[]= {2,3,17};
		    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    	Thread.sleep(1000);
		    	WebElement secton2 = driver.findElement(By.id("VKYC_Tile"+a[i]+""));
		    	secton2.click();
	
		    }
	}
	
}
