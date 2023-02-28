import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitAutomation {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.findElement(By.id("customer.firstName")).sendKeys("Humayra");
        driver.findElement(By.name("customer.lastName")).sendKeys("Himi");
        driver.findElement(By.id("customer.address.street")).sendKeys("concordia");
        driver.findElement(By.cssSelector("input[name=\"customer.address.city\"]")).sendKeys("Quebec");
        driver.findElement(By.cssSelector("input[id=\"customer.address.state\"]")).sendKeys("Montreal");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("2329781");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("5675433333");
        driver.findElement(By.id("customer.ssn")).sendKeys("1212");
        driver.findElement(By.cssSelector("input[id=\"customer.username\"]")).sendKeys("Humayra");
        driver.findElement(By.cssSelector("input[name=\"customer.password\"]")).sendKeys("00000");
        driver.findElement(By.id("repeatedPassword")).sendKeys("0000");
        driver.findElement(By.cssSelector("input[value=\"Register\"]")).click();



    }



}
