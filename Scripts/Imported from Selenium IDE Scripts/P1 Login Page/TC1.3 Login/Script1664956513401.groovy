import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium
import static com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium.*

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.Keys
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import static org.junit.Assert.*
import java.util.concurrent.Callable
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

'----------------------------------------------------'
'This test case script is generated by Katalon Studio'
'Generated date: 05-Oct-2022 03:55:13 PM'
'File path: C:\\Users\\raymart.bernardo\\Downloads\\ESBO_REVAMP - Part 1 - Login.Final.side'
'Generated by: raymart.bernardo@inplaymatrix.com'
'----------------------------------------------------'

String baseUrl = "https://esimbo-cld-hk-staging.imdgreat.com"

WebUI.openBrowser('')

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

"open | /login |  | "
selenium.open("/login", "")

"setWindowSize | 1936x1056 |  | "
// Method setWindowSize is not supported
// Method  is not supported
"click | xpath=//div[@id='root']/div/div/div[2]/div/div/div |  | click ddl_Language"
selenium.click("xpath=//div[@id='root']/div/div/div[2]/div/div/div")

"click | xpath=//div[@id='react-select-2-listbox']/div/div[2] |  | select li_Chinese"
selenium.click("xpath=//div[@id='react-select-2-listbox']/div/div[2]")

"click | xpath=//button |  | click btn_Login"
selenium.click("xpath=//button")

"verifyElementPresent | xpath=//p[contains(.,'用户名是必需的。')] |  | "
verifyTrue(selenium.isElementPresent("xpath=//p[contains(.,'用户名是必需的。')]"))

"verifyElementPresent | xpath=//p[contains(.,'用户名是必需的。')] |  | "
verifyTrue(selenium.isElementPresent("xpath=//p[contains(.,'用户名是必需的。')]"))

"click | xpath=//div[@id='root']/div/div/div[2]/div/div/div |  | click ddl_Language"
selenium.click("xpath=//div[@id='root']/div/div/div[2]/div/div/div")

"click | xpath=//div[3] |  | select li_Thai"
selenium.click("xpath=//div[3]")

"verifyElementPresent | xpath=//p[contains(.,'ชื่อผู้ใช้งาน นั้นต้องการ')] |  | "
verifyTrue(selenium.isElementPresent("xpath=//p[contains(.,'ชื่อผู้ใช้งาน นั้นต้องการ')]"))

"verifyElementPresent | xpath=//p[contains(.,'รหัสผ่าน นั้นต้องการ')] |  | "
verifyTrue(selenium.isElementPresent("xpath=//p[contains(.,'รหัสผ่าน นั้นต้องการ')]"))

"click | xpath=//div[@id='root']/div/div/div[2]/div/div/div |  | click ddl_Language"
selenium.click("xpath=//div[@id='root']/div/div/div[2]/div/div/div")

"click | xpath=//div[@id='react-select-2-listbox']/div/div |  | select li_English"
selenium.click("xpath=//div[@id='react-select-2-listbox']/div/div")

"verifyElementPresent | xpath=//p[contains(.,'User Name is required.')] |  | "
verifyTrue(selenium.isElementPresent("xpath=//p[contains(.,'User Name is required.')]"))

"verifyElementPresent | xpath=//p[contains(.,'Password is required.')] |  | "
verifyTrue(selenium.isElementPresent("xpath=//p[contains(.,'Password is required.')]"))
// Method  is not supported
"type | xpath=//input[@name='username'] | imqe | "
selenium.type("xpath=//input[@name='username']", "imqe")

"type | xpath=//input[@type='password'] | imqe | "
selenium.type("xpath=//input[@type='password']", "imqe")

"click | xpath=//button |  | click btn_Login"
selenium.click("xpath=//button")

"verifyElementPresent | xpath=//p[contains(.,'Invalid User Name or Password.')] |  | "
verifyTrue(selenium.isElementPresent("xpath=//p[contains(.,'Invalid User Name or Password.')]"))

"click | xpath=//div[@id='root']/div/div/div[2]/div/div/div |  | click ddl_Language"
selenium.click("xpath=//div[@id='root']/div/div/div[2]/div/div/div")

"click | xpath=//div[@id='react-select-2-listbox']/div/div[2] |  | select li_Chinese"
selenium.click("xpath=//div[@id='react-select-2-listbox']/div/div[2]")

"verifyElementPresent | xpath=//p[contains(.,'无效的用户名或密码。')] |  | "
verifyTrue(selenium.isElementPresent("xpath=//p[contains(.,'无效的用户名或密码。')]"))

"click | xpath=//div[@id='root']/div/div/div[2]/div/div/div |  | click ddl_Language"
selenium.click("xpath=//div[@id='root']/div/div/div[2]/div/div/div")

"click | xpath=//div[@id='react-select-2-listbox']/div/div[3] |  | select li_Thai"
selenium.click("xpath=//div[@id='react-select-2-listbox']/div/div[3]")

"verifyElementPresent | xpath=//p[contains(.,'ชื่อผู้ใช้หรือรหัสผ่านไม่ถูกต้อง')] |  | "
verifyTrue(selenium.isElementPresent("xpath=//p[contains(.,'ชื่อผู้ใช้หรือรหัสผ่านไม่ถูกต้อง')]"))
// Method  is not supported
"click | xpath=//div[@id='root']/div/div/div[2]/div/div/div |  | click ddl_Language"
selenium.click("xpath=//div[@id='root']/div/div/div[2]/div/div/div")

"click | xpath=//div[@id='react-select-2-listbox']/div/div |  | select li_English"
selenium.click("xpath=//div[@id='react-select-2-listbox']/div/div")

"type | xpath=//input[@name='username'] | imqc03 | "
selenium.type("xpath=//input[@name='username']", "imqc03")

"type | xpath=//input[@type='password'] | imqe | "
selenium.type("xpath=//input[@type='password']", "imqe")

"click | xpath=//button |  | click btn_Login"
selenium.click("xpath=//button")
// Method  is not supported
"type | xpath=//input[@name='username'] | imqc03 | "
selenium.type("xpath=//input[@name='username']", "imqc03")

"type | xpath=//input[@type='password'] | asdf1234 | "
selenium.type("xpath=//input[@type='password']", "asdf1234")

"click | xpath=//button |  | click btn_Login"
selenium.click("xpath=//button")