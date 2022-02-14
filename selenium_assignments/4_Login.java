package CaseStudyPkg;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserAccess {

	static Properties prop;	
	public static void main(String[] args) throws IOException, InterruptedException {
			
			String PropertiesFileLoc ="C:\\java_project\\src\\main\\java\\SeleniumAssignments\\test data\\OrangeHRP.properties";
			FileInputStream fileLoc = new FileInputStream(PropertiesFileLoc);
			prop = new Properties();
			prop.load(fileLoc);
            System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			String  Name = prop.getProperty("username");
			String  Psword = prop.getProperty("password");
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Name);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Psword);
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/h1[1]")).isDisplayed();
		    System.out.println("Login success");
			driver.close();
		}

}

	
	


