package Test_Cases;


import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.CheckoutPage;
import PageObjects.ConfirmationPage;
import PageObjects.ProductCatalogue;
import Test_Components.BaseTest;


public class StandAloneTest extends BaseTest {
	
	@Test
	public void SAlone() throws IOException,	 InterruptedException  {
		String productName = "ZARA COAT 3";
		ProductCatalogue productCatalogue=landingPage.loginApplication("anshika@gmail.com", "Iamking@000");
		List<WebElement> products=productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
		CartPage cartPage=productCatalogue.goToCartPage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Boolean match=cartPage.VerifyProductDisplay(productName);
     	Assert.assertTrue(match);
     	CheckoutPage checkoutPage=cartPage.goToCheckout();
     	checkoutPage.selectCountry("India");
     	System.out.println("success1");
        ConfirmationPage confirmationPage= checkoutPage.submitOrder();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    String confirmMessage = confirmationPage.getConfirmationMessage();
	   Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	    		
	}

}

