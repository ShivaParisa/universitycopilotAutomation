package Vgu.tests;

import Utils.PropertiesReader;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTest {
    PropertiesReader propreader= new PropertiesReader();
    public String URL =propreader.getApplicationURL();
    public WebDriver driver;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest logger;

    @BeforeSuite
    public void beforeSuite() {
        createFolderExtendReport();
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/ExtendReport/TestReport.html");

        // Check if XML config exists before loading it
        File config = new File(System.getProperty("user.dir") + "/extent-config.xml");
        if (config.exists()) {
            htmlReporter.loadXMLConfig(config);
        }

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        extent.setSystemInfo("Host Name", "QA");
        extent.setSystemInfo("Environment", System.getProperty("env", "DefaultEnv"));

        htmlReporter.config().setDocumentTitle("VGU Automation Report");
        htmlReporter.config().setReportName("VGU Automation Report");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
    }

    private void createFolderExtendReport() {
        File file = new File(System.getProperty("user.dir") + "/ExtendReport");
        if (!file.exists()) {
            file.mkdir();
        }
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(Method method) {
        logger = extent.createTest(method.getName());
    }
    @Parameters("browser")
    @BeforeMethod(alwaysRun = true)
    public void setUp(String Browser) {
        if (Browser.equals("chrome"))  {
            WebDriverManager.chromedriver().setup();
            this.driver = new ChromeDriver();
        } else if (Browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            this.driver = new FirefoxDriver();
        }

        this.driver.manage().window().maximize();
    }


    @AfterMethod(alwaysRun = true)
    public void captureScreenShot(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            getScreenshot(driver, result.getMethod().getMethodName());
        }
    }

    public static String getScreenshot(WebDriver driver, String screenshotName) {
        if (driver == null) return ""; // Prevent NullPointerException

        String destination = "";
        try {
            String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            destination = System.getProperty("user.dir") + "/target/Screenshots/" + screenshotName + "_" + dateName + ".png";
            File finalDestination = new File(destination);
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            System.err.println("Screenshot capture failed: " + e.getMessage());
        }
        return destination;
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();

    }

    @AfterSuite(alwaysRun = true)
    public void close() {
        extent.flush();
    }

}
