package Com.AxisBankQA.Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Com.AxisBankQA.Base.TestBase;

public class VKYC_Page_SelectPreferredCommunicationLanguage extends TestBase {
	
	public void Verify_PrefferedCommLaungauge() throws InterruptedException {
	    for(int i=0; i<6;i++) {
	        int a[]= {4,5,7,8,9,10};
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	Thread.sleep(1000);
	    	WebElement secton2 = driver.findElement(By.id("VKYC_Tile"+a[i]+""));
	    	String text = secton2.getText();
	    	secton2.click();
	    	System.out.println(text);
	    }
	}

}
