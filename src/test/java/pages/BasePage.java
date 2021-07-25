package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.TestBase;
import java.util.List;


public class BasePage extends TestBase{

    public static WebDriverWait webDriverWait;

    public BasePage(WebDriver driver) {
        super();
        webDriverWait = new WebDriverWait(driver, 10);
    }

    public void clickButton(By locator)
    {
        WebElement button = webDriverWait.
                until(ExpectedConditions.presenceOfElementLocated(locator));
        button.click();
    }

    public String getText(By locator)
    {
        WebElement text = webDriverWait.
                until(ExpectedConditions.visibilityOfElementLocated(locator));
        return text.getText();
    }

    public void clickButtonJs(By locator)
    {
        WebElement element = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click();", element );
    }

    public void sendKeys(By locator, String text)
    {
        WebElement textOfResult = webDriverWait.
                until(ExpectedConditions.presenceOfElementLocated(locator));
        textOfResult.sendKeys(text);
    }

    public String getTextList(By locator, int numberItem){
        List<WebElement> elementList = driver.findElements(locator);

        for (int i=0; i < numberItem;i++){
            System.out.println(elementList.get(i).getText());
        }

        return elementList.get(0).getText();
    }

    public int getSizeElement(By locator){
        List<WebElement> elementList = driver.findElements(locator);

       return elementList.size() / 2;
    }

}
