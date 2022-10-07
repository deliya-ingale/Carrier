package AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTestClass {

	public AndroidDriver driver;
	@Test
	public void AppiumConfigure() throws MalformedURLException {
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Galaxy M20_Deliya");
		options.setApp("C:\\apkfiles\\AndroidApp.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		//System.out.println("Changes from jisha");
	}

}
