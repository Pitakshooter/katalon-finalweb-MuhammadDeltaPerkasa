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

WebUI.openBrowser('https://advantageonlineshopping.com/')

WebUI.click(findTestObject('Login/Page_Advantage Shopping/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.waitForElementPresent(findTestObject('Create new Account/Create new account button'), 0)

WebUI.click(findTestObject('Create new Account/Create new account button'))

WebUI.setText(findTestObject('Create new Account/Username create'), username)

WebUI.setText(findTestObject('Create new Account/Email'), email)

WebUI.setText(findTestObject('Create new Account/Password'), password)

WebUI.setText(findTestObject('Create new Account/Confirm Password'), confirmpassword)

WebUI.click(findTestObject('Create new Account/agree checkbox'))

WebUI.click(findTestObject('Create new Account/Registes Button'))

if (testType == 'N') {
    WebUI.verifyTextPresent(Notifgagal, false)
} else {
    WebUI.verifyElementPresent(findTestObject('Login/Page_Advantage Shopping/svg_CHECKOUT  (0.00)_menuUser'), 0)
}

WebUI.closeBrowser()

