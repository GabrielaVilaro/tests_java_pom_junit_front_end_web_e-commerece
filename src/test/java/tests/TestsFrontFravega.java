package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.IndexPage;
import pages.ItemPage;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class TestsFrontFravega extends TestBase{

    public static IndexPage indexPage;
    public static ItemPage itemPage;
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");

    @Before
    public void beforeClass() {
        indexPage = new IndexPage();
        itemPage = new ItemPage();
    }

    @Test
    public void testElementValid()
    {
        LOGGER.info("Comienza el test");
        indexPage.sendNumberCP("1651");
        indexPage.clickButtonSave();
        indexPage.clickButtonSearch();
        indexPage.searchElement("Heladera");
        indexPage.clickButtonSearch();
        itemPage.clickButtonFilterItem();
        itemPage.clickButtonViewAll();
        itemPage.clickSamsungSelect();
        itemPage.clickApply();
        String textResult = itemPage.getTextResult();
        int numberOfResult = Integer.parseInt(textResult);
        String descriptionText = itemPage.getTextDescription().replace(" (6)", "");

       assertTrue(itemPage.getTextResultList(numberOfResult).contains("Samsung"));
       assertEquals(descriptionText, "Heladeras con freezer");
       assertEquals(itemPage.getSizeResultList(), numberOfResult);

    }

    @After
    public void afterClass() {
        System.out.println("Fin del test");
    }

}
