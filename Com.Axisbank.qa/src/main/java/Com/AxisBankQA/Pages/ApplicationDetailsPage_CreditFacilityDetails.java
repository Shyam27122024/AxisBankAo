package Com.AxisBankQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApplicationDetailsPage_CreditFacilityDetails {
	
    @FindBy(xpath="//*[@id='rbtnAppDetDoYouHaveCreditFacility_0']/parent::div/div") private WebElement POA_Do_You_Have_Any_Credit_Facilities_From_Other_BanksSameAs_reg;
    @FindBy(id="ddlEntityBankName") private WebElement BankName;
    @FindBy(id="txtEntityBankNameCity") private WebElement Branch_Name_And_City;
  
    @FindBy(id="txtEntityCashCreditedOverDraftedLimit") private WebElement Cash_Credit_and_Overdraft_Sanctioned_Limit;
    @FindBy(id="txtEntityFundNonFundSanctionAmount") private WebElement Funds_and_Non_Funds_Based_Sanctioned_Limits;
    @FindBy(id="txtEntitySanctionAmounts") private WebElement SanctionedAmount;
    @FindBy(id="btnEntityNext") private WebElement Cancel_Butn;
    @FindBy(id="btnEntityNext") private WebElement AddToListBtn;
    
    
    public ApplicationDetailsPage_CreditFacilityDetails(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    public void Select_Credit_Facility_Radio_Button() {
    	POA_Do_You_Have_Any_Credit_Facilities_From_Other_BanksSameAs_reg.click();
    }
    public void Select_Bank_Name() {
	    Select select3 = new Select(BankName);
	    select3.selectByValue("Test1"); 
    }
    
    public void Set_Branch_Name_And_City() {
    	Branch_Name_And_City.sendKeys("Noida");
    }
    public void Set_CC_Limit() {
    	Cash_Credit_and_Overdraft_Sanctioned_Limit.sendKeys("500000");
    }
    public void Set_FNF_Limit() {
    	Funds_and_Non_Funds_Based_Sanctioned_Limits.sendKeys("400000");
    }
    
    public void Set_Sanction_Amount() {
    	SanctionedAmount.sendKeys("300000");
    }
     
    public void Click_On_Cancel_Btn() {
    	Cancel_Butn.click();
    }
    
    public void Click_On_AddToListBtn() {
    	AddToListBtn.click();
    }

}
