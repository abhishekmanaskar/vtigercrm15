package Vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MockVtiger {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[text()=' Campaigns']"));
		 
		 
 		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		action.moveToElement(ele1).perform();
		ele1.click();
		 
//		ele1.click();

		//WebElement campaign = driver.findElement(By.cssSelector("body[data-user-dateformat=\"dd-mm-yyyy\"]"));
		WebElement campaign = driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD"));
		campaign.click();
		driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("Abhi");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_targetaudience")).sendKeys("XYZ");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_closingdate")).sendKeys("10-10-2023");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_sponsor")).sendKeys("Qspider");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_targetsize")).sendKeys("2000");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_numsent")).sendKeys("70");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_budgetcost")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_actualcost")).sendKeys("978");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_expectedrevenue")).sendKeys("8767");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_actualsalescount")).sendKeys(" 867687");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_expectedsalescount")).sendKeys("2070");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_expectedresponsecount")).sendKeys("70");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_actualresponsecount")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_expectedroi")).sendKeys("978");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_actualroi")).sendKeys("8767");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_description")).sendKeys("74rfut");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[title=\"Atlas Jeniffer(admin)\"]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
	} 

}
