WebUI.openBrowser('')
WebUI.navigateToUrl('https://example.com/login')

WebUI.setText(findTestObject('Login/input_email'), 'hasnat@test.com')
WebUI.setEncryptedText(findTestObject('Login/input_password'), 'EncryptedPWD')

WebUI.click(findTestObject('Login/btn_login'))

WebUI.verifyElementPresent(findTestObject('Dashboard/welcome_msg'), 10)

WebUI.closeBrowser()
