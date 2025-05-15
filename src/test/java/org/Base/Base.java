package org.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.helper.Initializer;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base extends Initializer {

	public static Actions action = new Actions(driver);

	public static void launchUrl(String url) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}

	public static void insertValue(WebElement ele, String value) {
		System.out.println("value = " +value);
		ele.sendKeys(value);
	}

	public static void btnClick(WebElement ele) {
		ele.click();
	}

	public static void mouseOver(WebElement ele) {
		Actions acc = new Actions(driver);
		acc.moveToElement(ele).perform();
	}

	public static void doubleClick(WebElement ele) {
		Actions acc = new Actions(driver);
		acc.doubleClick(ele).perform();
	}

	public static void rightClick(WebElement ele) {
		Actions acc = new Actions(driver);
		acc.contextClick(ele).perform();
	}

	public static void dragAndDrop(WebElement src, WebElement desc) {
		Actions acc = new Actions(driver);
		acc.dragAndDrop(src, desc).perform();
	}

	public static void windowHandling() {
		String par = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String x : all) {
			if (!par.equals(x)) {
				driver.switchTo().window(x);
			}
		}
	}
	
	public static String fetchText(WebElement ele) {
		return ele.getText();
	}

	public static void switchToParentWindow() {
		String par = driver.getWindowHandle();
		driver.switchTo().window(par);
	}
	
	public static void closeNewWindow(){
		driver.close();
	}
	
	public static void quitWindow(){
		//driver.quit();
	}
	
	public static void switchFraming(String name) {
		driver.switchTo().frame(name);
	}
	
//	public static String readValueFromExcel(int row, int col) throws IOException {
//		String value="";
//		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\SampleRead\\src\\test\\resources\\excelDat.xlsx");
//		FileInputStream str = new FileInputStream(f);
//		Workbook book = new XSSFWorkbook(str);
//		Sheet s = book.getSheet("Data");
//		Row r = s.getRow(row);
//		Cell c = r.getCell(col);
//		int type = c.getCellType();
//		if(type==1) {
//			value=c.getStringCellValue();
//		}
//		else {
//			if(DateUtil.isCellDateFormatted(c)) {
//				Date d = c.getDateCellValue();
//				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-YYYY");
//				value=sim.format(d);
//			}
//			else {
//				double d = c.getNumericCellValue();
//				long l=(long)d;
//				value=String.valueOf(l);
//			}
//		}
//		System.out.println(value);
//		return value;
//	}

	public static boolean isDisplayed(WebElement ele) {
		return ele.isDisplayed();
	}
	
	public static void scrollIntoViewWebElement(WebElement ele) {
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(true)",ele);
	}

	public static boolean isElementPresent(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static void clickWithRetry(WebElement WebElement) {
		int attempts = 0;
		while (attempts < 3) {
			try {
				btnClick(WebElement);
				break;
			} catch (ElementClickInterceptedException e) {
				System.out.println("Retrying click... attempt " + (attempts + 1));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					throw new RuntimeException(ex);
				}
			}
			attempts++;
		}
	}

	public static void clickByJS(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}

	public static void waitForElementPresent(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public static void waitForElementToClickable(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public static boolean isElementClickable(WebDriver driver, WebElement locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			return element != null;
		} catch (Exception e) {
			return false;
		}
	}

	public static void shortWait() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public static void mediumWait() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static WebElement element(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void pressEsc(){
		action.sendKeys(Keys.ESCAPE).build().perform();
	}

	public static Select select(WebElement element) {
		return new Select(element);
	}

	public void selectByVisibleText(By locator, String text) {
		select(element(locator)).selectByVisibleText(text);
	}

	public void selectWithIndex(By locator, int index) {
		select(element(locator)).selectByIndex(index);
	}


	public static void sendKeys(WebElement element, String value) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(value);
	}

	public static void selectByValue(WebElement element, String value) {
		select(element).selectByValue(value);
	}

	public static boolean selectIsMultiple(By locator) {
		select(element(locator)).isMultiple();
		return true;
	}

	public static void deselectByValue(By locator, String value) {
		select(element(locator)).deselectByValue(value);
	}

	public static void deselectAll(By locator) {
		select(element(locator)).deselectAll();
	}

	public static void getOptions(By locator) {
		List<WebElement> option = select(element(locator)).getOptions();
		System.out.println("The options you can choose to select are: ");
		for (WebElement options : option)
			System.out.println(options.getText());
	}

	public static void getAllSelectedOptions(By locator) {
		System.out.println("The selected values options are: ");
		List<WebElement> selectedOptions = select(element(locator)).getAllSelectedOptions();
		for (WebElement selectedOption : selectedOptions)
			System.out.println(selectedOption.getText());
	}

}
