package Com.AxisBankQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.AxisBankQA.Base.TestBase;

public class ApplicationDetailsPage_AddressDetails extends TestBase {
	
	@FindBy(id="ddlAppDetailPermanentAddressType") private WebElement PermenAdd;
	@FindBy(xpath="//*[@id='rbtnAppDetailsCommAsPermanentAddress_1']/parent::div/div") private WebElement CommAddSameasPerm;
	@FindBy(id="ddlAppDetailsSelectBankBranch") private WebElement SelectBranch;
	@FindBy(xpath="//*[@id='rbtnAppDetailsCommnucationAddressSameAsRegistered_1']/parent::div/div") private WebElement CommAddSameasReg;
	@FindBy(id="ddlAppDetailsProofOfAddress") private WebElement SelectProofOfAdd;
	@FindBy(id="txtAppDetailsAddressAddressline1") private WebElement AddLine1;
	@FindBy(id="txtAppDetailsAddressAddressline2") private WebElement AddLine2;
	@FindBy(id="txtAppDetailsAddrsLandmark") private WebElement LandMark;
	@FindBy(id="DIY_PORTAL_APPLICANT_DETAILS_Comm_Reg_Add_Pincode") private WebElement Pincode;
	@FindBy(id="txtAppDetailsAddrsCity") private WebElement City;
	@FindBy(id="txtAppDetailsAddrsState") private WebElement State;
	@FindBy(xpath="//*[@name='ApplicationDetails_combo37']") private WebElement SelectCountry;

	public ApplicationDetailsPage_AddressDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SelectPerementAddress() {
//	    Select select95 = new Select(PermenAdd);
//	    select95.selectByValue("Yes");
	}	
	
	public void SelectRadioBtn_CommAddSameasPerm() {
		CommAddSameasPerm.click();
	}	
	
	public void Select_Branch() {
//	    Select select96 = new Select(SelectBranch);
//	    select96.selectByValue("Yes");
	}
	
	public void SelectRadioBtn_CommAddSameasReg() {
		CommAddSameasReg.click();
	}	
	public void SelectProofOfAddress() {
		CommAddSameasReg.click();
	}
	public void SetAddressLine1() {
		AddLine1.sendKeys("Noida sector 137");
	}
	public void SetAddressLine2() {
		AddLine2.sendKeys("Noida");
	}
	
	public void Set_Landmark() {
		LandMark.sendKeys("Newgen");
	}
	
	public void Set_Pincode() {
		Pincode.sendKeys("401302");
	}
	public void Set_City() {
		City.sendKeys("Noida");
	}
	
	public void Set_State() {
		State.sendKeys("UP");
	}
	
	public void SelectCountry() {
		 Select selectC = new Select(SelectCountry);
		 selectC.selectByValue("india"); 
	}
	
}
