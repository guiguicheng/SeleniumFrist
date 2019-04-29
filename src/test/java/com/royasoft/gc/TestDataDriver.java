package com.royasoft.gc;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataDriver {

   /* @DataProvider(name = "loginUser")
    public Object[][] data(){
       return new  Object[][] {{"swbgt","123456"},{"swbgt000000jss","12345678"}};
    }*/

    @DataProvider(name = "keer")
        public Object[][] data2(){
            return new Object[][]{
                    {"1","2"},{"3","4"}};
        }



    @Test(dataProvider = "loginUser")
    public  void login(String name,String pwd){
        System.out.println("user"+name);
        System.out.println("pwd"+pwd);
    }

}
