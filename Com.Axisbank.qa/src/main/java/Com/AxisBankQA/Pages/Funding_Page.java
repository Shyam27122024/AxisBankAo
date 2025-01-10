package Com.AxisBankQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.AxisBankQA.Base.TestBase;

public class Funding_Page extends TestBase{
	
	@FindBy(id="txtFundingAmount") private WebElement FundAmount;
	@FindBy(id="ddlFundingHolder") private WebElement FundHold;
	@FindBy(id="btntFundingDetailsRazorpay") private WebElement RazorpayBtn;
	@FindBy(id="navigationNextBtn") private WebElement NextBtn;
	
	public Funding_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void setFundAmount() {
		FundAmount.sendKeys("30000");
	}
	
	public void Select_FundHold() {
		Select select122 = new Select(FundHold);
	    select122.selectByValue("Test1");
	}
	
	public void ClickOnRazorapy() {
		RazorpayBtn.click();
	}
	
	public void ClickNextBtn() {
		NextBtn.click();
	}

}
