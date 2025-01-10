package Com.AxisBankQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.AxisBankQA.Base.TestBase;

public class ApplicationDetailsPage_PersoanlDetails extends TestBase {
	//Delclaration 
	@FindBy(id="txtAppDetlsEmailID") private WebElement EmailID;
	@FindBy(id="ddlAppDetailsMaritalStatus") private WebElement MaritalStatus;
	@FindBy(id="ddlAppDetailsEducationalQualification") private WebElement Qualifiaction;
	@FindBy(id="ddlAppDetailsPrefredLanguagecommnucation") private WebElement CommLanguage;
	@FindBy(id="txtAppDetlsEnterOTP") private WebElement EnterOTP;
	
	//Initialization
	
	public ApplicationDetailsPage_PersoanlDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 
	
	
	public void set_EmailId() {
		EmailID.sendKeys("shyamnarwade@gmai.com");
	}
	
	public void Select_Maritia_Status() {
		   Select select91 = new Select(MaritalStatus);
		    select91.selectByValue("Yes");
	}
	
	public void Select_Qualification() {
		    Select select92 = new Select(Qualifiaction);
		    select92.selectByValue("Yes");
	}

	public void Select_PrefredLanguagecommnucation() {
	    Select select93 = new Select(CommLanguage);
	    select93.selectByValue("Yes"); 
}
	public void Set_OTP() {
		EnterOTP.sendKeys("123456");
	}
	
}
