import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver x = new ChromeDriver();
        x.manage().window().maximize();
        x.get("https://selise.selise.club/app/auth/login?returnUrl=%2Fhome");
        //x.findElement(By.xpath("//button[@class=\"google mat-raised-button mat-button-base\"]")).click();
        x.findElement(By.xpath("//input[@formcontrolname=\"email\"]")).sendKeys("humayra.himi@selise.ch");
        x.findElement(By.xpath("//input[@formcontrolname=\"password\"]")).sendKeys("Humayra1*");
        x.findElement(By.xpath("//mat-checkbox[@formcontrolname=\"remember_me\"]")).click();
        x.findElement(By.xpath("//button[@data-cy=\"login\"]")).click();
        Thread.sleep(3000);
        x.findElement(By.xpath("//input[@tabindex='0']")).click();
        x.findElement(By.xpath("//div[@class=\"ql-editor ql-blank\"]")).sendKeys("good afternoon");
        Thread.sleep(3000);
        x.findElement(By.xpath("//button[@data-cy=\"cancelPost\"]")).click();



    }
}
