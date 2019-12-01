package tests;

import org.testng.annotations.Test;

import core.BaseDriver;
import pages.HomePage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HomePageTests extends BaseDriver {
  
  @BeforeMethod
  public void beforeMethod() {
	  startSession();
	  PageFactory.initElements(driver, HomePage.class);
  }
  @Test
  public void SingleInputFieldTest() {
	  HomePage.EnterMessage.sendKeys("Dudu");
	  HomePage.ShowMessageButton.click();
	 // String text = HomePage.DisplayMessage.getText();
	 // System.out.println(text);
	 // Assert.assertTrue(text.equals("Dudu"));
	 // вместо этих трёх строчек можно одну 
	  Assert.assertEquals("Dudu",HomePage.DisplayMessage.getText());
  }
  @AfterMethod
  public void afterMethod() {
  }

}
