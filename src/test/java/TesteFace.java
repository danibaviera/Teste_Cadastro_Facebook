import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TesteFace {
    public static void main(String[] args) {
        //configura selenium
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Positivo\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //configura tempo geral
        //drive.manager().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibility0fElementlocated(By.xpath("h1")));

        driver.get("https://www.facebook.com/r.php?locale=pt_br ");

        // preenche campo cadastro
        driver.findElement(By.name("firstname")).sendKeys("Danieli");
        driver.findElement(By.name("lastname")).sendKeys( "Baviera");
        driver.findElement(By.name("reg_email__")).sendKeys("Dani@hotmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys( "Dani@hotmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123908abc");

        WebElement campoDia = driver.findElement(By.id("day"));
        Select select = new Select(campoDia);
        select.selectByVisibleText("16");

        WebElement campoMes = driver.findElement(By.id("month"));
        select = new Select(campoMes);
        select.selectByVisibleText("Jul");

        WebElement campoAno = driver.findElement(By.id("year"));
        select = new Select(campoAno);
        select.selectByVisibleText("1995");

        driver.findElement(By.xpath("//*[contains(text(),'Feminino')]")).click();
        driver.findElement(By.name("websubmit")).click();
        //driver.findElement(By.xpath("//*[contains(text(),'Cadastre-se')]")).submit();

        //driver.findElement(By.id("u_0_14_lj")).submit();
    }
}

