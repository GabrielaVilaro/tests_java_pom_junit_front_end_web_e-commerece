package pages;
import org.openqa.selenium.By;

public class ItemPage extends BasePage {

    By filterItem = By.name("subcategoryAggregation");
    By viewAllBrands = By.name("viewAllBrands");
    By samsungCheckbox = By.id("filterItemsamsung");
    By apply =  By.id("apply");
    By listItem = By.xpath("//ul[@name='itemsGrid']/li//h3[@class='PieceTitle-sc-1eg7yvt-0 gItGR']");
    By textResult =  By.cssSelector("#__next > div > div.Listing__Desktop-sc-1t0akh2-1.eVBA-dU > div > div > div.generalstyles__Column-sc-1j7wv79-5.jmbsIM > ul > li.listingDesktopstyled__TotalResult-wzwlr8-2.eTPNDu > span");
    By textDescription = By.cssSelector("#__next > div > div.Listing__Desktop-sc-1t0akh2-1.eVBA-dU > div > div > div.generalstyles__Column-sc-1j7wv79-5.jmbsIM > ul > li:nth-child(5) > ul > li:nth-child(2) > ul > li:nth-child(2)");


    public ItemPage() {
        super(driver);
    }

    public void clickButtonFilterItem()
    {
        clickButton(filterItem);
    }

    public void clickButtonViewAll()
    {
        clickButton(viewAllBrands);
    }

    public void clickSamsungSelect()
    {
        clickButtonJs(samsungCheckbox);
    }

    public void clickApply()
    {
        clickButton(apply);
    }

    public String getTextResult()
    {
        return getText(textResult);
    }

    public String getTextDescription()
    {
        return getText(textDescription);
    }


    public String getTextResultList(int numberItem)
    {
        return getTextList(listItem, numberItem);
    }

    public int getSizeResultList()
    {
        return getSizeElement(listItem);
    }
}
