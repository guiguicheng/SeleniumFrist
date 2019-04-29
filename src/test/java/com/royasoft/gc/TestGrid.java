package com.royasoft.gc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class TestGrid {

    @Test
 public void testgrid (){
        DesiredCapabilities dc =  DesiredCapabilities.internetExplorer();
       // WebDriver driver = new RemoteWebDriver(new URL("http://192.168.33.217:4444/wd/hub"),dc);
        //driver.get("www.baidu.com");
    }
}
