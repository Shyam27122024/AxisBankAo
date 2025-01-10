package Com.AxisBankQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationDetailsPage_Add_LOA {
	
	@FindBy(xpath="//*[@id='DIY_PORTAL_APPLICANT_DETAILS_Do_you_wish_to_add_LOA_1_label']/parent::div/div") private WebElement LOANoBtn;
	@FindBy(id="navigationNextBtn") private WebElement Nextbtton;

	public ApplicationDetailsPage_Add_LOA(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SelectRadioBtn_LOA() {
		LOANoBtn.click();
	
	}
	
	public void SelectNextBtn() {
		Nextbtton.click();
	
	}
	
}
