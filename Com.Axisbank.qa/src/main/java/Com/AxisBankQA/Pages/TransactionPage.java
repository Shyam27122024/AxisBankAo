package Com.AxisBankQA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;




public class TransactionPage  {
	@FindBy(xpath="//button[text()=' New Transaction']")private WebElement Btn;
	
	public TransactionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
		
	}
	
	public void VerifyTransactionBtn() {

		Assert.assertTrue(Btn.isDisplayed(), "Transction Btn is not displayed.");
		Reporter.log("VerifyTransctionBtn",true);
		Btn.click();

}

}