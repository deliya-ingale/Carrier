package AppiumTest;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppiumBasics extends BaseTestClass {

	@Test
	public void Logintest() throws MalformedURLException{
    		
		driver.findElement(AppiumBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.findElement(AppiumBy.id("com.veritread.carrier.debug:id/textViewQA")).click();
		
	}
	
	

}
