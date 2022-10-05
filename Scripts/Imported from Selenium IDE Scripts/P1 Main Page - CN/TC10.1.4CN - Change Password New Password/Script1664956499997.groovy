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
'Generated date: 05-Oct-2022 03:54:59 PM'
'File path: C:\\Users\\raymart.bernardo\\Downloads\\ESBO_REVAMP - Part 1 - Login.Final.side'
'Generated by: raymart.bernardo@inplaymatrix.com'
'----------------------------------------------------'

String baseUrl = "https://esimbo-cld-hk-staging.imdgreat.com"

WebUI.openBrowser('')

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

"open | / |  | "
selenium.open("/", "")

"click | xpath=//div[@id='root']/div/div/div[5]/div[2] |  | click btn_User menu"
selenium.click("xpath=//div[@id='root']/div/div/div[5]/div[2]")

"click | xpath=//div[@id='root']/div/div/div[6]/div[3]/div/div |  | click btn_Change Password"
selenium.click("xpath=//div[@id='root']/div/div/div[6]/div[3]/div/div")

"verifyText | xpath=//form/div[2]/div[3]/div | 新密码 | verify text on lbl_New Password"
verifyEquals("新密码", selenium.getText("xpath=//form/div[2]/div[3]/div"))

"verifyEditable | xpath=//input[@name='newPassword'] |  | verify if txt_New Password is editable"
verifyTrue(selenium.isEditable("xpath=//input[@name='newPassword']"))

"verifyElementPresent | xpath=//input[@placeholder='新密码'] |  | verify text on txt_New Password"
verifyTrue(selenium.isElementPresent("xpath=//input[@placeholder='新密码']"))

"mouseOver | xpath=//input[@name='newPassword'] |  | mouse over txt_New Password"
selenium.mouseOver("xpath=//input[@name='newPassword']")

"click | xpath=//input[@name='newPassword'] |  | click txt_New Password"
selenium.click("xpath=//input[@name='newPassword']")

"click | xpath=//form |  | click outside of the txt_New Password"
selenium.click("xpath=//form")

"verifyText | css=.sc-iFMAIt | 新密码不能为空。 | verify if 'New Password cannot be blank.' is presented and correct"
verifyEquals("新密码不能为空。", selenium.getText("css=.sc-iFMAIt"))

"type | xpath=//input[@name='newPassword'] | asdf123 | type asdf123 on txt_New Password"
selenium.type("xpath=//input[@name='newPassword']", "asdf123")

"verifyText | css=.sc-iFMAIt | 必须至少为 8 个字符。 | verify if 'Must be at least 8 characters.' is presented and correct."
verifyEquals("必须至少为 8 个字符。", selenium.getText("css=.sc-iFMAIt"))

"type | xpath=//input[@name='newPassword'] | ASDF!@#$ | type  ASDF!@#$ on txt_New Password"
selenium.type("xpath=//input[@name='newPassword']", "ASDF!@#$")

"verifyText | xpath=//div[2]/div[3]/div[3] | 密码不符合密码策略要求。 | verify if 'The password does not meet the password policy requirements.' is presented and correct."
verifyEquals("密码不符合密码策略要求。", selenium.getText("xpath=//div[2]/div[3]/div[3]"))

"type | xpath=//input[@name='oldPassword'] | asdf1234 | type asdf1234 on txt_Current Password"
selenium.type("xpath=//input[@name='oldPassword']", "asdf1234")

"type | xpath=//input[@name='newPassword'] | asdf1234 | type asdf1234 on txt_New Password"
selenium.type("xpath=//input[@name='newPassword']", "asdf1234")

"verifyText | xpath=//div[2]/div[3]/div[3] | 当前密码和新密码不能相同。 | verify if 'Current Password and New Password can’t be the same.' is presented and correct."
verifyEquals("当前密码和新密码不能相同。", selenium.getText("xpath=//div[2]/div[3]/div[3]"))
