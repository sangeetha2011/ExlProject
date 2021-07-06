package page;


	import org.openqa.selenium.By;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	
	import org.testng.Assert;

	public class Dashboardpage  extends BasePage{
		WebDriver driver;
			
	public Dashboardpage (WebDriver driver) {
			this.driver = driver;
			}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Dashboard')]")WebElement DASHBOARD_PAGE_FIELD;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")WebElement CUSTOMER_FIELD;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")WebElement ADD_CUSTOMER_FIELD;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'List Customers')]")WebElement LISTCUSTOMER_FIELD;
			
	public void verifyDashBoardPage() {
		 
	 Assert.assertEquals(DASHBOARD_PAGE_FIELD.getText(),"Dashboard", "wrong page");
		 
	 }
	 public void clickcustomerButton() {
		 CUSTOMER_FIELD.click();
		 clickCustomerElement(driver,CUSTOMER_FIELD);
	 }

			   
	 public void clickAddcustomerButton() {
		 
		 ADD_CUSTOMER_FIELD.click(); 
		 clickCustomerElement(driver,ADD_CUSTOMER_FIELD);
	 }
	 
	 public void clickListcustomer() {
			LISTCUSTOMER_FIELD.click();
		} 
	}



