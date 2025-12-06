WebUI.openBrowser('')
WebUI.navigateToUrl('https://example.com')

WebUI.click(findTestObject('Menu/btn_cross'))
WebUI.verifyElementPresent(findTestObject('Pages/cross_title'), 5)

WebUI.click(findTestObject('Menu/btn_learn'))
WebUI.verifyElementPresent(findTestObject('Pages/learn_title'), 5)

WebUI.click(findTestObject('Menu/btn_connect'))
WebUI.verifyElementPresent(findTestObject('Pages/connect_title'), 5)

WebUI.closeBrowser()
