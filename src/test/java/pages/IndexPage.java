package pages;
import org.openqa.selenium.By;

public class IndexPage extends BasePage{

    By textOfResult = By.name("keyword");
    By buttonSearch = By.cssSelector("#__next > div > header > div.sc-iIgjPs.krBuaG > form > fieldset > div.sc-gSYDnn.jcqGXt > button > svg");
    By inputCP = By.id("header-geo-location-form-postal-number");
    By buttonSaveCP = By.cssSelector("#react-aria-modal-dialog > div > div.sc-eXuyPJ.kTTKRj > form > div > button");


    public IndexPage() {
        super(driver);
    }

    public void searchElement(String text)
    {
        sendKeys(textOfResult, text);
    }
    public void clickButtonSearch()
    {
        clickButton(buttonSearch);
    }

    public void sendNumberCP(String text)
    {
        sendKeys(inputCP, text);
    }

    public void clickButtonSave()
    {
        clickButtonJs(buttonSaveCP);
    }

}
