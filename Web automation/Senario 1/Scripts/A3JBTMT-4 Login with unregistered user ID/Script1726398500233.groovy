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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://petstore.octoperf.com/')

WebUI.click(findTestObject('Object Repository/Page_JPetStore_LoginWithUnRegisterdUserID/p_Enter the Store'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore_LoginWithUnRegisterdUserID/a_Enter the Store'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore_LoginWithUnRegisterdUserID/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_JPetStore_LoginWithUnRegisterdUserID/input_Need a user name and password_username'), 'abc005')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_JPetStore_LoginWithUnRegisterdUserID/input_Need a user name and password_password'), 
    'HwXnxaZD17M=')

WebUI.click(findTestObject('Object Repository/Page_JPetStore_LoginWithUnRegisterdUserID/input_Need a user name and password_signon'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore_LoginWithUnRegisterdUserID/li_Invalid username or password.  Signon failed'))

WebUI.closeBrowser()

