package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Dashboardpage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class Logintest {
	WebDriver driver;
	ExcelReader exlread = new ExcelReader("src\\main\\java\\data\\ExlprojectEclipse.xlsx");
	String userName =exlread.getCellData("LoginInfo", "UserName",2 );
	String password =exlread.getCellData("LoginInfo", "Password",2 );
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterUsername(userName);
		loginpage.enterPassword(password);
		loginpage.signInButtonToLogin();
		Dashboardpage dashboardpage = PageFactory.initElements(driver,Dashboardpage.class);
		 dashboardpage.verifyDashBoardPage();
		 
	
	
	
	}
	
}
