package by.bestproger.project.downloadprice.runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class RunApp {
    final public static String pathDefault = "D:\\java\\myProject\\downloadprice\\";
    final public static String downloadPathDefault = pathDefault + "externalFiles\\downloadFiles\\";
    final public static String pathGoogleDriver = pathDefault + "externalFiles\\exe\\chromedriver.exe";

    public static ChromeDriver driver;

    public static void main(String[] args) {
        chromeDriver();
        driver.quit();
    }

    public static void chromeDriver() {
        System.setProperty("webdriver.chrome.driver", pathGoogleDriver);
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPathDefault);
        ChromeOptions options = new ChromeOptions();

        //если этот метод закомментить, то всё работает норм,
        // но этот метод нужен для установки пити загрузки файла
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.get("https://www.tut.by/");

    }
}
