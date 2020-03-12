package Com_ActiTime_Generic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowUtility 
{
	/***
	 * 
	 * @author srikanth
	 * @category To handle the window popup by using singleton class 
	 */
	public static void windowPopup(String file_path)
	{
		try
		{
		Runtime.getRuntime().exec(file_path);
		}
		catch (Exception e) {
		}
	}
	/***
	 * 
	 * @author srikanth
	 * @category To Switch form one window to anther window or one tab to 
	 * anther tab using switchwindow method
	 * @methods to get the address of all the windows or tabs by using getwindowhandels()
	 * to switch form  one window to anther window or one tab to anther tab by 
	 * using statement(driver.switchTo().window()
	 */
	
	public static void Switchwindow(WebDriver driver,String etitle)
	{
		Set<String> allwin = driver.getWindowHandles();
		Iterator<String> itr = allwin.iterator();
		while (itr.hasNext())
		{
			String win = itr.next();
			driver.switchTo().window(win);
			if(driver.getTitle().equals(etitle))
			{
				break;
			}
		}
		
		
	}
}
