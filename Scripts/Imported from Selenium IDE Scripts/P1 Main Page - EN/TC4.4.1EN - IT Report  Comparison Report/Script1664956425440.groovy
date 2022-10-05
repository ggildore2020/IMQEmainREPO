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
'Generated date: 05-Oct-2022 03:53:45 PM'
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

"mouseOver | xpath=//div[@id='root']/div/div/div[3]/div[2]/div[2]/div[4]/div |  | mouse over btn_IT Report"
selenium.mouseOver("xpath=//div[@id='root']/div/div/div[3]/div[2]/div[2]/div[4]/div")

"verifyText | xpath=//div[@id='root']/div/div/div[3]/div[2]/div[2]/div[4]/div[2]/div/a/div | Comparison Report | verify text on btn_Comparison Report"
verifyEquals("Comparison Report", selenium.getText("xpath=//div[@id='root']/div/div/div[3]/div[2]/div[2]/div[4]/div[2]/div/a/div"))

"click | xpath=//div[@id='root']/div/div/div[3]/div[2]/div[2]/div[4]/div[2]/div/a/div |  | click btn_Comparison Report"
selenium.click("xpath=//div[@id='root']/div/div/div[3]/div[2]/div[2]/div[4]/div[2]/div/a/div")

"verifyText | css=.sc-ikJyIC > div | /reports/comparison-report | verify if btn_Comparison Report clicked"
verifyEquals("/reports/comparison-report", selenium.getText("css=.sc-ikJyIC > div"))
