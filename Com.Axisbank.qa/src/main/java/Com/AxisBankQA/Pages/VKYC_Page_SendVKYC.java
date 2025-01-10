package Com.AxisBankQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.AxisBankQA.Base.TestBase;

public class VKYC_Page_SendVKYC extends TestBase {
	@FindBy(id="ddlVKYCPrimaryHolder") private WebElement PrimayHolder;
	
	public VKYC_Page_SendVKYC(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SelectPrimaryHolder() {
		  Select select123 = new Select(PrimayHolder);
		   select123.selectByValue("Test1");
	}
	
	
}
