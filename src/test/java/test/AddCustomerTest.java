package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;

import page.Dashboardpage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {
	WebDriver driver;
	ExcelReader exlread = new ExcelReader("src\\main\\java\\data\\ExlprojectEclipse.xlsx");
	String userName =exlread.getCellData("LoginInfo", "UserName",2 );
	String password =exlread.getCellData("LoginInfo", "Password",2 );
	String fullname =exlread.getCellData("AddContactInfo", "FullName",2 );
	String companyname =exlread.getCellData("AddContactInfo", "CompanyName",2 );
	String emailid =exlread.getCellData("AddContactInfo", "Email",2 );
	String phonenum =exlread.getCellData("AddContactInfo", "Phone",2 );
	String address =exlread.getCellData("AddContactInfo", "Address",2 );
	String city =exlread.getCellData("AddContactInfo", "City",2 );
	String state =exlread.getCellData("AddContactInfo", "State",2 );
	String zipcode =exlread.getCellData("AddContactInfo", "Zip",2 );
	String country =exlread.getCellData("AddContactInfo", "country",2 );
	
	@Test
public void validCustomerShouldBeAbleToCreateCustomer() throws InterruptedException  {
	 driver = BrowserFactory.init();
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	loginpage.enterUsername(userName);
	loginpage.enterPassword(password);
	loginpage.signInButtonToLogin();
	Dashboardpage dashboardpage = PageFactory.initElements(driver,Dashboardpage.class);
	 dashboardpage.verifyDashBoardPage();
    dashboardpage.clickcustomerButton();
	dashboardpage.clickAddcustomerButton();
    AddCustomerPage addcustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
    addcustomerpage.enterFullName(fullname);
    addcustomerpage.enterCompany(companyname);
    addcustomerpage.enterEmailId(emailid);
    addcustomerpage.enterPhoneNumber(phonenum);
    addcustomerpage.enterAddress(address);
    addcustomerpage.enterCity(city);
    addcustomerpage.enterState(state);
    addcustomerpage.enterZipcode(zipcode);
    addcustomerpage.selectCountry(country);
    addcustomerpage.clickSaveButton();
    addcustomerpage.verifysummary();
    dashboardpage.clickListcustomer();
    addcustomerpage.verifyEnteredNameandDelete();
   
    
	}

}
