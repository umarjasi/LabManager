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

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/CheckpointforMoodle'), true)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sandbox.moodledemo.net/')

WebUI.click(findTestObject('Object Repository/Checkpointswithdatadriven/Page_Home  Sandbox 4.5/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Checkpointswithdatadriven/Page_Log in to the site  Sandbox 4.5/input_Username_username'), 
    username)

WebUI.setText(findTestObject('Object Repository/Checkpointswithdatadriven/Page_Log in to the site  Sandbox 4.5/input_Password_password'), 
    password)

WebUI.click(findTestObject('Object Repository/Checkpointswithdatadriven/Page_Log in to the site  Sandbox 4.5/button_Log in'))

WebUI.verifyElementText(findTestObject('Object Repository/Checkpointswithdatadriven/Page_Home  Sandbox 4.5/span_AU'), expectedResult)

WebUI.click(findTestObject('Object Repository/Checkpointswithdatadriven/Page_Home  Sandbox 4.5/a_AU'))

WebUI.click(findTestObject('Object Repository/Checkpointswithdatadriven/Page_Home  Sandbox 4.5/a_Log out'))

WebUI.closeBrowser()

