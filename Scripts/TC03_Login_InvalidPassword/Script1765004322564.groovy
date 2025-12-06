WebUI.openBrowser('')
WebUI.navigateToUrl('https://example.com/login')

WebUI.setText(findTestObject('Login/input_email'), 'hasnat@test.com')
WebUI.setText(findTestObject('Login/input_password'), 'WrongPassword')

WebUI.click(findTestObject('Login/btn_login'))

WebUI.verifyElementText(findTestObject('Login/error_msg'), 'Invalid credentials')

WebUI.closeBrowser()
