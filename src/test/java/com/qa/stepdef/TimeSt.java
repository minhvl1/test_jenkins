package com.qa.stepdef;
import com.fasterxml.uuid.Generators;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TimeSt {
    WebDriver driver;

    public String timeStamp() {
        return String.valueOf(Generators.timeBasedGenerator().generate());
    }


}
