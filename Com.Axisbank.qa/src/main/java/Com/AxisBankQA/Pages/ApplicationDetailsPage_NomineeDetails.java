package Com.AxisBankQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApplicationDetailsPage_NomineeDetails {
	
	@FindBy(xpath="//*[@id='rbtnAppDetailsAddNominee_1']/parent::div/div") private WebElement SelectNoRadioBtn;
	@FindBy(id="ddlAppDetailsNotNominating") private WebElement SelectReasonForNominating;
	
	public ApplicationDetailsPage_NomineeDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SelectNoRadioBtn(){
		SelectNoRadioBtn.click();
		
	}
	
	public void Select_ReasonForNominating(){
		  Select select98 = new Select(SelectReasonForNominating);
	      select98.selectByValue("I dont wish to nominate anyone"); 
	}

}
