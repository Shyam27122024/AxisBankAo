package Com.AxisBankQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Com.AxisBankQA.Base.TestBase;

public class LOA_Application_DetailsPage_FATCA_Details extends TestBase {
	@FindBy(id="DIY_PORTAL_LOA_APPLICANT_DET_FTCA_ADDRESS_TYPE_FOR_TAX_PU") private WebElement TaxPurposeAdd;
	@FindBy(id="ddlAppDetailsAddressForTaxPurpose") private WebElement AddrForTaxPurpose;
	@FindBy(id="txtAppDetailsFtcaAddressLine") private WebElement AddressLine1;
	@FindBy(id="txtAppDetailsFtcaAddressLine2") private WebElement AddressLine2;
	@FindBy(id="txtAppDetailsFtcaLandmark") private WebElement LandMarks;
	@FindBy(id="txtAppDetailsFtcaPincode") private WebElement Pincodes;
	@FindBy(id="ddlAppDetailsFtcaCity") private WebElement Citys;
	@FindBy(id="ddlAppDetailsFtcaState") private WebElement Ststes;
	@FindBy(id="DIY_PORTAL_APPLICANT_DETAILS_Ftca_Country") private WebElement Countrys;
	@FindBy(xpath="//*[@id='rbtnAppDetailsFtcataxresident_0_label']/parent::div/div") private WebElement TaxResistance;
	@FindBy(id="navigationNextBtn") private WebElement NextBtn;
	
	
	public LOA_Application_DetailsPage_FATCA_Details(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void SelectTaxPurposeAddress() {
		 Select select100 = new Select(TaxPurposeAdd);
	     select100.selectByValue("Test1");
	}
	
	public void SelectAddrForTaxPurpose() {
		 Select select100 = new Select(AddrForTaxPurpose);
	     select100.selectByValue("Test1"); 
	}
	
	public void SetAddressline1() {
		AddressLine1.sendKeys("Noida");
	}
	public void SetAddressLine2() {
		AddressLine2.sendKeys("Noida");
	}
	
	public void SetLandMarks() {
		LandMarks.sendKeys("Neagen");
	}
	
	public void SetPincodes() {
		Pincodes.sendKeys("402103");
	}
	public void SelectCitys() {
		 Select select102 = new Select(Citys);
		 select102.selectByValue("Test1");
	}
	
	public void SelectStstes() {
	    Select select103 = new Select(Ststes);
	    select103.selectByValue("Test1");
	}
	
	public void SelectCountrys() {
	    Select select104 = new Select(Countrys);
	    select104.selectByValue("Test1");
	}

	public void SelectTaxResistance() {
		 TaxResistance.click();
	}
	public void Click_On_NextBtn() {
		NextBtn.click();
	}
	

}
