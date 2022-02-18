
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MobileTest {
    @Test
    public void checkMobileTest(){
        System.setProperty("webdriver.chrome.driver" , "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://next.privat24.ua/mobile");
        //Номер телефона
        By phoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
        driver.findElement(phoneNumber).sendKeys("981000095");
        // Сумма
        By sumPayment = By.xpath("//input[@data-qa-node='amount']");
        driver.findElement(sumPayment).sendKeys("250");
        //Номер карты
        By numberCard = By.xpath("//input[@data-qa-node='numberdebitSource']");
        driver.findElement(numberCard).sendKeys("4506909324274797");
        // CVV
        By cvvdebitSource = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        driver.findElement(cvvdebitSource).sendKeys("327");
        // Срок действия
        By expiredebitSource = By.xpath("//input[@data-qa-node='expiredebitSource']");
        driver.findElement(expiredebitSource).sendKeys("06-22");
        //Имя
        By firstNamedebitSource = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        driver.findElement(firstNamedebitSource).sendKeys("Poerto");
        //Фамилия
        By lastNamedebitSource = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        driver.findElement(lastNamedebitSource).sendKeys("Rico");
        //Нажатие кнопки дальше
        driver.findElement(By.xpath("//button[@data-qa-node='submit']")).click();
        //Оплата
        driver.findElement(By.xpath(".//button[contains(text(), 'Сплатити')]")).click();



    }
}
