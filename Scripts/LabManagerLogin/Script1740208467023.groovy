import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://elogmanager.westindia.cloudapp.azure.com:8880/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('LoginObjects/Page_Sign In/input_SIGN IN_UserData.UserID'), 'UF001')

WebUI.setText(findTestObject('LoginObjects/Page_Sign In/input_SIGN IN_UserData.Password'), 'syn12345')

WebUI.selectOptionByLabel(findTestObject('LoginObjects/Page_Sign In/select_Choose.                                                    Admin                                                    Analyst                                                    Reviewer'), 
    'Admin', false)

WebUI.click(findTestObject('LoginObjects/Page_Sign In/button_SIGN IN'))

WebUI.click(findTestObject('LoginObjects/Page_eLabManager  Home/a_Hi Welcome Umar Farook'))

WebUI.click(findTestObject('LoginObjects/Page_eLabManager  Home/a_Sign Out'))

WebUI.closeBrowser()

