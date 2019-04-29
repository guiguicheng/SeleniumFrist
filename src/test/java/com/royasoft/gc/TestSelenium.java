package com.royasoft.gc;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.Utils;
import org.testng.reporters.Files;
//import org.apache.commons.io.FileUtils;
import javax.xml.bind.Element;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;


public class TestSelenium {

    WebDriver driver;

    @BeforeMethod
    public  void  openIE()
    {
        System.setProperty("webdriver.ie.driver","E:\\IdeaProjects\\Selenium\\drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }


@Test
    public void openchrome(){
    System.setProperty("webdriver.chrome.driver","E:\\IdeaProjects\\Selenium\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    //System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver_win32-2.14/chromedriver.exe");
   // WebDriver driver = new ChromeDriver();

}
@Test
    public  void operaIE() throws InterruptedException {
//System.setProperty("webdriver.ie.driver","E:\\IdeaProjects\\Selenium\\drivers\\IEDriverServer.exe");
       //driver = new InternetExplorerDriver();
        driver.get("https://www.baidu.com");
        //Thread.sleep(500);
       String url = driver.getCurrentUrl();
        //System.out.println("当前URL是:" + url);
        Assert.assertEquals(url,"https://www.baidu.com/");
      // WebElement  elementid = driver.findElement(By.id("kw"));
     //  WebElement classname = driver.findElement(By.xpath("//*[@id='kw']"));
     List<WebElement> list = driver.findElements(By.xpath("//*[@id='u_sp']/a"));
       // String tes= driver.findElement(By.xpath("//*[@id='u_sp' and @class ='s-isindex-wrap s-sp-menu']/a[1]")).getText();


    //System.out.println(tes);
        for (int i =1; i <list.size(); i++)
    {
        String text = list.get(i).getText();
        System.out.println(text);
        System.out.println("来来来");
    }

    System.out.println("来来来11");
 }

 @Test
 public void clickNews() throws InterruptedException{
        driver.get("https://www.baidu.com");
        //driver.findElement(By.id("kw")).sendKeys("selenium");
       // driver.findElement(By.id("su")).click();
        //Thread.sleep(5000);
        //校验title是否包含
    String  tagname = driver.findElement(By.id("kw")).getTagName();
     System.out.println(tagname);
    Assert.assertEquals(tagname,"input");
    System.out.println("测试");
 }
    /*@Test
public  void testValues(){
    driver.get("https://www.baidu.com");
    File  file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    try{
        FileUtils.copyFile(file,new File("D;\\test1.png" ));
        FileUtils.copy
    }
    catch (IOException e) {
        e.printStackTrace();
    }


   String values = driver.findElement(By.id("su")).getAttribute("value");
Assert.assertEquals(values,"百度一下");
}*/

@Test
public void openSW() throws InterruptedException{
        driver.get("http://183.207.215.121:10080/omc/index.jsp");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//*[@id=\'j_username_text\']")).sendKeys("swbgt");
    driver.findElement(By.xpath("//*[@id=\'j_password_text\']")).sendKeys("000000");
    driver.findElement(By.xpath("//*[@id=\'m_dynamic_text\']")).sendKeys("111111");
    driver.findElement(By.xpath("//*[@id=\'loginBtn\']")).click();   //*[@id="accordionmenutree-1042_header-title-textEl"]
    //Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\'accordionmenutree-1042_header-title-textEl\']")).click();
   // Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@id=\'treeview-1045-record-123\']/tbody/tr/td/div/span")).click();
   // Thread.sleep(200);
    //driver.findElement(By.xpath("//*[@id=\'btn_add\']")).click();

//获取当前窗口句柄
    String current_handle = driver.getWindowHandle();
//获取所有窗口句柄
    Set<String> all_handles = driver.getWindowHandles();

    for(String handle : all_handles){
        if (handle.equals(current_handle) ) {
//切换到新增页==false
            System.out.println("now register window!");
            continue;
        }
            driver.switchTo().window(handle);
            //driver.findElement(By.xpath("//*[@id=\'noticeName\']")).clear();
            System.out.println("窗口切换了吗");
            //driver.findElement(By.xpath("//*[@id=\'noticeName\']")).sendKeys("测试");
            //Thread.sleep(2000);
           // driver.findElement(By.xpath("/html/body/div[1]/div[1]/button")).click();
            driver.findElement(By.xpath("//*[@id=\'btn_add\']")).click();
           // Thread.sleep(2000);

//......
//关闭当前窗口
            driver.close();


    }
//判断是否为百度首页，并



}

@Test
//保存页面到本地
    public void saveHtml() throws AWTException, InterruptedException {
    driver.get("http://www.baidu.com");
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_S);
    sleep(5000);
    robot.keyPress(KeyEvent.VK_ENTER);







}




/*@AfterMethod

    public  void  closeIE ()throws InterruptedException{
        Thread.sleep(5000);
    driver.quit();
 }
*/
}
