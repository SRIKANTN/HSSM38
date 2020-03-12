package Com_ActiTime_Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Com_ActiTime_Generic.BaseTest;
import Com_ActiTime_Generic.ExcelData;
import com_ActiTime_Pages.actiTIMELoginPage;

public class InvalidLoginTest extends BaseTest
{
	@Test(priority = 2)
	public void InvalidLogin() throws InterruptedException
	{
		String etitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String eerror = ExcelData.getData(file_path, "TC02", 1, 2);
		actiTIMELoginPage lp = new actiTIMELoginPage(driver);
		lp.verifyTitle(etitle);
		int rc = ExcelData.getRowCount(file_path, "TC02");
		for(int i= 1; i<=rc; i++)
		{
			String un  = ExcelData.getData(file_path, "TC02", i, 0);
			String pw = ExcelData.getData(file_path, "TC02", i, 1);
			Reporter.log("User name ="+un,true);
			lp.EnterUserName(un);
			Reporter.log("Password ="+pw,true);
			lp.EnterPassword(pw);
			lp.ClickOnLoginButton();
			String aerror = lp.verifyErrorMSG();
			Assert.assertEquals(aerror, eerror);
			Thread.sleep(2000);
			Reporter.log("================================",true);
		}
	}

}
