package processes;
import com.aventstack.extentreports.App;
import io.cucumber.java.*;
import io.cucumber.plugin.event.*;
import io.cucumber.plugin.event.Status;
import io.restassured.RestAssured;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import processes.testrail.APIClient;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static processes.testrail.TestRailAccount.testRailApiClient;


import org.junit.rules.TestName;
import processes.testrail.APIException;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Hooks{

    Result result ;
    Status status;
    Throwable error;
    String error_message;
    private static APIClient client = null;
    private static String runId = "14105";
    private static final int FAIL_STATE = 5;
    private static final int SUCCESS_STATE = 1;
    private static final String SUCCESS_COMMENT = "This test passed with Selenium";

    String url ="https://www.co-opbank.co.ke/";
    String  FAILED_COMMENT="";


    //    @Rule
    static String path = "src/test/java/processes/utils/getPassProperties.properties";
static String exactprop = "getPassProperties.properties";
    public TestName testName = new TestName();


    public static WebDriver driver;

    static WebElement personalbanking,businessbanking,cardsection,platinumcard;
    public static void gotourl(String url){

        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Jacqueline.Kamadi\\Downloads\\APIs\\chromedriver.exe");
        driver.get("https://www.co-opbank.co.ke/");

    }



    public static void accessheaders(){
        personalbanking = driver.findElement(By.xpath("/html/body/div[7]/header/div/div/div/nav/div/ul/li[2]/a"));
        String  personalbank = personalbanking.getText();
        Assert.assertEquals(personalbank,"Personal Banking");
        businessbanking = driver.findElement(By.xpath("/html/body/div[7]/header/div/div/div/nav/div/ul/li[3]/a"));
        String  businessbanking = personalbanking.getText();
        Assert.assertEquals(businessbanking,"Business Banking");


    }



    public static void formsubmission(){
        personalbanking = driver.findElement(By.xpath("/html/body/div[7]/header/div/div/div/nav/div/ul/li[2]/a"));

        personalbanking.click();

        try {
            driver.wait(20);
            cardsection = driver.findElement(By.xpath("/html/body/div[7]/div/main/div[1]/div/div/nav/div/ul/li[4]/a"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        platinumcard = driver.findElement(By.xpath("/html/body/div[7]/div/main/div[5]/div[2]/div[2]/div/div/div[4]/div/div[2]/div[2]/a"));

    }

        }