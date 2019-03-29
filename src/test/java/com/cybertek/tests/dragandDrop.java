package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class dragandDrop extends TestBase {
    @Test
    public void test(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droptarget"));
        //pass the variable in the correct order,first one is source,second one is target
        //always source comes first
        actions.dragAndDrop(source,target).perform();

    }
public void test2()throws InterruptedException{
    driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
    WebElement source=driver.findElement(By.id("draggable"));
    WebElement target=driver.findElement(By.id("droptarget"));
    //write the steps for doing the drag and drop operation
    //without using the dragAndDrop();method

//actions.clickAndHold(source).moveToElement(target).release().build().perform();
    actions.clickAndHold(source).moveToElement(target).release().build().perform();

}
}
