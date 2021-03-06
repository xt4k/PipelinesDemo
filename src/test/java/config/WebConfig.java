package config;

import org.aeonbits.owner.Config;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;

@Config.Sources("classpath:${env}.properties")
public interface WebConfig extends Config {

    @Key("enable.vnc")
    @DefaultValue("false")
    boolean isEnableVnc( );

    @Key("enable.video")
    @DefaultValue("false")
    boolean isEnableVideo( );

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser( );

    @Key("browser.version")
    @DefaultValue("90")
    String getBrowserVersion( );

    @Key("base.url")
    @DefaultValue("https://demoqa.com/automation-practice-form")
    String getBaseUrl( );

    @Key("remote.driver")
    String getRemoteDriver( );


}
