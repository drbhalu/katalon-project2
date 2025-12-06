WebUI.openBrowser('')
WebUI.navigateToUrl('https://example.com')

WebUI.setText(findTestObject('Search/input_search'), 'laptop')
WebUI.click(findTestObject('Search/btn_search'))

WebUI.verifyElementPresent(findTestObject('Search/search_results'), 10)

WebUI.closeBrowser()
