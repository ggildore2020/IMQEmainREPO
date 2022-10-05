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
import com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium as KatalonWebDriverBackedSelenium
import static com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium.*
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import static org.junit.Assert.*
import java.util.concurrent.Callable as Callable
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

'----------------------------------------------------'
String baseUrl = 'https://www.1652yabo.com:9976/'

WebUI.openBrowser('')

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

'open | http://sfminitransferwallet2.inplaymatrix.com/?token=a288da0e-264e-48d0-9e7d-8a32da2108e6&languageCode=en |  | '
selenium.open('http://sfminitransferwallet2.inplaymatrix.com/?token=a288da0e-264e-48d0-9e7d-8a32da2108e6&languageCode=en')

// Method  is not supported
'//selectFrame | index=0 |  | '

// Method //selectFrame is not supported
'storeText | css=.row:nth-child(1) > .text-right | initialwallet | '
String initialwallet = selenium.getText('css=.row:nth-child(1) > .text-right')

'executeScript | return String (initialwallet).replace(\',\',\'\') | initialwallet1 | '

// Method executeScript is not supported
'click | css=#eventListingHeader_3_1 .icon-fi-arrow-down1 |  | '
selenium.click('css=#eventListingHeader_3_1 .icon-fi-arrow-down1')

// Method  is not supported
'click | xpath=//div[2]/div/div/div[3]/div/span |  | '
selenium.click('xpath=//div[2]/div/div/div[3]/div/span')

'waitForElementVisible | name=stake_amount | 30000 | '
Method(waitForElementVisible).is(not).found

'type | css=[name=\'stake_amount\'] | 5 | '
selenium.type('css=[name=\'stake_amount\']', '5')

'click | xpath=//div[@class=btn_placebet_action] |  | '
selenium.click('xpath=//div[@class=\'btn_placebet_action\']')

'waitForElementPresent | css=.bet_status | 30000 | '
selenium.waitFor({ 
        selenium.isElementPresent('css=.bet_status')
    })

'waitForElementPresent | id=sample_placebet_single_confirm | 30000 | '
selenium.waitFor({ 
        selenium.isElementPresent('id=sample_placebet_single_confirm')
    })

'click | id=sample_placebet_single_confirm |  | '
selenium.click('id=sample_placebet_single_confirm')

'storeText | css=.row:nth-child(1) > .text-right | postbetwallet | '
String postbetwallet = selenium.getText('css=.row:nth-child(1) > .text-right')

'executeScript | return String (postbetwallet).replace(\',\',\'\') | postbetwallet1 | '

// Method executeScript is not supported
// Method  is not supported
'executeScript | return initialwallet1 -  5 | postvalue | '

// Method executeScript is not supported
'echo | postvalue |  | '
System.out.println(postvalue)

'store | postvalue | amount | '
String amount = postvalue

'executeScript | return Number (amount).toFixed(2) | finalamount | '

// Method executeScript is not supported
'echo | finalamount |  | '
System.out.println(finalamount)

'verify | finalamount | postbetwallet1 | '
Method(verify).is(not).found

// Method  is not supported
'click | css=#leftpanel_mybet .sports_menu_header |  | '
selenium.click('css=#leftpanel_mybet .sports_menu_header')

'click | css=.active > .tab_label |  | '
selenium.click('css=.active > .tab_label')

'click | css=.switch |  | '
selenium.click('css=.switch')

'storeText | css=.bet_slip:nth-child(2) .price > span:nth-child(2) | covalue | '
String covalue = selenium.getText('css=.bet_slip:nth-child(2) .price > span:nth-child(2)')

'executeScript | return String (covalue).replace(\',\',\'\') | covalue1 | '

// Method executeScript is not supported
'click | css=.bet_slip:nth-child(2) .bt_price |  | '
selenium.click('css=.bet_slip:nth-child(2) .bt_price')

'click | css=.bet_slip:nth-child(2) .bt_price |  | '
selenium.click('css=.bet_slip:nth-child(2) .bt_price')

'waitForElementPresent | css=.bt_info > .success | 30000 | '
selenium.waitFor({ 
        selenium.isElementPresent('css=.bt_info > .success')
    })

'pause | 3000 |  | '
Thread.sleep('3000')

'storeText | css=.row:nth-child(1) > .text-right | aftercashoutwallet | '
String aftercashoutwallet = selenium.getText('css=.row:nth-child(1) > .text-right')

'executeScript | return String (aftercashoutwallet).replace(\',\',\'\') | aftercashoutwallet1 | '

// Method executeScript is not supported
'echo | aftercashoutwallet1 |  | '
System.out.println(aftercashoutwallet1)

// Method  is not supported
'executeScript | return Number (postbetwallet1) + Number (covalue1) | coamount | '

// Method executeScript is not supported
'echo | coamount |  | '
System.out.println(coamount)

'store | coamount | walletamount | '
String walletamount = coamount

'executeScript | return Number (walletamount).toFixed(2) | finalwalletamount | '

// Method executeScript is not supported
'echo | finalwalletamount |  | '
System.out.println(finalwalletamount)

'verify | finalwalletamount | aftercashoutwallet1 | '
Method(verify).is(not).found

