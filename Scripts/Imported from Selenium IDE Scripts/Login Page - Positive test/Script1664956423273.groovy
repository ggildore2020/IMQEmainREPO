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
'Generated date: 05-Oct-2022 03:53:43 PM'
'File path: C:\\Users\\raymart.bernardo\\Downloads\\ESBO_REVAMP - Part 1 - Login.Final.side'
'Generated by: raymart.bernardo@inplaymatrix.com'
'----------------------------------------------------'

String baseUrl = "https://esimbo-cld-hk-staging.imdgreat.com"

WebUI.openBrowser('')

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

"open | /login | https://esimbo-cld-hk-staging.imdgreat.com/login | Open URL"
selenium.open("/login", "https://esimbo-cld-hk-staging.imdgreat.com/login")

"pause |  | 1000 | "
Thread.sleep("")

"click | xpath=//div[@id='root']/div/div/div[2]/div |  | Open ddl_Language"
selenium.click("xpath=//div[@id='root']/div/div/div[2]/div")

"click | css=.sc-jrQzAO |  | Open ddl_Language"
selenium.click("css=.sc-jrQzAO")

"click | id=react-select-2-option-1 |  | ddl_Chinese"
selenium.click("id=react-select-2-option-1")

"click | css=.sc-jrQzAO |  | Open ddl_Language"
selenium.click("css=.sc-jrQzAO")

"click | id=react-select-2-option-2 |  | ddl_Thai"
selenium.click("id=react-select-2-option-2")

"click | css=.sc-jrQzAO |  | Open ddl_Languange"
selenium.click("css=.sc-jrQzAO")

"click | id=react-select-2-option-0 |  | ddl_English"
selenium.click("id=react-select-2-option-0")

"click | css=.sc-jrQzAO |  | Open ddl_Language"
selenium.click("css=.sc-jrQzAO")

"click | css=.sc-jrQzAO |  | Open ddl_Language"
selenium.click("css=.sc-jrQzAO")

"click | name=username |  | Click txt_Username"
selenium.click("name=username")

"type | name=username | iMqC03 | Enter txt_Username"
selenium.type("name=username", "iMqC03")

"click | css=.sc-hKwDye |  | Click txt_Password"
selenium.click("css=.sc-hKwDye")

"type | css=.sc-hKwDye | asdf1234 | Enter txt_Password"
selenium.type("css=.sc-hKwDye", "asdf1234")

"click | css=.sc-bqiRlB |  | Click btn_Login"
selenium.click("css=.sc-bqiRlB")
