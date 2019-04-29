package com.royasoft.gc;

import com.com.controller.SendEmailController;
import com.com.controller.loginController;
import com.po.page.LoginEmail;
import com.po.page.SendEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.Set;

import static java.lang.Thread.*;

public class TestStudy {
    WebDriver driver ;
    @BeforeTest
    public  void  openIE()
    {
        System.setProperty("webdriver.ie.driver","E:\\IdeaProjects\\Selenium\\drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.get("https://mail.163.com/");
       // driver.findElement(By.name("email")).sendKeys("eee");
    }
/*@Test
    public  void  opera(){
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"loginDiv\"]/iframe")));
        driver.findElement(By.xpath("//*[@id=\'changepage\']")).click();
        String current_handle = driver.getWindowHandle();
        Set<String> all_handle = driver.getWindowHandles();
        for ( String handle :all_handle){
            if ( handle.equals(current_handle)){
                continue;
            }
            driver.switchTo().window(handle);
        }
}*/



    @Test
     public void  Success() {
        loginController.login(driver,"15850591149","123456");;
    }

    @Test
    public void SendEmail() throws InterruptedException {
        loginController.login(driver,"test1149","123456aa");
        sleep(6000);

        /*String  current_handle = driver.getWindowHandle();
        Set <String>  handles = driver.getWindowHandles();
         for (String handle : handles  ){
             if (!handle.equals(current_handle)) {
                 continue;
             }
             driver.switchTo().window(handle);*/
             //driver.findElement(By.xpath("//*[@title=\"写信全屏\"]")).click();
             //driver.findElement(By.className("APP-editor-commond-btn APP-editor-switchFullScreen-toFull")).click();
        //正文写到主题里了？？？？
        SendEmailController.sendEnmail(driver,"guicheng@royasoft.com.cn","test","C:\\Users\\Administrator\\Desktop\\timg.jpg","content");





         }



    }

