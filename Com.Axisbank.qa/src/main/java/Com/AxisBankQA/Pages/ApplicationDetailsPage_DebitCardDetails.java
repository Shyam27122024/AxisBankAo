package Com.AxisBankQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationDetailsPage_DebitCardDetails {

	@FindBy(id="ddlAppDetailsFormatToDesiredIndividualCard") private WebElement SelectFormatFor_Indi;
	@FindBy(id="txtAppDetailsNameToBePrintedCard") private WebElement NamePrintOnCard;
	
	public ApplicationDetailsPage_DebitCardDetails(WebDriver driver) {
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
