package Task.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@Test
	
	public void startBrowser() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Jagruthi Reddy/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.coursera.org/");
    driver.manage().window().maximize();
    //search by classname
    WebElement search_class=driver.findElement(By.className("react-autosuggest__input"));
    if (search_class != null) {
        System.out.println("Element with classname is found!");
    } else {
        System.out.println("Element with classname is not found!");
    }
    search_class.sendKeys("Artifical Intelligence");
    search_class.sendKeys(Keys.RETURN);
    
    //search by css selector
    WebElement search_css_selector=driver.findElement(By.cssSelector("input[placeholder='What do you want to learn?']"));
    if (search_css_selector != null) {
        System.out.println("Element with CSS selector found!");
    } else {
        System.out.println("Element with CSS selector not found!");
    }
    search_css_selector.sendKeys("Cyber Security");
    driver.navigate().to("https://www.coursera.org/search?query=Cyber%20Security");
    
    //search by xpath
    WebElement search_xpath=driver.findElement(By.xpath("//input[@aria-label='What do you want to learn?']"));
    if (search_xpath != null) {
        System.out.println("Element with xpath is found!");
    } else {
        System.out.println("Element with xpath is not found!");
    }
    search_xpath.clear();
    search_xpath.sendKeys("Machine Learning");
    driver.navigate().to("https://www.coursera.org/search?query=Machine%20Learning");
    
    //link text
    WebElement linkText =driver.findElement(By.linkText("Log In"));
    if (linkText != null) {
        System.out.println("Element with link text is found!");
    } else {
        System.out.println("Element with link text is not found!");
    }
    linkText.click();
    
    //partial link text
    WebElement partialLinkText =driver.findElement(By.partialLinkText("Log"));
    if (partialLinkText != null) {
        System.out.println("Element with partial link text is found!");
    } else {
        System.out.println("Element with partial link text is not found!");
    }
     driver.quit();
	}
}



