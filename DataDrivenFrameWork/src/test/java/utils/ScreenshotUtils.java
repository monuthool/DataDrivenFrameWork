package utils;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtils {

    public static void captureScreenshot(WebDriver driver, String fileName) {

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("screenshots/" + fileName + ".png");
            FileHandler.copy(src, dest);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}