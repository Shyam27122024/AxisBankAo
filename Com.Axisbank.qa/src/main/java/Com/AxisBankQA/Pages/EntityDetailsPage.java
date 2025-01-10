package Com.AxisBankQA.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EntityDetailsPage {
	
//	Entity Proof of Identity
	
	@FindBy(id="ddlEntitySearchGSTNumber") private WebElement GSTDropDown;
	@FindBy(xpath="//*[@id='DIY_PORTAL_SOP_ENTITY_DETAIL_UPDATE_THE_SELECTED_GST_1']/parent::div/div") private WebElement UpadteGST_Radio_Button;
    @FindBy(id="ddlEntitySelectDocument") private WebElement SelectDocument;
    @FindBy(id="txtEntityRegistrationNumber") private WebElement Udyam_Reg_No;
    @FindBy(xpath="//*[@ID='DIY_PORTAL_SOP_ENTITY_DETAIL_I_AUTHORISE_AXIS_BANK_T_FETC']/parent::div") private WebElement I_authorise_Axis_Bank_to_fetch_and_store_data_from_API_setu;
    
    
//    Entity Proof of Address
    
    @FindBy(id="EntityDetails_label11") private WebElement Change_Add_Btn;
//    @FindBy(id="ddlEntityRegisteredAddress") private WebElement Change_Add_Type;  Development
    @FindBy(xpath="//*[@id='rbtnEntityAddressSameAsRegisterAddress_1']/parent::div/div")private WebElement POA_SameAs_Reg;
    @FindBy(id="ddlEntitySelectBankBranch") private WebElement Select_Bank_Branch; 
    @FindBy(id="ddlEntityPreferedLanguageForCommnucation") private WebElement Comm_Language;
    
 // Credit Facility Details
    
    @FindBy(xpath="//*[@id='rbtnEntityDoYouHaveCreditFacility_0_label']/parent::div/div") private WebElement POA_Do_You_Have_Any_Credit_Facilities_From_Other_BanksSameAs_reg;
    @FindBy(id="ddlEntityBankName") private WebElement BankName;
    @FindBy(id="txtEntityBankNameCity") private WebElement Branch_Name_And_City;
    
    @FindBy(id="txtEntityCashCreditedOverDraftedLimit") private WebElement Cash_Credit_and_Overdraft_Sanctioned_Limit;
    @FindBy(id="txtEntityFundNonFundSanctionAmount") private WebElement Funds_and_Non_Funds_Based_Sanctioned_Limits;
    @FindBy(id="txtEntitySanctionAmounts") private WebElement SanctionedAmount;
    @FindBy(id="btnEntityNext") private WebElement Cancel_Butn;
    @FindBy(id="btnEntityNext") private WebElement AddToListBtn;
    
  //Account Details
    
    @FindBy(id="ddlEntityPurposeOfAccountOpeaning") private WebElement PurposeOFAccOpening;
    @FindBy(id="ddlEntityNatureOfBusiness") private WebElement NatureOfBussiness;
    @FindBy(id="ddlEntityOccupation") private WebElement Occupation;
    
    //Profile Sheet
    
    
    @FindBy(id="txtEntityAnnualTurnover") private WebElement Annual_Turnover;
    @FindBy(id="txtEntityNetworth") private WebElement NetWorth;
    @FindBy(id="txtEntityNetProfit") private WebElement NetWorth_LFA;
    @FindBy(id="ddlEntitySourceOfFund") private WebElement SourceOfFunds;
    @FindBy(id="txtEntityEndUseFunds") private WebElement End_Use_Of_Funds;
    
    //No Of Years In Business
    
    @FindBy(id="DIY_PORTAL_SOP_ENTITY_DETAIL_YEARS") private WebElement Years;
    @FindBy(id="DIY_PORTAL_SOP_ENTITY_DETAIL_MONTHS") private WebElement Month;
    
 // Principle Place Of Operation
    
    
    @FindBy(id="ddlEntityPlaceOfOperation") private WebElement PPOBO;
  //Whether Involued In Import/ Export
    
    
    @FindBy(id="ddlEntityinvolvedImportExport") private WebElement ImportExport;
  //Import/ Export Code
    
    @FindBy(id="txtEntityImportExport") private WebElement ImportExportCode;
    @FindBy(id="btnEntityAuthenticate") private WebElement AuthenticateBtn;
    //Export Turnover
    
    @FindBy(id="txtEntityExportTurnOver") private WebElement Exturnover;
    //Percentage Of Export Under LC 
    
    
    @FindBy(id="txtEntityPercentageOfExport") private WebElement ExportUnderLC;
    // Domasticsales_under_LC
    

    @FindBy(id="txtEntityImportTurnover") private WebElement ImportTurnOver;
    @FindBy(id="txtEntityPercentageOfImportUnderLc") private WebElement ImportUnderLC;
   
    
    @FindBy(xpath="//*[@id='rbtnEntityDomesticSalesUnderLc_1']/parent::div/div") private WebElement Domasticsales_under_LC;
  //Percentage Domestic Sales Under LC
    @FindBy(id="txtEntityPercentageOfSalesUnderLc") private WebElement PODSULC;
 // Domestic Purchase Under LC
    
    @FindBy(xpath="//*[@id='rbtnEntityDomesticPurchaseLc_0_label']/parent::div/div") private WebElement DSULC;
 // Bank Gurantee
    
    @FindBy(xpath="//*[@id='rbtnEntityBankGurantee_0']/parent::div/div") private WebElement Button;
    
  //Approximate BG Volume Handle In Last FY 
    
    @FindBy(id="txtEntityApproxBGVolume") private WebElement BG_Volume;
    @FindBy(id="ddlEntityPrimaryLocation") private WebElement PrimaryLocations;
    
    
    // Channel Facilites--------------------------------------------------------
    
    @FindBy(xpath="//*[@id='DIY_PORTAL_SOP_ENTITY_DETAIL_ACCOUNT_STATEMENT_OPTION']/parent::div/div") private WebElement Account_Statement;
    @FindBy(xpath="//*[@id='DIY_PORTAL_SOP_ENTITY_DETAIL_E_STATEMENT']/parent::div/div") private WebElement Estatement;
    @FindBy(xpath="//*[@id='DIY_PORTAL_SOP_ENTITY_DETAIL_PRINTED_STATEMENT']/parent::div/div") private WebElement Printed_Statement;
    
  //Information On Other Products
    @FindBy(xpath="//*[@id='DIY_PORTAL_SOP_ENTITY_DETAIL_EMAIL']/parent::div/div") private WebElement Email;
    @FindBy(xpath="//*[@id='DIY_PORTAL_SOP_ENTITY_DETAIL_SMS']/parent::div/div") private WebElement SMS;
    @FindBy(xpath="//*[@id='DIY_PORTAL_SOP_ENTITY_DETAIL_PHONE_CALL']/parent::div/div") private WebElement PhoneCell;
//   Next Btn
    @FindBy(id="navigationNextBtn") private WebElement NextButton;
    

   
    
    public EntityDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    
    public void select_GST_DropDown() {
    	 Select selectGST = new Select(GSTDropDown);
    	 selectGST.selectByValue("Test1");
    	
    }
    
    public void select_GST_RadioBtn() {
    	UpadteGST_Radio_Button.click();
    }
    
    public void Select_Document() {
    	  Select select = new Select(SelectDocument);
  	      select.selectByValue("Test1");
    }
    
    public void Set_Udyam_Reg_No() {
    	Udyam_Reg_No.sendKeys("UDYAM-12345");
  }
    
    public void select_CheckBox_for_Auth_API() {
    	I_authorise_Axis_Bank_to_fetch_and_store_data_from_API_setu.click();
    }
    
    
//    Entity Proof of Address
    
    public void Select_Change_Add() {
    	
    }
    
    public void select_Reg_Add_Type() {
    	
    }
    
    public void Select_Radio_Btn_POA_SameAs_reg() {
    	POA_SameAs_Reg.click();
    	
    }
  
    public void selectBankBranch_DropDown() {
    Select select1 = new Select(Select_Bank_Branch);
    select1.selectByValue("Test1");
}
    public void select_Prefered_CommLang() {
	    Select selecd = new Select(Comm_Language);
	    selecd.selectByValue("Test1");
    }
    
    
    // Credit Facility Details-------------------------------------------
    
    public void Select_Credit_Facility_Radio_Button() {
    	POA_Do_You_Have_Any_Credit_Facilities_From_Other_BanksSameAs_reg.click();
    }
    public void Select_Bank_Name() {
	    Select select3 = new Select(BankName);
	    select3.selectByValue("Test1"); 
    }
    
    public void Set_Branch_Name_And_City() {
    	Branch_Name_And_City.sendKeys("Noida");
    }
    public void Set_CC_Limit() {
    	Cash_Credit_and_Overdraft_Sanctioned_Limit.sendKeys("500000");
    }
    public void Set_FNF_Limit() {
    	Funds_and_Non_Funds_Based_Sanctioned_Limits.sendKeys("400000");
    }
    
    public void Set_Sanction_Amount() {
    	SanctionedAmount.sendKeys("300000");
    }
    
    
    public void Click_On_Cancel_Btn() {
    	Cancel_Butn.click();
    }
    
    public void Click_On_AddToListBtn() {
    	AddToListBtn.click();
    }
    
    //Account Details -------------------------------------
    
    public void Select_PurposeOf_AccountOpen() {
    	 Select select4 = new Select(PurposeOFAccOpening);
 	     select4.selectByValue("Test1"); 
    }
    public void NatureOfBusiness() {
    	Select select5 = new Select(NatureOfBussiness);
	    select5.selectByValue("Test1");
   }
    
    public void Occupation() {
    	Select select6 = new Select(Occupation);
	    select6.selectByValue("Test1"); 
   }
    
    //Profile Sheet--------------------------
    
    public void Set_Annual_Turnover() {
    	Annual_Turnover.sendKeys("700000");
   }
    
    public void Set_NetWorth() {
    	NetWorth.sendKeys("700000");
   }
    
    public void Set_NetWorthLFA() {
    	NetWorth_LFA.sendKeys("600000");
    	
   }
    
    public void Select_SourceOfFunds() {
    	Select selectSOF = new Select(SourceOfFunds);
	    selectSOF.selectByValue("Test1"); 
   }
    public void set_End_Use_Of_Funds() {
    	End_Use_Of_Funds.sendKeys("100000");
   }
    
    public void set_NumbersOf_YearesIn_Buss() {
    	Years.sendKeys("10");
   }
    
    public void set_NumbersOf_Month_In_Buss() {
    	Month.sendKeys("10");
   }
    
    public void select_Principle_Place_Of_Buss() {
    	 Select select8 = new Select(PPOBO);
 	    select8.selectByValue("Test1");
   }
    
    public void select_Import_Export() {
    	 Select select9 = new Select(ImportExport);
 	     select9.selectByValue("EXPORT");
  }
    
    public void Set_ImportExportCode() {
    	ImportExportCode.sendKeys("ICE-12345");
 }
    public void Click_On_AuthenticateBtn() {
    	 AuthenticateBtn.click();
 }
    public void Set_Exturnover() {
    	Exturnover.sendKeys("40000");
}
    public void Set_ExportUnderLC() {
    	ExportUnderLC.sendKeys("10");
}
    
    public void Set_ImportTurnOver() {
    	ImportTurnOver.sendKeys("40000");
}
    public void Set_Import_UnderLC() {
    	ImportUnderLC.sendKeys("10");
}
    public void Click_On_Radio_Domasticsales_under_LC_Btn() {
    	Domasticsales_under_LC.click();
}
    
    public void Set_PODSULC() {
    	PODSULC.sendKeys("10");
}
    public void Click_On_Radio_Btn_DSULC() {
    	DSULC.click();
}    
    public void Click_On_Radio_Btn_Bank_Gurantee() {
    	Button.click();
}
    public void Set_BG_Volume() {
    	BG_Volume.sendKeys("2000");
}
    
    public void Select_Primary_Location() {
	    Select select11 = new Select(PrimaryLocations);
	    select11.selectByValue("Yes"); 
}
    
  //Channel Facilites-------------------------
    
    public void Select_CheckBox_AccountStatement() {
    	Account_Statement.click();
 }
    
    public void selectCheckbox_Estatement() {
    	Estatement.click();
 }
    public void selectCheckbox_Printed_Statement() {
    	Printed_Statement.click();
 }
    
    public void selectCheckbox_Email() {
    	Email.click();
 }
    public void selectCheckbox_SMS() {
    	SMS.click();
 }
    public void selectCheckbox_PhoneCell() {
    	PhoneCell.click();
 }
    
    public void select_Next_Btn() {
    	NextButton.click();
 }
    
    
}
