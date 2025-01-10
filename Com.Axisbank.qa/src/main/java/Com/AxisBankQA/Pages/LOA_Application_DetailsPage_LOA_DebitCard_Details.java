package Com.AxisBankQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.AxisBankQA.Base.TestBase;

public class LOA_Application_DetailsPage_LOA_DebitCard_Details extends TestBase {
	@FindBy(id="ddlAppDetailsFormatToDesiredIndividualCard") private WebElement SelectFormatFor_Indi;
	@FindBy(id="txtAppDetailsNameToBePrintedCard") private WebElement NamePrintOnCard;
	
	public LOA_Application_DetailsPage_LOA_DebitCard_Details(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SelectFormatFor_Indi() {
//	      Select select99 = new Select(SelectFormatFor_Indi);
//	      select99.selectByValue("");
	}
	
	public void Set_NamePrintOnCard() {
		NamePrintOnCard.sendKeys("shyam narwade");
	}

}
