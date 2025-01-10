package Com.AxisBankQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationDetailsPage_FamilyDetails {
	
	@FindBy(id="txtAppDetlsMotherFirstName") private WebElement MothersFirstName;
	@FindBy(id="txtAppDetlsMotherMiddleName") private WebElement MothersMiddleName;

	@FindBy(id="txtAppDetlsMotherLastName") private WebElement MothersLastName;
	@FindBy(id="txtAppDetlsMotherMaidenName") private WebElement MothersMaidinName;


	public ApplicationDetailsPage_FamilyDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SetMothersFirstName() {
		MothersFirstName.sendKeys("Bhagyashree");
	}
	
    public void SetMothersMiddleName() {
    	MothersMiddleName.sendKeys("Shyam");
	}
    
    public void SetMothersLastName() {
    	MothersLastName.sendKeys("Narwade");
 	}
    
    public void SetMothersMadainName() {
    	MothersMaidinName.sendKeys("Baburao");
		
 	}

}
