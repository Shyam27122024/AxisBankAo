package Com.AxisBankQA.Pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Com.AxisBankQA.Base.TestBase;


public class KYC_Screen extends TestBase {

	//Decliration ==>WebEliments
	
	@FindBy(id="txtMobileNumber_KYC") private WebElement MobileNumber;
	@FindBy(id="txtAadhaarNumber_KYC") private WebElement Aadhar;
	@FindBy(xpath="//*[@id='file_KYCVerification_Doclist3_1']/parent::div") private WebElement UploadDL;
	@FindBy(id="txtPanNumber_KYC") private WebElement PAN_No;
	@FindBy(id="txtNameAsPerPan_KYC") private WebElement Name;
	@FindBy(id="dateDateOfBirthAsPerPan_KYC") private WebElement DOB;
	@FindBy(id="navigationNextBtn") private WebElement submitbtn;
	
	// initilization
	
	public KYC_Screen(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Usages
	public void SetMobileNumber() {
		
		MobileNumber.sendKeys("9145043837");
	}

	public void SetAadharNumber() {
		Aadhar.sendKeys("872881405894");
	}	
	
	public void UploadDL() throws IOException {
		UploadDL.click();
		
	}
	public void SetPANNumber() {
		PAN_No.sendKeys("EYBPR4623R");
	}
	public void setName() {
		Name.sendKeys("Ankur Kumar");
	}
	public void SetDOB() {
		DOB.sendKeys("02/04/1998");
	}
	public void ClickOnDOB() {
		DOB.click();;
	}
	public void ClickSubmitButton() {
		submitbtn.click();
	}
}	

