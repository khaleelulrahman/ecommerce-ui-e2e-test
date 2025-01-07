package test.AddToCart;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SummerDressPage;

public class AddToCartTest extends BaseTest {
    @Test
    public void shouldSuccessfullyAddToCart() throws InterruptedException
    {
    SummerDressPage summerDressPage=header.goToSummerDressesesSection();
    //summerDressPage.selectProduct("Printed Chiffon Dress");
    summerDressPage.selectProductMoreButton("Printed Chiffon Dress");
    }
}
