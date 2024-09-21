package calculator
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import static org.junit.Assert.assertEquals;


class StepDefinition {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// @Given("I want to write a step with (.*)")
	// def I_want_to_write_a_step_with_name(String name) {
	// 	println name
	// }

	// @When("I check for the (\\d+) in step")
	// def I_check_for_the_value_in_step(int value) {
	// 	println value
	// }

	// @Then("I verify the (.*) in step")
	// def I_verify_the_status_in_step(String status) {
	// 	println status
	// }
	Calculator calculator;
	int res;
	long resLong;
	double resDouble;
	String exceptionStr;

	@Given("I run the code")
	public void iRunTheCode() {
		calculator = new Calculator();
	}

	@When("{int} plus {int}")
	public void aPlusB(int a, int b) {
		res = calculator.add(a, b);
	}

	@When("{int} minus {int}")
	public void minus(Integer a, Integer b) {
		res = calculator.subtract(a, b);
	}

	@When("{int} multiply {int}")
	public void multiply(Integer a, Integer b) {
		resLong = calculator.multiply(a, b);
	}

	@When("{int} divide {int}")
	public void divide(Integer a, Integer b) {
		resDouble = calculator.divide(a, b);
	}

	@When("{int} modulus {int}")
	public void aModulusB(Integer a, Integer b) {
		resDouble = calculator.modulus(a, b);
	}

	@When("{int} to the power of {int}")
	public void power(Integer a, Integer b) {
		resDouble = calculator.power(a, b);
	}

	@When("{int} gcd {int}")
	public void gcd(Integer a, Integer b) {
		res = calculator.gcd(a, b);
	}

	@When("{int} lcm {int}")
	public void lcm(Integer a, Integer b) {
		res = calculator.lcm(a, b);
	}

	@When("fibonacci number of {int}")
	public void fibonacci(Integer a) {
		resLong = calculator.fibonacci(a);
	}

	@Then("I get the result {int}")
	public void iGetTheResultResultInDouble(int answer) {
		assertEquals(res, answer);
	}

	@Then("I get the result {double} in Double")
	public void iGetTheResultResultInDouble(double answer) {
		assertEquals(resDouble, answer, 0.1);
	}

	@Then("I get the result {double} in Double with {int}")
	public void iGetTheResultResultInDouble(double answer, int precision) {
		assertEquals(resDouble, answer, precision);
	}

	@Then("I get the result {long} in Long")
	public void iGetTheResultResultInLong(long answer) {
		assertEquals(resLong, answer);
	}

	@When("illegal {int} to the power of {int}")
	public void illegalPower(Integer a, Integer b) {
		try {
			resDouble = calculator.power(a, b);
		} catch (RuntimeException e) {
			exceptionStr = e.getMessage();
		}
	}

	@When("{int} illegal divide {int}")
	public void aIllegalDivideB(Integer a, Integer b) {
		try {
			resDouble = calculator.divide(a, b);
		} catch (RuntimeException e) {
			exceptionStr = e.getMessage();
		}
	}

	@When("{int} illegal modulus {int}")
	public void aIllegalModulusB(Integer a, Integer b) {
		try {
			resDouble = calculator.modulus(a, b);
		} catch (RuntimeException e) {
			exceptionStr = e.getMessage();
		}
	}

	@When("{int} illegal gcd {int}")
	public void aIllegalGCDB(Integer a, Integer b) {
		try {
			resDouble = calculator.gcd(a, b);
		} catch (RuntimeException e) {
			exceptionStr = e.getMessage();
		}
	}

	@When("{int} illegal lcm {int}")
	public void aIllegalLCMB(Integer a, Integer b) {
		try {
			resDouble = calculator.lcm(a, b);
		} catch (RuntimeException e) {
			exceptionStr = e.getMessage();
		}
	}

	@When("illegal fibonacci number of {int}")
	public void aIllegalFibonacci(Integer a) {
		try {
			resDouble = calculator.fibonacci(a);
		} catch (RuntimeException e) {
			exceptionStr = e.getMessage();
		}
	}

	@Then("I get the Exception {string}")
	public void iGetTheException(String exceptionRes) {
		assertEquals(exceptionStr, exceptionRes);
	}
}