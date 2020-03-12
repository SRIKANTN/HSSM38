package Com_ActiTime_Generic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class GenericUtils 
{
	/***
	 * 
	 * @author srikanth
	 * @category take screen shot
	 * @
	 */
	public static void getScreenShot(WebDriver driver,String name)
	{
		SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yyyy");
		String date = s1.format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/"+date+"-"+name+".png");
		try 
		{
			Files.copy(src, dest);
		} 
		catch (IOException e)
		{
		}
		
//		try 
//		{
//			Files.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./ScreenShot/"+date+"-"+name+".png"));
//		} catch (Exception e) 
//		{
//		}
//		}
	}

}
