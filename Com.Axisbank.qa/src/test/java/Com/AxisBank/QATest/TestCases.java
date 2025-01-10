package Com.AxisBank.QATest;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Com.AxisBankQA.Base.TestBase;
import Com.AxisBankQA.Pages.ApplicationDetailsPage_NomineeDetails;
import Com.AxisBankQA.Pages.ApplicationDetailsPage_Add_LOA;
import Com.AxisBankQA.Pages.ApplicationDetailsPage_AddressDetails;
import Com.AxisBankQA.Pages.ApplicationDetailsPage_BussinessDetails;
import Com.AxisBankQA.Pages.ApplicationDetailsPage_CreditFacilityDetails;
import Com.AxisBankQA.Pages.ApplicationDetailsPage_DebitCardDetails;
import Com.AxisBankQA.Pages.ApplicationDetailsPage_FATCA_Details;
import Com.AxisBankQA.Pages.ApplicationDetailsPage_FamilyDetails;
import Com.AxisBankQA.Pages.ApplicationDetailsPage_PersoanlDetails;
import Com.AxisBankQA.Pages.Application_Review_Page;
import Com.AxisBankQA.Pages.ConfigurationPage_AccountDetails;
import Com.AxisBankQA.Pages.EntityDetailsPage;
import Com.AxisBankQA.Pages.Funding_Page;
import Com.AxisBankQA.Pages.KYC_Screen;
import Com.AxisBankQA.Pages.LOA_Application_DetailsPage_AddressDetails;
import Com.AxisBankQA.Pages.LOA_Application_DetailsPage_BussinessDetails;
import Com.AxisBankQA.Pages.LOA_Application_DetailsPage_FATCA_Details;
import Com.AxisBankQA.Pages.LOA_Application_DetailsPage_FamilyDetails;
import Com.AxisBankQA.Pages.LOA_Application_DetailsPage_LOA_DebitCard_Details;
import Com.AxisBankQA.Pages.LOA_Application_DetailsPage_PersonalDetails;
import Com.AxisBankQA.Pages.LOA_KYC_Page_KYC_Verification;
import Com.AxisBankQA.Pages.TransactionPage;
//import Com.AxisBankQA.Pages.VKYC_Page_PickYourSlotForVKYC;
//import Com.AxisBankQA.Pages.VKYC_Page_SelectPreferredCommunicationLanguage;
import Com.AxisBankQA.Pages.VKYC_Page_SendVKYC;
import Com.AxisBankQA.Pages.VKYC_Page_Verification_Via_Video;
import Com.AxisBankQA.Utilities.Utils;

public class TestCases extends TestBase {
	
	// Browser setup ==> validations apply ==> browser close.
	
	@BeforeClass
	public void setup() throws EncryptedDocumentException, IOException {
		CrossBrowserTesting("chrome");
		
	}
	@AfterClass
	public void teardown() {
		TestBase.driver.close();
	}
	
	@Test(priority=1)
	public void VerifyTrasactionPage() {
		TransactionPage tp= new TransactionPage(TestBase.driver);
		tp.VerifyTransactionBtn();
	}
	@Test(priority=2)
	public void KYC_ScreenTest_Positive() throws IOException, InterruptedException {
		KYC_Screen KYC = new KYC_Screen(TestBase.driver);
		KYC.SetMobileNumber();
		KYC.SetAadharNumber();
		KYC.UploadDL();
		Utils.FileUpload();
		KYC.SetPANNumber();
		KYC.setName();
		KYC.SetDOB();
		KYC.ClickOnDOB();
		KYC.ClickSubmitButton();
		
	}
	@Test(priority=3)
	public void Verify_Entity_Details_POI_Screen() {
		EntityDetailsPage POI_Screen = new EntityDetailsPage(TestBase.driver);
		POI_Screen.select_GST_DropDown();
		POI_Screen.select_GST_RadioBtn();
		POI_Screen.Select_Document();
		POI_Screen.Set_Udyam_Reg_No();
		POI_Screen.select_CheckBox_for_Auth_API();
	}
	@Test(priority=4)
	public void Verify_Entity_Details_POA_Screen() {
		EntityDetailsPage POA_Screen = new EntityDetailsPage(TestBase.driver);
//		POA_Screen.Select_Change_Add();
//		POA_Screen.select_Reg_Add_Type();
		POA_Screen.Select_Radio_Btn_POA_SameAs_reg();
		POA_Screen.selectBankBranch_DropDown();
		POA_Screen.select_Prefered_CommLang();
	}
		@Test(priority=5)
		public void Verify_Credit_Facility_Details_Screen() {
			EntityDetailsPage CF_Screen = new EntityDetailsPage(TestBase.driver);
			CF_Screen.Select_Credit_Facility_Radio_Button();
			CF_Screen.Select_Bank_Name();
			CF_Screen.Set_Branch_Name_And_City();
			CF_Screen.Set_CC_Limit();
			CF_Screen.Set_FNF_Limit();
			CF_Screen.Set_Sanction_Amount();
			CF_Screen.Click_On_Cancel_Btn();
			CF_Screen.Click_On_AddToListBtn();
	}
		
		
	@Test(priority=6)
	public void Verify_Entity_Details_Account_Details_Screen() {
		EntityDetailsPage AccountDetails_Screen = new EntityDetailsPage(TestBase.driver);
		AccountDetails_Screen.Select_PurposeOf_AccountOpen();
		AccountDetails_Screen.NatureOfBusiness();
		AccountDetails_Screen.Occupation();
		AccountDetails_Screen.Select_Credit_Facility_Radio_Button();
	}
	
	@Test(priority=7)
	public void Verify_Entity_Details_Profile_Sheet_Screen() {
		EntityDetailsPage Profile_Sheet_Screen = new EntityDetailsPage(TestBase.driver);
		Profile_Sheet_Screen.Set_Annual_Turnover();
		Profile_Sheet_Screen.Set_NetWorth();
		Profile_Sheet_Screen.Set_NetWorthLFA();
		Profile_Sheet_Screen.Select_SourceOfFunds();
		Profile_Sheet_Screen.set_End_Use_Of_Funds();
		Profile_Sheet_Screen.set_NumbersOf_YearesIn_Buss();
		Profile_Sheet_Screen.set_NumbersOf_Month_In_Buss();
		Profile_Sheet_Screen.select_Principle_Place_Of_Buss();
		Profile_Sheet_Screen.select_Import_Export();
		Profile_Sheet_Screen.Set_ImportExportCode();
		Profile_Sheet_Screen.Click_On_AuthenticateBtn();
		Profile_Sheet_Screen.Set_Exturnover();
		Profile_Sheet_Screen.Set_ExportUnderLC();
		Profile_Sheet_Screen.Set_ImportTurnOver();
		Profile_Sheet_Screen.Set_Import_UnderLC();
		Profile_Sheet_Screen.Click_On_Radio_Domasticsales_under_LC_Btn();
		Profile_Sheet_Screen.Set_PODSULC();
		Profile_Sheet_Screen.Click_On_Radio_Btn_DSULC();
		Profile_Sheet_Screen.Click_On_Radio_Btn_Bank_Gurantee();
		Profile_Sheet_Screen.Set_BG_Volume();
		Profile_Sheet_Screen.Select_Primary_Location();
	}
	@Test(priority=8)
	public void Verify_Entity_Details_Chennel_Facility_Screen() {
		EntityDetailsPage Chennel_Facility_Screen = new EntityDetailsPage(TestBase.driver);
		Chennel_Facility_Screen.Select_CheckBox_AccountStatement();
		Chennel_Facility_Screen.selectCheckbox_Estatement();
		Chennel_Facility_Screen.selectCheckbox_Printed_Statement();
		Chennel_Facility_Screen.selectCheckbox_Email();
		Chennel_Facility_Screen.selectCheckbox_SMS();
		Chennel_Facility_Screen.selectCheckbox_PhoneCell();
		Chennel_Facility_Screen.select_Next_Btn();
	}
	
	@Test(priority=9)
	public void Verify_ApplicationDetailsPage_PersoanlDetails() {
		ApplicationDetailsPage_PersoanlDetails PersonalDetails= new  ApplicationDetailsPage_PersoanlDetails(TestBase.driver);
		PersonalDetails.set_EmailId();
		PersonalDetails.Select_Maritia_Status();
		PersonalDetails.Select_Qualification();
//		PersonalDetails.Select_PrefredLanguagecommnucation();
		PersonalDetails.Set_OTP();
	}
	
	@Test(priority=10)
	public void Verify_ApplicationDetailsPage_BusinessDetails() {
		ApplicationDetailsPage_BussinessDetails BussDetails= new  ApplicationDetailsPage_BussinessDetails(TestBase.driver);
//		BussDetails.Set_PurposeOfAccountOpen();
//		BussDetails.Select_OccupationType();
//		BussDetails.Select_OccupationCode();
//		BussDetails.Set_NatureOfBuss();
//		BussDetails.Select_SourceOfFunds();
		BussDetails.Set_AnnualIncome();
		BussDetails.Set_NetWorths();
		BussDetails.Set_NoOfYearesInBuss();
		BussDetails.Set_NoOfMontsInBuss();
		
	}
	
	@Test(priority=11)
	public void Verify_ApplicationDetailsPage_FamilyDetails() {
		
		ApplicationDetailsPage_FamilyDetails FamilyDetails = new ApplicationDetailsPage_FamilyDetails(TestBase.driver);
		FamilyDetails.SetMothersFirstName();
		FamilyDetails.SetMothersMiddleName();
		FamilyDetails.SetMothersLastName();
		FamilyDetails.SetMothersMadainName();
	}
	
	@Test(priority=12)
	public void Verify_ApplicationDetailsPage_AddressDetails() {
		
		ApplicationDetailsPage_AddressDetails AddressDetails = new ApplicationDetailsPage_AddressDetails(TestBase.driver);
//		AddressDetails.SelectPerementAddress();
		AddressDetails.SelectRadioBtn_CommAddSameasPerm();
//		AddressDetails.Select_Branch();
		AddressDetails.SelectRadioBtn_CommAddSameasReg();
//		AddressDetails.SelectProofOfAddress();
		AddressDetails.SetAddressLine1();
		AddressDetails.SetAddressLine2();
		AddressDetails.Set_Landmark();
		AddressDetails.Set_Pincode();
		AddressDetails.Set_City();
		AddressDetails.Set_State();
		AddressDetails.SelectCountry();
		
	}
	
	@Test(priority=13)
	public void Verify_ApplicationDetailsPage_AddNominee() {
		
		ApplicationDetailsPage_NomineeDetails AddNominee= new ApplicationDetailsPage_NomineeDetails(TestBase.driver);
		AddNominee.SelectNoRadioBtn();
		AddNominee.Select_ReasonForNominating();
	}
	
	@Test(priority=14)
	public void Verify_ApplicationDetailsPage_CreditFacilityDetails() {
		ApplicationDetailsPage_CreditFacilityDetails CreditFacility = new ApplicationDetailsPage_CreditFacilityDetails(TestBase.driver);
		CreditFacility.Select_Credit_Facility_Radio_Button();
//		CreditFacility.Select_Bank_Name();
		CreditFacility.Set_Branch_Name_And_City();
		CreditFacility.Set_CC_Limit();
		CreditFacility.Set_FNF_Limit();
		CreditFacility.Set_Sanction_Amount();
		CreditFacility.Click_On_Cancel_Btn();
		CreditFacility.Click_On_AddToListBtn();
}
	
	@Test(priority=15)
	public void Verify_ApplicationDetailsPage_DebitCardDetails() {
		ApplicationDetailsPage_DebitCardDetails DebitCardDetails = new ApplicationDetailsPage_DebitCardDetails(TestBase.driver);
//		DebitCardDetails.SelectFormatFor_Indi();
		DebitCardDetails.Set_NamePrintOnCard();
	}
	@Test(priority=16)
	public void Verify_ApplicationDetailsPage_FATCA_Details() {
		ApplicationDetailsPage_FATCA_Details FATCA_Details= new ApplicationDetailsPage_FATCA_Details(TestBase.driver);
		FATCA_Details.SelectTaxPurposeAddress();
		FATCA_Details.SelectAddrForTaxPurpose();
		FATCA_Details.SetAddressline1();
		FATCA_Details.SetAddressLine2();
		FATCA_Details.SetLandMarks();
		FATCA_Details.SetPincodes();
		FATCA_Details.SelectCitys();
//		FATCA_Details.SelectStstes();
//		FATCA_Details.SelectCountrys();
		FATCA_Details.SelectTaxResistance();
	}
	
	@Test(priority=17)
	public void Verify_ApplicationDetailsPage_Add_LOA(){
		ApplicationDetailsPage_Add_LOA Add_LOA = new ApplicationDetailsPage_Add_LOA(TestBase.driver);
		Add_LOA.SelectRadioBtn_LOA();
		Add_LOA.SelectNextBtn();
		}
	@Test(priority=18)
	public void Verify_LOA_KYC_Screen() {
		LOA_KYC_Page_KYC_Verification LOA_KYC = new LOA_KYC_Page_KYC_Verification(TestBase.driver);
		LOA_KYC.SetMobileNumber();
		LOA_KYC.SetAadharNumber();
		LOA_KYC.SetPANNumber();
		LOA_KYC.setName();
		LOA_KYC.SetDOB();
		LOA_KYC.ClickOnDOB();
		LOA_KYC.ClickSubmitButton();
	}
	
	@Test(priority=19)
	public void Verify_LOA_Application_DetailsPage_PersonalDetails() {
		LOA_Application_DetailsPage_PersonalDetails LOA_PersonalDetails= new  LOA_Application_DetailsPage_PersonalDetails(TestBase.driver);
		LOA_PersonalDetails.set_EmailId();
		LOA_PersonalDetails.Select_Maritia_Status();
		LOA_PersonalDetails.Select_Qualification();
//		LOA_PersonalDetails.Select_PrefredLanguagecommnucation();
		LOA_PersonalDetails.Set_OTP();
	}
	
	@Test(priority=20)
	public void Verify_LOA_ApplicationDetailsPage_BusinessDetails() {
		LOA_Application_DetailsPage_BussinessDetails LOABussDetails= new  LOA_Application_DetailsPage_BussinessDetails(TestBase.driver);
//		LOABussDetails.Set_PurposeOfAccountOpen();
//		LOABussDetails.Select_OccupationType();
//		LOABussDetails.Select_OccupationCode();
//		LOABussDetails.Set_NatureOfBuss();
//		LOABussDetails.Select_SourceOfFunds();
		LOABussDetails.Set_AnnualIncome();
		LOABussDetails.Set_NetWorths();
		LOABussDetails.Set_NoOfYearesInBuss();
		LOABussDetails.Set_NoOfMontsInBuss();
	}
	
	
	@Test(priority=21)
	public void Verify_LOA_ApplicationDetailsPage_FamilyDetails() {
		
		LOA_Application_DetailsPage_FamilyDetails LOA_FamilyDetails = new LOA_Application_DetailsPage_FamilyDetails(TestBase.driver);
		LOA_FamilyDetails.SetMothersFirstName();
		LOA_FamilyDetails.SetMothersMiddleName();
		LOA_FamilyDetails.SetMothersLastName();
		LOA_FamilyDetails.SetMothersMadainName();
	}
	
	@Test(priority=22)
	public void Verify_LOA_ApplicationDetailsPage_AddressDetails() {
		
		LOA_Application_DetailsPage_AddressDetails LOA_AddressDetails = new LOA_Application_DetailsPage_AddressDetails(TestBase.driver);
//		LOA_AddressDetails.SelectPerementAddress();
		LOA_AddressDetails.SelectRadioBtn_CommAddSameasPerm();
//		LOA_AddressDetails.Select_Branch();
		LOA_AddressDetails.SelectRadioBtn_CommAddSameasReg();
//		LOA_AddressDetails.SelectProofOfAddress();
		LOA_AddressDetails.SetAddressLine1();
		LOA_AddressDetails.SetAddressLine2();
		LOA_AddressDetails.Set_Landmark();
		LOA_AddressDetails.Set_Pincode();
		LOA_AddressDetails.Set_City();
		LOA_AddressDetails.Set_State();
//		LOA_AddressDetails.SelectCountry();
		
	}
	@Test(priority=23)
	public void Verify_LOA_ApplicationDetailsPage_DebitCardDetails() {
		LOA_Application_DetailsPage_LOA_DebitCard_Details LOA_DebitCardDetails = new LOA_Application_DetailsPage_LOA_DebitCard_Details(TestBase.driver);
//		LOA_DebitCardDetails.SelectFormatFor_Indi();
		LOA_DebitCardDetails.Set_NamePrintOnCard();
	}
	@Test(priority=24)
	public void Verify_LOA_ApplicationDetailsPage_FATCA_Details() {
		LOA_Application_DetailsPage_FATCA_Details LOA_FATCA_Details= new LOA_Application_DetailsPage_FATCA_Details(TestBase.driver);
		LOA_FATCA_Details.SelectTaxPurposeAddress();
		LOA_FATCA_Details.SelectAddrForTaxPurpose();
		LOA_FATCA_Details.SetAddressline1();
		LOA_FATCA_Details.SetAddressLine2();
		LOA_FATCA_Details.SetLandMarks();
		LOA_FATCA_Details.SetPincodes();
		LOA_FATCA_Details.SelectCitys();
//		LOA_FATCA_Details.SelectStstes();
//		LOA_FATCA_Details.SelectCountrys();
		LOA_FATCA_Details.SelectTaxResistance();
		LOA_FATCA_Details.Click_On_NextBtn();
	}
	@Test(priority=25)
	public void verify_ApplicationReviewPage() throws InterruptedException {
		
		Application_Review_Page AppReview = new Application_Review_Page(TestBase.driver) ;
		AppReview.Verify_Application_Review_Page();
		AppReview.clickOnNext();
	}
	@Test(priority=26)
	public void Verify_Funding_Page() {
		Funding_Page FP = new Funding_Page(TestBase.driver);
		FP.setFundAmount();
		FP.Select_FundHold();
		FP.ClickOnRazorapy();
		FP.ClickNextBtn();
	}
	
	@Test(priority=27)
	public void Verify_VKYC_Page_SendVKYC() {
		VKYC_Page_SendVKYC SenedVKYC = new VKYC_Page_SendVKYC(TestBase.driver);
		SenedVKYC.SelectPrimaryHolder();

	}
	
	@Test(priority=28)
	public void Verify_VKYC_Page_Verification_Via_Video() throws InterruptedException {
		VKYC_Page_Verification_Via_Video VideoCall_Verification = new VKYC_Page_Verification_Via_Video(TestBase.driver);
		VideoCall_Verification.select_PANcardReady_CheckBox();
		VideoCall_Verification.select_InterNetconnection_checkBox();
		VideoCall_Verification.Select_LitEnvironment_checkBox();
		VideoCall_Verification.SelectVideoKycProcess_checkBox();
		VideoCall_Verification.selectButton();
		VideoCall_Verification.SelectSkipVideokyc_RadioBtn();
	}
	
//	@Test(priority=29)
//	public void Verify_VKYC_Page_SelectPreferredCommunicationLanguage() throws InterruptedException {
//		VKYC_Page_SelectPreferredCommunicationLanguage selectCommLunaguge = new VKYC_Page_SelectPreferredCommunicationLanguage();
//		selectCommLunaguge.Verify_PrefferedCommLaungauge();
//	}
	
//	@Test(priority=30)
//	public void Verify_VKYC_Page_PickYourSlotForVKYC() throws InterruptedException {
//		VKYC_Page_PickYourSlotForVKYC pick_Slot = new VKYC_Page_PickYourSlotForVKYC(TestBase.driver);
//		pick_Slot.Selct_timeForEkyc();
//		pick_Slot.select_time_slot();
//		pick_Slot.Click_On_NextBtn();
//	}
	
	
	@Test(priority=31)
	public void Verify_ConfigurationPage_AccountDetails() throws InterruptedException {
		ConfigurationPage_AccountDetails Configuration = new ConfigurationPage_AccountDetails(TestBase.driver);
		Configuration.Click_On_Account_details();
		Configuration.Click_On_FinalSubmitBtn();
		Configuration.Click_On_WindowAlert();
		
	}
	
	
}
