package Com.AxisBankQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.AxisBankQA.Base.TestBase;

public class LOA_Application_DetailsPage_BussinessDetails extends TestBase{
	//Declaration
		@FindBy(id="txtReviewAppPorposeAccOpen") private WebElement EntPurpose_of_Account_Opening;
		@FindBy(id="DIY_PORTAL_APPLICANT_DETAILS_Occupation_Type") private WebElement OccupationType;
		@FindBy(id="DIY_PORTAL_APPLICANT_DETAILS_Occupation_Code") private WebElement OccupationCode;
		@FindBy(id="txtRANatureOfBusiness") private WebElement NatureOfBussineess;
		@FindBy(id="DIY_PORTAL_APPLICANT_DETAILS_Source_Of_Funds") private WebElement SourceOfFunds;
		@FindBy(id="DIY_PORTAL_LOA_APPLICANT_DET_ANNUAL_INCOME") private WebElement AnnualIncome;
		@FindBy(id="txtRANetWorth") private WebElement NetWorths;
		@FindBy(id="txtRABussinessInYears") private WebElement NumberOfYearsInBuss;
		@FindBy(id="txtRABussinessInMonths") private WebElement Months;
		
		//Initialization
		public LOA_Application_DetailsPage_BussinessDetails(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void Set_PurposeOfAccountOpen() {
			EntPurpose_of_Account_Opening.sendKeys("Personal Account");
		}
		public void Select_OccupationType() {
//		    Select select94 = new Select(OccupationType);
//		    select94.selectByValue("Yes");
		}
		
		public void Select_OccupationCode() {
//		    Select select94 = new Select(OccupationCode);
//		    select94.selectByValue("Yes");
		}
		
		public void Set_NatureOfBuss() {
			NatureOfBussineess.sendKeys("Personal");
		}
		
		public void Select_SourceOfFunds() {
//		    Select select95 = new Select(SourceOfFunds);
//		    select95.selectByValue("Yes");
		}
		
		public void Set_AnnualIncome() {
			AnnualIncome.sendKeys("80000");
		}
		
		public void Set_NetWorths() {
			NetWorths.sendKeys("80000");
		}
		public void Set_NoOfYearesInBuss() {
			NumberOfYearsInBuss.sendKeys("9");
		}
		
		public void Set_NoOfMontsInBuss() {
			Months.sendKeys("11");
		}
}
