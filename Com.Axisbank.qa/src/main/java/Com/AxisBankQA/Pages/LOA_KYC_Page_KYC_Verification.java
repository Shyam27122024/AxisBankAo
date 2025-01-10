package Com.AxisBankQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.AxisBankQA.Base.TestBase;

public class LOA_KYC_Page_KYC_Verification extends TestBase{
	

	//Decliration ==>WebEliments
	
	@FindBy(id="txtMobileNumber_KYC") private WebElement MobileNumber;
	@FindBy(id="txtAadhaarNumber_KYC") private WebElement Aadhar;
	@FindBy(id="txtPanNumber_KYC") private WebElement PAN_No;
	@FindBy(id="txtNameAsPerPan_KYC") private WebElement Name;
	@FindBy(id="dateDateOfBirthAsPerPan_KYC") private WebElement DOB;
	@FindBy(id="navigationNextBtn") private WebElement ClickOnNextBtn;
	
	// initilization
	
	public LOA_KYC_Page_KYC_Verification(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Usages
	public void SetMobileNumber() {
		MobileNumber.sendKeys("9988776655");
	}

	public void SetAadharNumber() {
		Aadhar.sendKeys("872881405894");
	}
	public void SetPANNumber() {
		PAN_No.sendKeys("EYBPR4623R");
	}
	public void setName() {
		Name.sendKeys("Shyam");
	}
	public void SetDOB() {
		DOB.sendKeys("02/04/1998");
	}
	public void ClickOnDOB() {
		DOB.sendKeys("02/04/1998");
	}
	public void ClickSubmitButton() {
		ClickOnNextBtn.click();
	}
}	
