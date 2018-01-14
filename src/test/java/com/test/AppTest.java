package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.testng.TestNGAntTask.Mode.junit;


public class AppTest
{
    public static String site="http://poezdato.net";
    public static WebDriver firefox;

    @Test
    public static void TestCase1() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", ".//src/geckodriver.exe");
        firefox = new FirefoxDriver();
        firefox.get(site);

        WebElement directory_from = firefox.findElement(By.xpath("//input[@id='dir_from']"));
        WebElement directory_date = firefox.findElement(By.xpath("//input[@id='dir_date']"));
        WebElement directory_where = firefox.findElement(By.xpath("//input[@id='dir_where']"));
        WebElement btn_Find = firefox.findElement(By.xpath("//input[@id='dir_submit']"));
        WebElement tab=firefox.findElement(By.xpath("//div[@id='tab-1']"));

        directory_from.sendKeys("Минск-Пасс.");
        directory_where.sendKeys("Дрогичин-Город.");
        directory_date.sendKeys("31.01.2018");
        tab.click();
        Thread.sleep(1000);
        btn_Find.click();
        Thread.sleep(3000);

        WebElement date_of_treen=firefox.findElement(By.linkText("657Б"));
        Assert.assertEquals(date_of_treen.getText(),"657Б");
    }

    @Test
    public static void TestCase2() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", ".//src/geckodriver.exe");
        firefox = new FirefoxDriver();
        firefox.get(site);

        WebElement directory_from = firefox.findElement(By.xpath("//input[@id='dir_from']"));
        WebElement directory_date = firefox.findElement(By.xpath("//input[@id='dir_date']"));
        WebElement directory_where = firefox.findElement(By.xpath("//input[@id='dir_where']"));
        WebElement btn_Find = firefox.findElement(By.xpath("//input[@id='dir_submit']"));
        WebElement tab=firefox.findElement(By.xpath("//div[@id='tab-1']"));
        WebElement span=firefox.findElement(By.xpath("//span[@id='trigger_advanced_1']"));
        WebElement dir_time_from=firefox.findElement(By.xpath("//input[@id='dir_time_from']"));
        WebElement dir_time_to=firefox.findElement(By.xpath("//input[@id='dir_time_to']"));
        WebElement check1=firefox.findElement(By.xpath("//input[@id='dir_long_distance']"));
        WebElement check2=firefox.findElement(By.xpath("//input[@id='dir_suburban']"));

        directory_from.sendKeys("Минск-Пасс.");
        directory_date.sendKeys("31.01.2018");
        directory_where.sendKeys("Дрогичин-Город.");
        tab.click();
        Thread.sleep(1000);
        span.click();
        Thread.sleep(1000);
        dir_time_from.sendKeys("15:45");
        dir_time_to.sendKeys("23:45");
        check1.click();
        Thread.sleep(1000);
        check2.click();
        btn_Find.click();

        WebElement date_of_treen=firefox.findElement(By.linkText("657Б"));
        Assert.assertEquals(date_of_treen.getText(),"657Б");
    }

    @Test
    public static void TestCase3() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", ".//src/geckodriver.exe");
        firefox = new FirefoxDriver();
        firefox.get(site);

        WebElement directory_from = firefox.findElement(By.xpath("//input[@id='dir_from']"));
        WebElement directory_date = firefox.findElement(By.xpath("//input[@id='dir_date']"));
        WebElement directory_where = firefox.findElement(By.xpath("//input[@id='dir_where']"));
        WebElement btn_Find = firefox.findElement(By.xpath("//input[@id='dir_submit']"));
        WebElement tab=firefox.findElement(By.xpath("//div[@id='tab-1']"));
        WebElement span=firefox.findElement(By.id("trigger_advanced_1"));
        WebElement dir_time_from=firefox.findElement(By.xpath("//input[@id='dir_time_from']"));
        WebElement dir_time_to=firefox.findElement(By.xpath("//input[@id='dir_time_to']"));
        WebElement check2=firefox.findElement(By.xpath("//input[@id='dir_suburban']"));

        directory_from.sendKeys("Минск-Пасс.");
        directory_where.sendKeys("Дрогичин-Город.");
        directory_date.sendKeys("31.01.2018");
        tab.click();
        Thread.sleep(1000);
        span.click();
        Thread.sleep(1000);
        dir_time_from.sendKeys("15:45");
        dir_time_to.sendKeys("23:45");
        check2.click();
        btn_Find.click();

        WebElement date_of_treen=firefox.findElement(By.linkText("657Б"));
        Assert.assertEquals(date_of_treen.getText(),"657Б");
    }

    @Test
    public static void TestCase4() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", ".//src/geckodriver.exe");
        firefox = new FirefoxDriver();
        firefox.get(site);

        WebElement station=firefox.findElement(By.xpath("//a[@href='#tab-2']"));
        WebElement st_station=firefox.findElement(By.xpath("//input[@id='st_station']"));
        WebElement st_date=firefox.findElement(By.xpath("//input[@id='st_date']"));
        WebElement st_submit=firefox.findElement(By.xpath("//input[@id='st_submit']"));
        WebElement st_span=firefox.findElement(By.id("trigger_advanced_2"));
        WebElement tab2=firefox.findElement(By.xpath("//div[@id='tab-2']"));

        station.click();
        st_station.sendKeys("Минск-Пасс.");
        st_date.sendKeys("20.01.2018");
        tab2.click();
        Thread.sleep(1000);
        st_submit.click();

        WebElement date_of_treen=firefox.findElement(By.linkText("Витебск"));
        Assert.assertEquals(date_of_treen.getText(),"Витебск");
    }

    @Test
    public static void TestCase5() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", ".//src/geckodriver.exe");
        firefox = new FirefoxDriver();
        firefox.get(site);

        WebElement station=firefox.findElement(By.xpath("//a[@href='#tab-2']"));
        WebElement st_station=firefox.findElement(By.xpath("//input[@id='st_station']"));
        WebElement st_date=firefox.findElement(By.xpath("//input[@id='st_date']"));
        WebElement st_submit=firefox.findElement(By.xpath("//input[@id='st_submit']"));
        WebElement st_span=firefox.findElement(By.id("trigger_advanced_2"));
        WebElement tab2=firefox.findElement(By.xpath("//div[@id='tab-2']"));
        WebElement st_time_from = firefox.findElement(By.xpath("//input[@id='st_time_from']"));
        WebElement st_time_to = firefox.findElement(By.xpath("//input[@id='st_time_to']"));
        WebElement st_check1=firefox.findElement(By.xpath("//input[@id='st_long_distance']"));
        WebElement st_check2=firefox.findElement(By.xpath("//input[@id='st_suburban']"));

        station.click();
        st_station.sendKeys("Минск-Пасс.");
        st_date.sendKeys("20.01.2018");
        tab2.click();
        Thread.sleep(1000);
        tab2.click();
        Thread.sleep(1000);
        st_span.click();
        Thread.sleep(1000);
        st_time_from.sendKeys("15:55");
        st_time_to.sendKeys("16:55");
        st_check1.click();
        Thread.sleep(1000);
        st_check2.click();
        st_submit.click();

        WebElement date_of_treen=firefox.findElement(By.linkText("7329"));
        Assert.assertEquals(date_of_treen.getText(),"7329");
    }

    @Test
    public static void TestCase6() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", ".//src/geckodriver.exe");
        firefox = new FirefoxDriver();
        firefox.get(site);

        WebElement directory_from = firefox.findElement(By.xpath("//input[@id='dir_from']"));
        WebElement directory_date = firefox.findElement(By.xpath("//input[@id='dir_date']"));
        WebElement directory_where = firefox.findElement(By.xpath("//input[@id='dir_where']"));
        WebElement btn_Find = firefox.findElement(By.xpath("//input[@id='dir_submit']"));
        WebElement tab=firefox.findElement(By.xpath("//div[@id='tab-1']"));
        WebElement time_way=firefox.findElement(By.xpath("//*[@class='time_way sorting']"));

        directory_from.sendKeys("Минск-Пасс.");
        directory_where.sendKeys("Береза-Город");
        directory_date.sendKeys("31.01.2018");
        tab.click();
        Thread.sleep(1000);
        btn_Find.click();
        time_way.click();
        Thread.sleep(3000);

        WebElement date_of_treen=firefox.findElement(By.linkText("Санкт-Петербург"));
        Assert.assertEquals(date_of_treen.getText(),"Санкт-Петербург");
    }

    @Test
    public static void TestCase7() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", ".//src/geckodriver.exe");
        firefox = new FirefoxDriver();
        firefox.get(site);

        WebElement directory_from = firefox.findElement(By.xpath("//input[@id='dir_from']"));
        WebElement directory_date = firefox.findElement(By.xpath("//input[@id='dir_date']"));
        WebElement directory_where = firefox.findElement(By.xpath("//input[@id='dir_where']"));
        WebElement btn_Find = firefox.findElement(By.xpath("//input[@id='dir_submit']"));
        WebElement tab=firefox.findElement(By.xpath("//div[@id='tab-1']"));

        directory_from.sendKeys("Береза");
        directory_where.sendKeys("Дрогичин-Город");
        directory_date.sendKeys("31.01.2018");
        tab.click();
        Thread.sleep(1000);
        btn_Find.click();

        WebElement date_of_treen=firefox.findElement(By.xpath("//div[@class='error_inner']"));
        Assert.assertEquals(date_of_treen.getText(),"По вашему запросу поезда не найдены");
    }

    @Test
    public static void TestCase8() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", ".//src/geckodriver.exe");
        firefox = new FirefoxDriver();
        firefox.get(site);

        WebElement directory_from = firefox.findElement(By.xpath("//input[@id='dir_from']"));
        WebElement directory_date = firefox.findElement(By.xpath("//input[@id='dir_date']"));
        WebElement directory_where = firefox.findElement(By.xpath("//input[@id='dir_where']"));
        WebElement btn_Find = firefox.findElement(By.xpath("//input[@id='dir_submit']"));
        WebElement tab=firefox.findElement(By.xpath("//div[@id='tab-1']"));
        WebElement drive=firefox.findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr/td[6]/a"));
        directory_from.sendKeys("Минск-Пасс.");
        directory_where.sendKeys("Береза-Город");
        directory_date.sendKeys("31.01.2018");
        tab.click();
        Thread.sleep(1000);
        btn_Find.click();
        Thread.sleep(1000);
        drive.click();


        WebElement date_of_treen=firefox.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        Assert.assertEquals(date_of_treen.getText(),"Декабрь");
    }
}
