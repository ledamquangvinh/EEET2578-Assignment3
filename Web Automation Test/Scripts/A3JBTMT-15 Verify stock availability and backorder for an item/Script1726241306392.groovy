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

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/15/a_Enter the Store'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/15/img'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/15/td_K9-DL-01'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/15/a_K9-DL-01'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/15/a_EST-10'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/15/a_Add to Cart'))

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/15/input_true_EST-10'), '5069')

WebUI.sendKeys(findTestObject('Object Repository/Page_JPetStore Demo/15/input_true_EST-10'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/15/input_Sub Total 93,776.50_updateCartQuantities'))

WebUI.closeBrowser()

