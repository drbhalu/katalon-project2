import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://example.com/register')

WebUI.setText(findTestObject('Register/input_name'), 'Hasnat')
WebUI.setText(findTestObject('Register/input_email'), 'hasnat@test.com')
WebUI.setEncryptedText(findTestObject('Register/input_password'), 'EncryptedPWD')

WebUI.click(findTestObject('Register/btn_register'))

WebUI.verifyElementText(findTestObject('Register/msg_success'), 'Registration Successful')

WebUI.closeBrowser()
