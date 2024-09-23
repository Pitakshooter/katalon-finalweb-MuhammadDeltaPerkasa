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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Login/Page_Advantage Shopping/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Advantage Shopping/input_OR_username'), username)

WebUI.setText(findTestObject('Object Repository/Login/Page_Advantage Shopping/input_Username_password'), password)

WebUI.click(findTestObject('Object Repository/Login/Page_Advantage Shopping/button_SIGN IN'))

if (testType == 'P') {
    WebUI.verifyElementPresent(findTestObject('Login/Page_Advantage Shopping/User'), 0)

    WebUI.verifyElementPresent(findTestObject('Login/Page_Advantage Shopping/Logout Button'), 0)
} else {
    WebUI.verifyElementText(findTestObject('Login/Page_Advantage Shopping/Notif login gagal'), expectedErrorMessage)
}

WebUI.closeBrowser()

