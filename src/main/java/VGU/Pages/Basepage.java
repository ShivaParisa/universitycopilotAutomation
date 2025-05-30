package VGU.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
    protected WebDriver driver ;

    protected void waitForElementToBeVisible(WebElement element){
        new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOf(element));
    }
    protected void waitForVisibility(By element){
        new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }
    protected void waitForElementTobeInteractable(WebElement element){
        new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(element));
    }
    protected void threadSleep(){
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }


    protected void jsClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
    protected void scrollToView(WebElement element) {
        if (element.isEnabled()) {
            ((JavascriptExecutor) driver).
                    executeScript("arguments[0].scrollIntoView(true);", element);
        }


    }
    public boolean isElementVisible(WebElement element){
        boolean flag = false;
        try {
            flag= element.isEnabled()&&element.isDisplayed();
        }catch (Exception e){
            flag= element.isEnabled()&&element.isDisplayed();
        }finally {
            return flag;
        }
    }
    protected void wait(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
