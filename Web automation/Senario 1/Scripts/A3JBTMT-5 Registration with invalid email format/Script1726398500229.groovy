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

WebUI.click(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/a_Enter the Store'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/a_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/a_Register Now'))

WebUI.setText(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/input_User ID_username'), 'abc000')

WebUI.setText(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/input_New password_password'), 'abc123')

WebUI.setText(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/input_Repeat password_repeatedPassword'), 'abc123')

WebUI.setText(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/input_First name_account.firstName'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/input_Last name_account.lastName'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/input_Email_account.email'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/input_Phone_account.phone'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/input_Address 1_account.address1'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/input_Address 2_account.address2'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/input_City_account.city'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/input_State_account.state'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/input_Zip_account.zip'), '100000')

WebUI.setText(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/input_Country_account.country'), 'abc')

WebUI.click(findTestObject('Object Repository/Page_JPetStore_RegistrationWithInvalidEmailFormat/input_Enable MyBanner_newAccount'))

WebUI.closeBrowser()

