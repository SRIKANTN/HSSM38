package Com_ActiTime_Test;
import org.testng.annotations.Test;
import Com_ActiTime_Generic.BaseTest;
import Com_ActiTime_Generic.ExcelData;
import com_ActiTime_Pages.actiTIMEEnterTimeTrackPage;
import com_ActiTime_Pages.actiTIMELoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test(priority = 1)
	public void ValidLoginLogout()
	{
		//to take the data from excel (input.xlsx) file
		String un = ExcelData.getData(file_path, "TC01", 1, 0);
		String pw = ExcelData.getData(file_path, "TC01", 1, 1);
		String lgtitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String hptitle = ExcelData.getData(file_path, "TC01", 1, 3);
		//to creating object of pom class to call the methods present in the pom class 
		actiTIMELoginPage lp = new actiTIMELoginPage(driver);
		actiTIMEEnterTimeTrackPage hp = new actiTIMEEnterTimeTrackPage(driver);
		//to verify login page title
		lp.verifyTitle(lgtitle);
		//to enter valid user name
		lp.EnterUserName(un);
		//to enter valid password
		lp.EnterPassword(pw);
		//to click on login button
		lp.ClickOnLoginButton();
		//to  verify the time track page title
		lp.verifyTitle(hptitle);
		//to click on logout button
		hp.ClickOnLogoutButton();
		//to verify login page title
		lp.verifyTitle(lgtitle);
		
	}

}
