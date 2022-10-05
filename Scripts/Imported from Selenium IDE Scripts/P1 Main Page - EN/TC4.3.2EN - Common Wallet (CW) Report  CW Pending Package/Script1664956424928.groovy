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
'Generated date: 05-Oct-2022 03:53:44 PM'
'File path: C:\\Users\\raymart.bernardo\\Downloads\\ESBO_REVAMP - Part 1 - Login.Final.side'
'Generated by: raymart.bernardo@inplaymatrix.com'
'----------------------------------------------------'

String baseUrl = "https://esimbo-cld-hk-staging.imdgreat.com"

WebUI.openBrowser('')

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

"open | / |  | "
selenium.open("/", "")

"click | xpath=//div[@id='root']/div/div/div[2]/div[2]/div |  | click btn_Reports"
selenium.click("xpath=//div[@id='root']/div/div/div[2]/div[2]/div")

"mouseOver | xpath=//div[@id='root']/div/div/div[3]/div[2]/div[2]/div[3]/div |  | mouse over on btn_Common Wallet (CW) Report"
selenium.mouseOver("xpath=//div[@id='root']/div/div/div[3]/div[2]/div[2]/div[3]/div")

"verifyText | xpath=//div[3]/div[2]/div[2]/a/div | CW Pending Package | verify text on btn_CW Pending Package"
verifyEquals("CW Pending Package", selenium.getText("xpath=//div[3]/div[2]/div[2]/a/div"))

"click | xpath=//div[3]/div[2]/div[2]/a/div |  | click btn_CW Pending Package"
selenium.click("xpath=//div[3]/div[2]/div[2]/a/div")

"verifyText | css=.sc-ikJyIC > div | /reports/cw-pending-package | verify if btn_CW Pending Package clicked"
verifyEquals("/reports/cw-pending-package", selenium.getText("css=.sc-ikJyIC > div"))
