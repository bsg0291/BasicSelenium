
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
WebDriver driver;
// Enter message
@FindBy(xpath = "//input[@type='text' and @id='user-message']")
public static WebElement EnterMessage;

@FindBy(xpath = "//*[@id='get-input']/button")
public static WebElement ShowMessageButton;

@FindBy(id = "display")
public static WebElement DisplayMessage;
}

